package com.member.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class SMemberDAOImpl  implements SMemberDAO{
	private static SMemberDAOImpl instance = new SMemberDAOImpl();
	public static SMemberDAOImpl getInstance() {
		return instance;
	}
	
	private   Connection getConnection() throws Exception{
		Context initCtx = new InitialContext();
		Context envCtx = (Context) initCtx.lookup("java:comp/env");
		DataSource ds = (DataSource) envCtx.lookup("jdbc/jsp");
		return ds.getConnection();
	}

	//추가
	public void memberJoin(SMemberDTO member) {
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = getConnection();
			String sql= "insert into memberdb values(?,?,?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, member.getName());
			ps.setString(2, member.getUserid());
			ps.setString(3, member.getPwd());
			ps.setString(4, member.getEmail());
			ps.setString(5, member.getPhone());
			ps.setInt(6, member.getAdmin());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeConnection(con, ps, null, null);
		}
	}
	
    //전체보기
	public ArrayList<SMemberDTO> getMember() {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		ArrayList<SMemberDTO> arr = new ArrayList<>();
		
		try {
			con = getConnection();
			String sql="select * from memberdb";
			st = con.createStatement();
			rs= st.executeQuery(sql);
			while(rs.next()) {
				SMemberDTO dto = new SMemberDTO();
				dto.setAdmin(rs.getInt("admin"));
				dto.setEmail(rs.getString("email"));
				dto.setName(rs.getString("name"));
				dto.setPhone(rs.getString("phone"));
				dto.setPwd(rs.getString("pwd"));
				dto.setUserid(rs.getString("userid"));
				arr.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeConnection(con, null,st, rs);
		}
		return arr;
	}

	//수정
	public int memberUpdate(SMemberDTO member) {
		Connection con = null;
		PreparedStatement ps = null;
		int flag=0;
		    
		try {
			con = getConnection();
			String sql = "update memberdb set name=?, pwd =?, email=?, admin=?, phone=? where userid =?";
			System.out.println(sql);
			ps = con.prepareStatement(sql);
			ps.setString(1, member.getName());
			ps.setString(2, member.getPwd());
			ps.setString(3, member.getEmail());
			ps.setInt(4, member.getAdmin());
			ps.setString(5, member.getPhone());
			ps.setString(6, member.getUserid());
			flag = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeConnection(con, ps, null,null);
		}
		return flag;
	}
	
    // 회원삭제
	public void memberDelete(String userid) {
		Connection con = null;
		Statement st = null;
		
		try {
			con = getConnection();
			st = con.createStatement();
			String sql = "delete from memberdb where userid='"+userid+"'";
			st.executeUpdate(sql);
		} catch (Exception e) {
				e.printStackTrace();
		}finally {
			closeConnection(con, null, st, null);
		}
		
	}

	//상세보기
	public SMemberDTO findById(String userid) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		SMemberDTO member = null;
		
		try {
			con = getConnection();
			st = con.createStatement();
			String sql = "select * from memberdb where userid='"+userid+"'";
			rs = st.executeQuery(sql);
			if(rs.next()) {
				 member = new SMemberDTO();
				 member.setAdmin(rs.getInt("admin"));
				 member.setEmail(rs.getString("email"));
				 member.setName(rs.getString("name"));
				 member.setPhone(rs.getString("phone"));
				 member.setPwd(rs.getString("pwd"));
				 member.setUserid(rs.getString("userid"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeConnection(con, null, st, rs);
		}
		return member;
	}
	
	//회원수
	public int memberCount() {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		int count = 0 ;
		
		try {
			con = getConnection();
			String sql = "select count(*) from memberdb";
			st = con.createStatement();
			rs = st.executeQuery(sql);
			if(rs.next()) {
				count =rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeConnection(con,null, st, rs);
		}
		return count;
	}

	//아이디체크
	public String memberIdCheck(String userid) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		String flag = "yes"; // id 사용가능
		try {
			con = getConnection();
			String sql = "select * from memberdb where userid = '"+userid+"'" ;
			st = con.createStatement();
			rs = st.executeQuery(sql);
			if(rs.next()) {//rs가 있으면 -->테이블에 userid 존재함. 사용할 수 없음
				flag="no";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeConnection(con, null, st, rs);
		}
		return flag;
	}
    
	
	//로그인체크
	public SMemberDTO memberLoginCheck(String userid, String pwd) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		SMemberDTO member = new SMemberDTO();
		//비회원 
		member.setAdmin(-1);
		try {
			con = getConnection();
			String sql = "select * from memberdb where userid ='"+userid+"'";
			//System.out.println(sql);
			st = con.createStatement();
			rs = st.executeQuery(sql);
			if(rs.next()) { //회원임
				if(rs.getString("pwd").equals(pwd)) { //회원(일반회원, 관리자)
					member.setAdmin(rs.getInt("admin"));
					member.setEmail(rs.getString("email"));
					member.setName(rs.getString("name"));
					member.setPhone(rs.getString("phone"));
					member.setPwd(rs.getString("pwd"));
					member.setUserid(rs.getString("userid"));
				}else { //비번오류
					member.setAdmin(2); 
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeConnection(con, null, st, rs);
		}
		return member;
	}
	
	//종료
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
