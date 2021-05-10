package com.jqueryAddress;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.address.Address;

public class JAddressDAO {
	private static JAddressDAO instance = new JAddressDAO();
	public static JAddressDAO getInstance() {
		return instance;
	}
	private Connection getConnection() throws Exception{
		Context initCtx = new InitialContext();
		Context envCtx = (Context) initCtx.lookup("java:comp/env");
		DataSource ds = (DataSource) envCtx.lookup("jdbc/jsp"); 
		return ds.getConnection();
	}

	//�߰�
	public void insert(AddressVO avo) {
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = getConnection();
			String sql = "insert into address values(address_seq.nextval, ?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, avo.getName());
			ps.setString(2, avo.getAddr());
			ps.setString(3, avo.getZipcode());
			ps.setString(4, avo.getTel());
			ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection(con, ps, null, null);
		}
	}
	
	//��ü����
	public ArrayList<AddressVO> list(){
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		ArrayList<AddressVO> arr = new ArrayList<>();

		try {
			con = getConnection();	
			String sql = "select * from address";
			st = con.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()) {
				AddressVO avo = new AddressVO();
				avo.setAddr(rs.getString("addr")); //sql������ addr?
				avo.setName(rs.getString("name"));
				avo.setNum(rs.getInt("num")); //�÷��� ��ġ������ ���ٰ��� "num"��� 1�ᵵ ��
				avo.setTel(rs.getString("tel"));
				avo.setZipcode(rs.getString("zipcode"));
				arr.add(avo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection(con, null, st, rs);
		}
		return arr;
	}

	//�󼼺���
	public AddressVO detail(int num) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		AddressVO ad = null; //�޼��� �ؿ� ����Ǿ�� return ����
		
		try {
			con = getConnection();
			String sql = "select * from address where num =" + num;
			st = con.createStatement();
			rs = st.executeQuery(sql);
			if(rs.next()) {
				ad = new AddressVO();
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
	public void delete(int num) {
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
	//�����ϱ�
	public void update(AddressVO ad) {
		Connection con = null;
		PreparedStatement ps = null;
				
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
	public int addrCount() {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		int count = 0;

		try {
			con = getConnection();
			String sql = "select count(*) from address";
			st = con.createStatement();
			rs = st.executeQuery(sql);
			if (rs.next()) {
				count = rs.getInt(1); //�÷� ��ġ�� ������
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeConnection(con, null, st, rs);
		}
		return count;
	}
	
	//��ü���� �˻�
	public ArrayList<AddressVO> searchList(String field, String word){
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		ArrayList<AddressVO> sarr = new ArrayList<>();
		
		try {
			con = getConnection();
			String sql = "select * from address where "+ field +" like '%"+word+"%'";
			st = con.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()) {
				AddressVO avo = new AddressVO();
				avo.setAddr(rs.getString("addr"));
				avo.setName(rs.getString("name"));
				avo.setNum(rs.getInt("num"));
				avo.setTel(rs.getString("tel"));
				avo.setZipcode(rs.getString("zipcode"));
				sarr.add(avo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection(con, null, st, rs);
		}
		return sarr;
	}

	//�˻� ����
	public int searchCount(String field, String word) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		int count = 0;

		try {
			con = getConnection();
			String sql = "select count(*) from address where "+field +" like '%"+word+"%'";	
			st = con.createStatement();
			rs = st.executeQuery(sql);
			if (rs.next()) {
				count = rs.getInt(1); //��ġ�� ������
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection(con, null, st, rs);
		}
		return count;
	}
	
	
	//�����ȣ �˻�
	public ArrayList<ZipCodeVO> getZipcode(String dong) {
		Connection con = null; //��񿬰� ��ü
		Statement st = null; //sql �����ϱ� ���� ��ü
		ResultSet rs = null; //sql ��� ��ü
		ArrayList<ZipCodeVO> zarr = new ArrayList<>();
				
		try {
			con = getConnection();
			String sql="select * from zipcode where dong like '%"+dong+"%'"; //dong�� �������� ����ǥ�ȿ� ������ �ȵ�
			st = con.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()) {
				ZipCodeVO zip = new ZipCodeVO();
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
