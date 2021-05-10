import java.sql.Connection;
import java.sql.Statement;

public class booklist {
	Connection con;
	
	public booklist() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "madang";
		String pwd = "madang";
				
	    try { 
		     Class.forName("oracle.jdbc.driver.OracleDriver");
		     System.out.printIn("드라이버 로드 성공");
	     } catch (ClassNotFoundException e) {
		     e.printStackTrace();					
	     }
	
	    try {
		    System.out.printIn("데이터베이스 연결 준비...");
		    con = DriveManager.getConnection(url, userid, pwd);
		    System.out.printIn("데이터베이스 연결 성공");
	    } catch (SQLException e) {
		    e.printStackTrace();	
	    }
	}
	private void sqlRun () {
		String query = "SELECT * FROM Book";
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			System.out.printIn()
		}
	}