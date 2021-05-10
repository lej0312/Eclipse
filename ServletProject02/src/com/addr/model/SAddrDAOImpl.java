package com.addr.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;


public class SAddrDAOImpl implements SAddrDAO{
	
	//디비셋팅
	private static SAddrDAOImpl instance = new SAddrDAOImpl();
	public static SAddrDAOImpl getInstance() {
		return instance;
	}
	private Connection getConnection() throws Exception{
		Context initCtx = new InitialContext();
		Context envCtx = (Context) initCtx.lookup("java:comp/env"); 
		DataSource ds = (DataSource) envCtx.lookup("jdbc/jsp"); 
		return ds.getConnection();
	}
	
	//추가
	@Override
	public void addrInsert(AddrDTO addr) {
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = getConnection();
			String sql = "insert into address values(address_seq.nextval, ?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, addr.getName());
			ps.setString(2, addr.getAddr());
			ps.setString(3, addr.getZipcode());
			ps.setString(4, addr.getTel());
			ps.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection(con, ps, null, null);
		}
	}

	//전체보기
	@Override
	public ArrayList<AddrDTO> addrList() {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		ArrayList<AddrDTO> arr = new ArrayList<>();

		try {
			con = getConnection();	
			String sql = "select * from address";
			st = con.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()) {
				AddrDTO ad = new AddrDTO();
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

	//상세보기
	@Override
	public AddrDTO addrDetail(int num) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		AddrDTO ad = null; 
		
		try {
			con = getConnection();
			String sql = "select * from address where num =" + num;
			st = con.createStatement();
			rs = st.executeQuery(sql);
			if(rs.next()) {
				ad = new AddrDTO();
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

	//수정
	@Override
	public void addrUpdate(AddrDTO addr) {
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = getConnection();
			String sql = "update address set name=?, addr=?, tel=?, zipcode=? where num=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, addr.getName());
			ps.setString(2, addr.getAddr());
			ps.setString(3, addr.getTel());
			ps.setString(4, addr.getZipcode());
			ps.setInt(5, addr.getNum());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection(con, ps, null, null);
		}
		
	}

	//삭제
	@Override
	public void addrDelete(int num) {
		Connection con = null;
		Statement st = null;
		
		try {
			con = getConnection();
			String sql = "delete from address where num=" + num;
			st = con.createStatement();
			st.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection(con, null, st, null);
		}
	}

	//검색
	@Override
	public ArrayList<AddrDTO> addrSearchList(String field, String word) {
		// TODO Auto-generated method stub
		return null;
	}

	//개수
	@Override
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
				count = rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeConnection(con, null, st, rs);
		}
		return count;
	}

	//개수(검색)
	@Override
	public int addrSearchCount(String field, String word) {
		// TODO Auto-generated method stub
		return 0;
	}

	//우편번호 검색
	@Override
	public ArrayList<ZipDTO> addrZipRead(String dong) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		ArrayList<ZipDTO> zarr = new ArrayList<>();
		
		try {
			con = getConnection();
			String sql="select * from zipcode where dong like '%"+dong+"%'";
			st = con.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()) {
				ZipDTO zip = new ZipDTO();
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
	
	
	//닫기
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
