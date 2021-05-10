package com.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BookDBA {
	// 생성자
	//디비셋팅
	private String url, user, password;
	public BookDBA() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			url ="jdbc:oracle:thin:@localhost:1521:xe";
			user="hr";
			password="hr";
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	//책 추가
	public void bookInsert(Book book) {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = DriverManager.getConnection(url,user,password);
			String sql="insert into Book values(book_seq.nextval,?,?,?,?,?,?)";
			System.out.println(sql);
			ps= con.prepareStatement(sql);
			ps.setString(1, book.getTitle());
			ps.setString(2, book.getWriter());
			ps.setString(3, book.getIndate());
			ps.setString(4, book.getOutdate());
			ps.setInt(5, book.getPrice());
			ps.setString(6, book.getGubun());
			ps.executeUpdate();
			
		} catch (SQLException e) {
				e.printStackTrace();
		}finally {
			closeConnection(con, ps, null, null);
		}
	}
	
	//전체보기
	public ArrayList<Book> bookView() {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		ArrayList<Book>  arr = new ArrayList<>();
		try {
			con = DriverManager.getConnection(url, user, password);
			String sql = "select * from book";
			st = con.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()) {
				Book b = new Book();
				b.setGubun(rs.getString("gubun"));
				b.setIndate(rs.getString("indate"));
				b.setOutdate(rs.getString("outdate"));
				b.setPrice(rs.getInt("price"));
				b.setTitle(rs.getString("title"));
				b.setWriter(rs.getString("writer"));
				b.setNum(rs.getInt("num"));
				arr.add(b);
			}
		} catch (SQLException e) {
				e.printStackTrace();
		}finally {
			closeConnection(con, null, st, rs);
		}
		return arr;
		
	}
	//closeConnection
	private void closeConnection(Connection con,
			PreparedStatement ps, Statement st, ResultSet rs) {
		try {
			if(rs!=null) rs.close();
			if(st!=null) st.close();
			if(ps!=null) ps.close();
			if(con!=null) con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

}
