package com.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PlayerDBA {
	// 생성자  ==> DB셋팅
	String url, user, pwd;
	public  PlayerDBA() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			 url ="jdbc:oracle:thin:@localhost:1521:xe";
			 user="hr";
			 pwd="hr";
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	//추가
	public void playerInsert(Player p) {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			 con =DriverManager.getConnection(url, user, pwd);
			 String sql ="insert into player values(player_seq.nextval,?,?,?,?)";
			 System.out.println(sql); //물음표를 사용하기 위해 pre~써야함
			 ps = con.prepareStatement(sql);
			 ps.setString(1, p.getName());
			 ps.setInt(2, p.getHeight());
			 ps.setInt(3, p.getWeight());
			 ps.setString(4, p.getKind());
			 ps.executeUpdate();
		
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			closeConnection(con, null, ps, null);
		}
	}
	public ArrayList<Player> playerView() {
		Connection con = null;
		Statement st = null;
		ResultSet  rs = null;
		ArrayList<Player> arr = new ArrayList<>();
	try {
		 con = DriverManager.getConnection(url, user, pwd);
		String sql ="select * from player order by num desc";
		 st = con.createStatement();
		 rs = st.executeQuery(sql);
		 while(rs.next()) {
			 Player p = new Player();
			 p.setName(rs.getString("name"));
			 p.setKind(rs.getString("kind"));
			 p.setHeight(rs.getInt("height"));
			 p.setWeight(rs.getInt("weight"));
			 p.setNum(rs.getInt("num"));
			 arr.add(p);
		 }
	} catch (SQLException e) {
			e.printStackTrace();
	}finally {
		closeConnection(con, st, null, rs);
	}
	return arr;
		
	}
	
	//close
	private void closeConnection(Connection con, 
			Statement st, PreparedStatement ps, ResultSet rs) {
		try {
			if(rs!=null) rs.close();
			if(st!=null) st.close();
			if(ps!=null) ps.close();
			if(con!=null) con.close();
		}catch(SQLException s) {
			s.printStackTrace();
		}
	}
	

}
