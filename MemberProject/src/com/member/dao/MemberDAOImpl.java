package com.member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.member.dto.MemberDTO;


public class MemberDAOImpl implements MemberDAO{
	
	//������
	private static MemberDAOImpl instance = new MemberDAOImpl();
	public static MemberDAOImpl getInstance() {
		return instance;
	}
	private Connection getConnection() throws Exception{
		Context initCtx = new InitialContext();
		Context envCtx = (Context) initCtx.lookup("java:comp/env");
		DataSource ds = (DataSource) envCtx.lookup("jdbc/jsp"); 
		return ds.getConnection();
	}
	
	//�߰�
	@Override
	public void memInsert(MemberDTO member) {
		Connection con = null;
		PreparedStatement ps = null;
	
		try {
			con=getConnection();
			String sql = "insert into memberdb values(?,?,?,?,?,?)";
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
		} finally {
			closeConnection(con, ps, null, null);
		}
	}

	//��ü����
	@Override
	public ArrayList<MemberDTO> memList() {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		ArrayList<MemberDTO> arr = new ArrayList<>();
		
		try {
			con = getConnection();
			String sql = "select * from memberdb";
			st = con.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()) {
				MemberDTO member = new MemberDTO();
				member.setName(rs.getString("name"));
				member.setUserid(rs.getString("userid"));
				member.setPwd(rs.getString("pwd"));
				member.setEmail(rs.getString("email"));
				member.setPhone(rs.getString("phone"));
				member.setAdmin(rs.getInt("admin"));
				arr.add(member);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection(con, null, st, rs);
		}
		return arr;
	}
	
	//����
	@Override
	public int memUpdate(MemberDTO member) {
	    Connection con = null;
	    PreparedStatement ps = null;
	    int flag = 0;
	    
	    try {
			con = getConnection();
			String sql="update memberdb set name=?, pwd =?, email=?, admin=?, phone=? where userid =?";
			System.out.println(sql);
			ps=con.prepareStatement(sql);
			ps.setString(1, member.getName());
			ps.setString(2, member.getPwd());
			ps.setString(3, member.getEmail());
			ps.setInt(4, member.getAdmin());
			ps.setString(5, member.getPhone());
			ps.setString(6, member.getUserid());
			flag = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection(con, ps, null, null);
		}
		return flag; //���� �� �������� �� -> ���� ���� �Ǿ�� ��..
	}

	//�����ϱ�
	@Override
	public void memDelete(String userid) {
		Connection con = null;
		Statement st = null;
		
		try {
			con = getConnection();
			String sql = "delete from memberdb where userid='" + userid + "'"; //sql�� ���ڿ��� Ȭ����ǥ
			st = con.createStatement();
			st.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection(con, null, st, null);
		}
	}

	//�󼼺���
	@Override
	public MemberDTO findById(String userid) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		MemberDTO member = null;
		
		try {
			con = getConnection();
			String sql ="select * from memberdb where userid='"+userid+"'";
			st = con.createStatement();
			rs = st.executeQuery(sql);
			if(rs.next()) {
				member = new MemberDTO();
				member.setName(rs.getString("name"));
				member.setEmail(rs.getString("email"));
				member.setAdmin(rs.getInt("admin"));
				member.setPhone(rs.getString("phone"));
				member.setPwd(rs.getString("pwd"));
				member.setUserid(rs.getString("userid"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection(con, null, st, rs);
		}
		return member;
	}

	//���̵� �ߺ�Ȯ��
	@Override
	public String idCheck(String userid) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		String flag = "yes"; //id ��밡��
		
		try {
			con = getConnection();
			String sql = "select * from memberdb where userid = '" +userid+ "'";
			st = con.createStatement();
			rs = st.executeQuery(sql);
			if(rs.next()) { //rs�� ������ -> ���̺� userid ������ -> ���Ұ�
				flag="no";
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection(con, null, st, rs);
		}
		return flag;
	}

	//�α��� üũ
	@Override
	public int loginCheck(String userid, String pwd) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		int flag = -1; //ȸ�� �ƴ�
		
		try {
			con = getConnection();
			String sql = "select pwd, admin from memberdb where userid='"+userid+"'";
			st = con.createStatement();
			rs = st.executeQuery(sql);
			if(rs.next()) { //userid�� ���� (ȸ���� ����)
				if(rs.getString("pwd").equals(pwd)) { //ȸ�� ����(��� ����)
					flag = rs.getInt("admin"); //0->�Ϲ�ȸ��, 1->������
				}else { //��� ���� => ���̵�� ������ ����� Ʋ��
					flag = 2;	
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection(con, null, st, rs);
		}
		return flag;
	}

	//��ü����-����
	@Override
	public int getCount() {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		int count = 0;
	
		try {
			con = getConnection();
			st = con.createStatement();
			String sql = "select count(*) from memberdb";
			rs = st.executeQuery(sql);
			if (rs.next()){
				count = rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection(con, null, st, rs);
		}
		return count;
	}
	
	//�ݱ�
	private void closeConnection(Connection con, PreparedStatement ps, 
			Statement st, ResultSet rs) {
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
