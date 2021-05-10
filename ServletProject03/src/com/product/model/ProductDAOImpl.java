package com.product.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class ProductDAOImpl implements ProductDAO {
	//디비셋팅
	private static ProductDAOImpl instance = new ProductDAOImpl();
	public static ProductDAOImpl getInstance() {
		return instance;
	}
	private Connection getConnection() throws Exception{
		Context initCtx = new InitialContext();
		Context envCtx = (Context) initCtx.lookup("java:comp/env");
		DataSource ds = (DataSource) envCtx.lookup("jdbc/jsp"); 
		return ds.getConnection();
	}

	//추가
	public void productInsert(Product product) {
		Connection con = null;
		PreparedStatement ps = null;
		
		 try {
		     con = getConnection();
		     String sql = "insert into product values(product_seq.nextval, ?,?,?,?,?,?,?,?)";
		     ps = con.prepareStatement(sql);
		     ps.setString(1, product.getPname());
		     ps.setInt(2, product.getUnitPrice());
		     ps.setString(3, product.getDescription());
		     ps.setString(4, product.getCategory());
		     ps.setString(5, product.getManufacturer());
		     ps.setLong(6, product.getUnitsInStock());
		     ps.setString(7, product.getCondition());
		     ps.setString(8, product.getFilename());
		     ps.executeUpdate();
		  } catch (Exception e) {
		     e.printStackTrace();
		  } closeConnection(con, ps, null, null);
	}

	//전체보기
	public ArrayList<Product> poductAllfind() {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		ArrayList<Product> parr = new ArrayList<>();
		
		try {
			con = getConnection();
			String sql = "select * from product";
			st = con.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()) {
				Product product = new Product();
				product.setProductId(rs.getInt("p_id"));
				product.setPname(rs.getString("p_name"));
				product.setUnitPrice(rs.getInt("p_unitPrice"));
				product.setDescription(rs.getString("p_description"));
				product.setManufacturer(rs.getString("p_manufacturer"));
				product.setCategory(rs.getString("p_category"));
				product.setUnitsInStock(rs.getInt("p_unitsInStock"));
				product.setCondition(rs.getString("p_condition"));
				product.setFilename(rs.getString("p_filename"));
				parr.add(product);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection(con, null, st, rs);	
		}
		return parr;
	}

	//상세보기
	public Product findById(Long productId) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		Product product = null;
		
		try {
			con = getConnection();
			st = con.createStatement();
			String sql = "select * from product where p_id="+productId;
			rs = st.executeQuery(sql);
			if(rs.next()) {
				product = new Product();
				product.setProductId(rs.getInt("p_id"));
				product.setPname(rs.getString("p_name"));
				product.setUnitPrice(rs.getInt("p_unitPrice"));
				product.setDescription(rs.getString("p_description"));
				product.setManufacturer(rs.getString("p_manufacturer"));
				product.setCategory(rs.getString("p_category"));
				product.setUnitsInStock(rs.getInt("p_unitsInStock"));
				product.setCondition(rs.getString("p_condition"));
				product.setFilename(rs.getString("p_filename"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection(con, null, st, rs);
		}
		return product;
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
