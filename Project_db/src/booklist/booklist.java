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
		     System.out.printIn("����̹� �ε� ����");
	     } catch (ClassNotFoundException e) {
		     e.printStackTrace();					
	     }
	
	    try {
		    System.out.printIn("�����ͺ��̽� ���� �غ�...");
		    con = DriveManager.getConnection(url, userid, pwd);
		    System.out.printIn("�����ͺ��̽� ���� ����");
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