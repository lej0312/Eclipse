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
	//디비세팅=>싱글톤:객체를 하나로 만들어서 쓰겠다
	private static AddressDAO instance = new AddressDAO();
	public static AddressDAO getInstance() {
		return instance;
	}
	private Connection getConnection() throws Exception{
		Context initCtx = new InitialContext();
		Context envCtx = (Context) initCtx.lookup("java:comp/env"); //java:comp/env 디폴트
		DataSource ds = (DataSource) envCtx.lookup("jdbc/jsp"); // jdbc/jsp:context파일 에 내가 설정한 이름
		return ds.getConnection();
	}//*****중요 java:comp/env라는 가상의 폴더에서 jdbc/jsp를 찾음
	
	//추가
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
	
	//개수
	public int getCount(String field, String word) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		int count = 0;
		String sql="";
		
		try {
			con = getConnection();
			if(word.equals("")) {
				sql = "select count(*) from address";//검색 아님
			}else {
				sql = "select count(*) from address where "+field +" like '%"+word+"%'";
			}
				
			st = con.createStatement();
			rs = st.executeQuery(sql);
			if (rs.next()) {
				count = rs.getInt(1); //위치로 접근함
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeConnection(con, null, st, rs);
		}
		return count;
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
	
	//전체보기(검색없음)-(주석처리 시 list2에서 오류 원래라면 없어도 상관없음)
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
				ad.setAddr(rs.getString("addr")); //sql에서의 addr?
				ad.setName(rs.getString("name"));
				ad.setNum(rs.getInt("num")); //컬럼의 위치값으로 접근가능 "num"대신 1써도 됨
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
	
	//전체보기(검색포함)
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
	
	//상세보기
	public Address findByNum(int num) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		Address ad = null; //메서드 밑에 선언되어야 return 가능
		
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
	
	//수정
	public void addressUpdate(Address ad) {
		Connection con = null;
		PreparedStatement ps = null; //?들어갈때 사용..?
				
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
	
	//삭제
	public void addressDelete(int num) {
		Connection con = null;
		Statement st = null;
		
		try {
			con = getConnection();
			String sql = "delete from address where num=" + num;
			st = con.createStatement();
			st.executeUpdate(sql); //execute도 가능 executeUpdate : 리턴되어지는 ..?
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection(con, null, st, null);
		}
	}
	
	//우편번호 찾기
	public ArrayList<ZipCodeBean> zipcodeRead(String dong) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		ArrayList<ZipCodeBean> zarr = new ArrayList<>();
				
		try {
			con = getConnection();
			String sql="select * from zipcode where dong like '%"+dong+"%'"; //dong은 변수여서 따옴표안에 적으면 안됨
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

//비동기		/		동기
//콜백함수 eg)
//1.jquery ajax (임포트)
//2.axios (임포트)
//3.자바스크립트 fetch (임포트x,내장되어 있음)


