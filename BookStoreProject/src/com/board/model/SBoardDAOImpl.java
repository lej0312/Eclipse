package com.board.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;


public class SBoardDAOImpl implements SBoardDAO{
	//������
	private static SBoardDAO instance = new SBoardDAOImpl();
	public static SBoardDAO getInstance() {
		return instance;
	}

	private Connection getConnection() throws Exception {
		Context initCtx = new InitialContext();
		Context envCtx = (Context) initCtx.lookup("java:comp/env");
		DataSource ds = (DataSource) envCtx.lookup("jdbc/jsp");
		return ds.getConnection();
	}
	
	//��
	@Override
	public void boardInsert(BoardDTO board) {
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = getConnection();
			String sql="insert into simpleboard "
					+ " values(simpleboard_seq.nextval,?,?,?,sysdate,0,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, board.getSubject());
			ps.setString(2, board.getEmail());
			ps.setString(3, board.getContent());
			ps.setString(4, board.getUserid());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeConnection(con, ps, null, null);
		}
	}

	//����
	@Override
	public void boardUpdate(BoardDTO board) {
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = getConnection();
			String sql="update simpleboard set email=?, subject=?, content=?, regdate=sysdate where num=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, board.getEmail());
			ps.setString(2, board.getSubject());
			ps.setString(3, board.getContent());
			ps.setInt(4, board.getNum());
			ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection(con, ps, null, null);
		}
	}

	//��ü����
	@Override
	public ArrayList<BoardDTO> boardList(int startRow, int endRow, String field, String word) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ArrayList<BoardDTO> arr = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		
		try {
			con = getConnection();
			sb.append("select * from (");
			sb.append("select rownum rn, aa.* from (");
			sb.append("select * from simpleboard where "+field +" like '%"+word+"%'");
			sb.append(" order by num desc) aa" );
			sb.append(" where rownum <= ? ");
			sb.append(") where rn >= ?");
			
		//System.out.println(sb.toString());
		ps = con.prepareStatement(sb.toString());
		ps.setInt(1, endRow);
		ps.setInt(2, startRow);
		rs = ps.executeQuery();
			
			while(rs.next()) {
				BoardDTO board = new BoardDTO();
				board.setContent(rs.getString("content"));
				board.setEmail(rs.getString("email"));
				board.setNum(rs.getInt("num"));
				board.setReadcount(rs.getInt("readcount"));
				board.setSubject(rs.getString("subject"));
				board.setUserid(rs.getString("userid"));
				board.setRegdate(rs.getString("regdate"));
				arr.add(board);
    		}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeConnection(con, ps, null, rs);
		}
		return arr;
	}

	//����
	@Override
	public int boardDelete(int num) {
		Connection con = null;
		Statement st = null;
		int flag = 0; //������ �ȵǸ� 0, 0�� �ƴѰ� => ��������
		
		try {
			con = getConnection();
			String sql = "delete from simpleboard where num="+num;
			st = con.createStatement();
			flag = st.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection(con, null, st, null);
		}
		return flag;
	}

	//����
	@Override
	public int boardCount(String field, String word) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		int count = 0;
		
		try {
			con = getConnection();
			String sql="select count(*) from simpleboard where "+field +" like '%"+word+"%'";
			st = con.createStatement();
			rs = st.executeQuery(sql);
			if(rs.next()) {
				count = rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeConnection(con, null, st, rs);
		}
		return count;
	}
	
	//�󼼺���
	@Override
	public BoardDTO findByNum(int num) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		BoardDTO board = null;
		String sql="";
		
		try {
			con = getConnection();
			st = con.createStatement();
			sql = "update simpleboard set readcount = readcount+1 where num="+num;
			st.executeUpdate(sql);
			sql = "select * from simpleboard where num="+num;
			rs= st.executeQuery(sql);
			if(rs.next()) {
				 board = new BoardDTO();
				board.setContent(rs.getString("content"));
				board.setEmail(rs.getString("email"));
				board.setNum(rs.getInt("num"));
				board.setReadcount(rs.getInt("readcount"));
				board.setSubject(rs.getString("subject"));
				board.setUserid(rs.getString("userid"));
				board.setRegdate(rs.getString("regdate"));
			
    		}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeConnection(con, null, st, rs);
		}
		return board;
	
	}

	//���
	@Override
	public ArrayList<CommentDTO> findAllComment(int bnum) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		ArrayList<CommentDTO> carr = new ArrayList<>();
		
		try {
			con = getConnection();
			String sql = "select * from comboard where bnum="+bnum;
			st = con.createStatement();
			rs= st.executeQuery(sql);
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
		}finally {
			closeConnection(con, null,st, rs);
		}
		return carr;
	}

	//�߰�
	@Override
	public void commentInsert(CommentDTO comment) {
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = getConnection();
			String sql="insert into comboard "
					+ " values(comboard_seq.nextval,?,?,?,sysdate)";
			ps = con.prepareStatement(sql);
			ps.setString(1, comment.getMsg());
			ps.setInt(2, comment.getBnum());
			ps.setString(3, comment.getUserid());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeConnection(con, ps, null, null);
		}
	
	}
	//�ݱ�
	private void closeConnection(Connection con,
			PreparedStatement ps, Statement st, ResultSet rs) {
			try {
				if(rs!=null ) rs.close();
				if(st!=null ) st.close();
				if(ps!=null ) ps.close();
				if(con!=null ) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
}
