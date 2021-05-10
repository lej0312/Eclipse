package com.address;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class AddressDAO {
	//�����=>�̱���:��ü�� �ϳ��� ���� ���ڴ�
	private static AddressDAO instance = new AddressDAO();
	public static AddressDAO getInstance() {
		return instance;
	}
	private Connection getConnection() throws Exception{
		Context initCtx = new InitialContext();
		Context envCtx = (Context) initCtx.lookup("java:comp/env"); //java:comp/env ����Ʈ
		DataSource ds = (DataSource) envCtx.lookup("jdbc/jsp"); // jdbc/jsp:context���� �� ���� ������ �̸�
		return ds.getConnection();
	}//*****�߿� java:comp/env��� ������ �������� jdbc/jsp�� ã��
	
	//�߰�
	public void addressInsert(Address ad) {
		Connection con = null;
		PreparedStatement ps =null;
		
		try {
			con = getConnection();
			String sql = "insert into address values(address_seq.nextval, ?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, ad.getName());
			ps.setString(2, ad.getAddr());
			ps.setString(3, ad.getZipcode());
			ps.setString(4, ad.getTel());
			ps.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection(con, ps, null, null);
		}
	}
	
	//����
	public int getCount(String field, String word) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		int count = 0;
		String sql="";
		
		try {
			con = getConnection();
			if(word.equals("")) {
				sql = "select count(*) from address";//�˻� �ƴ�
			}else {
				sql = "select count(*) from address where "+field +" like '%"+word+"%'";
			}
				
			st = con.createStatement();
			rs = st.executeQuery(sql);
			if (rs.next()) {
				count = rs.getInt(1); //��ġ�� ������
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
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
	
	//��ü����(�˻�����)-(�ּ�ó�� �� list2���� ���� ������� ��� �������)
	public ArrayList<Address> getList() {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		ArrayList<Address> arr = new ArrayList<>();
		
		try {
			con = getConnection();	
			String sql = "select * from address";
			st = con.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()) {
				Address ad = new Address();
				ad.setAddr(rs.getString("addr")); //sql������ addr?
				ad.setName(rs.getString("name"));
				ad.setNum(rs.getInt("num")); //�÷��� ��ġ������ ���ٰ��� "num"��� 1�ᵵ ��
				ad.setTel(rs.getString("tel"));
				ad.setZipcode(rs.getString("zipcode"));
				arr.add(ad);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection(con, null, st, rs);
		}
		return arr;
	}
	
	//��ü����(�˻�����)
	public ArrayList<Address> getList(String field, String word){
			Connection con = null;
			Statement st = null;
			ResultSet rs = null;
			ArrayList<Address> arr = new ArrayList<>();
			String sql="";
			
			try {
				con = getConnection();
				if(word.equals("")) {
					sql = "select * from address";
				}else {
					sql = "select * from address where "+ field +" like '%"+word+"%'";
				}
				System.out.println(sql);
				st = con.createStatement();
				rs = st.executeQuery(sql);
				while(rs.next()) {
					Address ad = new Address();
					ad.setAddr(rs.getString("addr"));
					ad.setName(rs.getString("name"));
					ad.setNum(rs.getInt("num"));
					ad.setTel(rs.getString("tel"));
					ad.setZipcode(rs.getString("zipcode"));
					arr.add(ad);	
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				closeConnection(con, null, st, rs);
			}
		return arr;
	}
	
	//�󼼺���
	public Address findByNum(int num) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		Address ad = null; //�޼��� �ؿ� ����Ǿ�� return ����
		
		try {
			con = getConnection();
			String sql = "select * from address where num =" + num;
			st = con.createStatement();
			rs = st.executeQuery(sql);
			if(rs.next()) {
				ad = new Address();
				ad.setAddr(rs.getString("addr"));
				ad.setName(rs.getString("name"));
				ad.setNum(rs.getInt("num"));
				ad.setTel(rs.getString("tel"));
				ad.setZipcode(rs.getString("zipcode"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection(con, null, st, rs);
		}
		return ad;
	}
	
	//����
	public void addressUpdate(Address ad) {
		Connection con = null;
		PreparedStatement ps = null; //?���� ���..?
				
		try {
			con = getConnection();
			String sql = "update address set name=?, addr=?, tel=?, zipcode=? where num=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, ad.getName());
			ps.setString(2, ad.getAddr());
			ps.setString(3, ad.getTel());
			ps.setString(4, ad.getZipcode());
			ps.setInt(5, ad.getNum());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection(con, ps, null, null);
		}
	}
	
	//����
	public void addressDelete(int num) {
		Connection con = null;
		Statement st = null;
		
		try {
			con = getConnection();
			String sql = "delete from address where num=" + num;
			st = con.createStatement();
			st.executeUpdate(sql); //execute�� ���� executeUpdate : ���ϵǾ����� ..?
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection(con, null, st, null);
		}
	}
	
	//�����ȣ ã��
	public ArrayList<ZipCodeBean> zipcodeRead(String dong) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		ArrayList<ZipCodeBean> zarr = new ArrayList<>();
				
		try {
			con = getConnection();
			String sql="select * from zipcode where dong like '%"+dong+"%'"; //dong�� �������� ����ǥ�ȿ� ������ �ȵ�
			st = con.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()) {
				ZipCodeBean zip = new ZipCodeBean();
				zip.setBunji(rs.getString("bunji"));
				zip.setDong(rs.getString("dong"));
				zip.setGugun(rs.getString("gugun"));
				zip.setSeq(rs.getInt("seq"));
				zip.setSido(rs.getString("sido"));
				zip.setZipcode(rs.getString("zipcode"));
				zarr.add(zip);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection(con, null, st, rs);
		}			
		return zarr;
	}
	
}

//�񵿱�		/		����
//�ݹ��Լ� eg)
//1.jquery ajax (����Ʈ)
//2.axios (����Ʈ)
//3.�ڹٽ�ũ��Ʈ fetch (����Ʈx,����Ǿ� ����)


