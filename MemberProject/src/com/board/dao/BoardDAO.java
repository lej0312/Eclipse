package com.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.board.dto.BoardDTO;
import com.board.dto.CommentDTO;


public class BoardDAO {
	//디비셋팅
	private static BoardDAO instance = new BoardDAO();
	public static BoardDAO getInstance() {
		return instance;
	}
	private Connection getConnection() throws Exception{
		Context initCtx = new InitialContext();
		Context envCtx = (Context) initCtx.lookup("java:comp/env");
		DataSource ds = (DataSource) envCtx.lookup("jdbc/jsp"); 
		return ds.getConnection();
	}
	//추가
	public void boardInsert(BoardDTO board) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		//부모글
		int num = board.getNum();
		int ref = board.getRef();
		int re_step = board.getRe_step();
		int re_level = board.getRe_level();
		
		int number=0; //ref 결정시 사용
		
		try {
			con = getConnection();
			ps = con.prepareStatement("select max(num) from board");
			rs = ps.executeQuery();
			if(rs.next()) { //테이블에 데이터가 있다면 num의 최대값을 ref로 사용
				number = rs.getInt(1)+1;
			}else { //테이블에 데이터가 하나도 없을때 ref를 1로 사용
				number=1;
			}
			if(num!=0) { //댓글
				String sql = "update board set re_step = re_step+1 where ref=? and re_step >?";
				ps = con.prepareStatement(sql);
				ps.setInt(1, ref);
				ps.setInt(2, re_step);
				ps.executeUpdate(); //기존 데이터 re_step 변경
				
				re_step = re_step+1; //부모 re_step에서 +1 => 새로 들어갈 데이터의 re_step 결정
				re_level = re_level+1; //부모 re_level에서 +1 => 새로 들어갈 데이터의 re_level 결정
				
			}else { //새글
				ref = number;
				re_step = 0;
				re_level = 0;
			}
			
			StringBuilder sb = new StringBuilder();
			sb.append("insert into board");
			sb.append("(num,writer,subject,email,content,ip,");
			sb.append(" ref, re_step, re_level, passwd )");
			sb.append(" values(board_seq.nextval, ?,?,?,?,?,?,?,?,?)");
			ps = con.prepareStatement(sb.toString());
			ps.setString(1, board.getWriter());
			ps.setString(2, board.getSubject());
			ps.setString(3, board.getEmail());
			ps.setString(4, board.getContent());
			ps.setString(5, board.getIp());
			ps.setInt(6, ref);
			ps.setInt(7, re_step);
			ps.setInt(8, re_level);
			ps.setString(9, board.getPasswd());
			ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection(con, ps, null, null);
		}
	}
	
	//전체보기
	public ArrayList<BoardDTO> boardList(String field, String word, int startRow, int endRow){
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ArrayList<BoardDTO> arr = new ArrayList<>();
		
		try {
			con = getConnection();
			StringBuilder sb = new StringBuilder();
			//String sql = "select * from board";
			
			if(word.equals("")) {//검색아님
				sb.append("select * from (") ;
				sb.append(" select rownum rn, aa.* from (");
				sb.append(" select * from board ");
				sb.append(" order by ref desc, re_step asc) aa");
				sb.append(" where rownum <=? ");
				sb.append(") where rn >= ?");
			}else {//검색
				sb.append("select * from (") ;
				sb.append(" select rownum rn, aa.* from (");
				sb.append(" select * from board where "+field +" like '%"+word+"%'");
				sb.append(" order by ref desc, re_step asc) aa");
				sb.append(" where rownum <=? ");
				sb.append(") where rn >= ?");
			}
			
			ps = con.prepareStatement(sb.toString());
			ps.setInt(1, endRow);
			ps.setInt(2, startRow);
			rs = ps.executeQuery();
			while(rs.next()) {
				BoardDTO board = new BoardDTO();
				board.setNum(rs.getInt("num"));
				board.setSubject(rs.getString("subject"));
				board.setWriter(rs.getString("writer"));
				board.setReg_date(rs.getString("reg_date"));
				board.setReadcount(rs.getInt("readcount"));
				arr.add(board);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection(con, ps, null, rs);
		}
		return arr;
	}
	
	//상세보기
	public BoardDTO boardView(int num) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		BoardDTO board = null;
		String sql = ""; //sql 두번 사용하기 위해 여기에 선언함
		
		try {
			con = getConnection();
			st = con.createStatement(); //sql업데이트 하기 위해 위에 써줌
			sql = "update board set readcount=readcount+1 where num="+num;
			st.executeUpdate(sql); 
			sql = "select * from board where num="+num;
			rs = st.executeQuery(sql);
			if(rs.next()) {
				board = new BoardDTO();
				board.setContent(rs.getString("content")); //위치값으로 접근시 content 대신 5사용 가능
				board.setEmail(rs.getString("email"));
				board.setIp(rs.getString("ip"));
				board.setNum(rs.getInt("num"));
				board.setPasswd(rs.getString("passwd"));
				board.setRe_level(rs.getInt("re_level"));
				board.setRe_step(rs.getInt("re_step"));
				board.setRef(rs.getInt("ref"));
				board.setSubject(rs.getString("subject"));
				board.setWriter(rs.getString("writer"));
				board.setReg_date(rs.getString("reg_date"));
				board.setReadcount(rs.getInt("readcount"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection(con, null, st, rs);
		}
		return board;
	}
	
	//삭제
	public int boardDelete(int num) {
		Connection con = null;
		Statement st = null;
		int flag = 0;
		
		try {
			con = getConnection();
			String sql = "delete from board where num="+num;
			st = con.createStatement();
			flag = st.executeUpdate(sql); //삭제된 행의 수=>1
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection(con, null, st, null);
		}
		return flag;
	}
	
	//개수
	public int boardCount(String field, String word) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		int count = 0;
		String sql="";
		
		try {
			con = getConnection();
			st = con.createStatement();
			if(word.equals("")) {//검색아님
				sql = "select count(*) from board";
			}else {//검색
				sql = "select count(*) from board where "+ field +" like '%"+word+"%'";
			}
			rs = st.executeQuery(sql);
			if (rs.next()) {
				count = rs.getInt(1); //컬럼명이 없어서 위치값으로 접근
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection(con, null, st, rs);
		}
		return count;
	}
	
	//수정하기 (비번이 맞을때만 수정)
	public int boardUpdate(BoardDTO board) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int flag = 0;
		String sql = "";
		
		try {
			con = getConnection();
			sql="select passwd from board where num="+board.getNum();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()) { //비번 구해오기
				if(rs.getString(1).equals(board.getPasswd())) {//비번 맞음
					sql="update board set subject=?, email=?, content=?, ip=?, reg_date=sysdate where num=?";
					ps = con.prepareStatement(sql);
					ps.setString(1, board.getSubject());
					ps.setString(2, board.getEmail());
					ps.setString(3, board.getContent());
					ps.setString(4, board.getIp());
					ps.setInt(5, board.getNum());
					flag = ps.executeUpdate();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection(con, ps, null, null);
		}
		return flag;
	}
	
	//comment insert
	public void commentInsert(CommentDTO comment) {
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con=getConnection();
			String sql = "insert into commentboard values(commentboard_seq.nextval,?,?,?,sysdate)";
			ps = con.prepareStatement(sql);
			ps.setString(1, comment.getMsg());
			ps.setInt(2, comment.getBnum());
			ps.setString(3, comment.getUserid());
			ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection(con, ps, null, null);
		}
	}
	
	//comment 전체보기
	public ArrayList<CommentDTO> commentList(int bnum){
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		ArrayList<CommentDTO> carr = new ArrayList<>();
		
		try {
			con = getConnection();
			String sql = "select * from commentboard where bnum ="+bnum+" order by cnum desc";
			System.out.println(sql);
			st = con.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()) {
				CommentDTO comment = new CommentDTO();
				comment.setBnum(rs.getInt("bnum"));
				comment.setCnum(rs.getInt("cnum"));
				comment.setMsg(rs.getString("msg"));
				comment.setRegdate(rs.getString("regdate"));
				comment.setUserid(rs.getString("userid"));
				carr.add(comment);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection(con, null, st, rs);
		}
		return carr;
	}
	
	//닫기
	private void closeConnection(Connection con,  
			PreparedStatement ps, Statement st, ResultSet rs) {
		try {
			if(rs!=null) rs.close();
			if(st!=null) st.close();
			if(ps!=null) ps.close();
			if(con!=null) con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
