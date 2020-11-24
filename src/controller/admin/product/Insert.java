package controller.admin.product;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.tomcat.dbcp.dbcp2.PStmtKey;

public class Insert {

	public static void main(String[] args) {
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@hi.namoolab.com:1521/xepdb1";
		String sql = "INSERT INTO PRODUCT_LIST(id, name, code, price, stock, maker, brand) values(?,?,?,?,?,?,?)";
		
		
		try {
			//1. JDBC 드라이버 로딩 Oracle JDBC 드라이버의 Driver Class 로딩
			Class.forName(driver);
			//2. Connection 생성
			Connection con = DriverManager.getConnection(url, "hm", "1026");
			//3. PreParedStatement 객체 생성, 객체 생성시 sql 문장 저장
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			//4. pstme.set<데이터타입>(? 순서, 값)
			pstmt.setInt(1, 2); //id
			pstmt.setString(2,"건강오트밀");  //name
			pstmt.setString(3,"O234324N");  //code
			pstmt.setInt(4,75000);  //price
			pstmt.setInt(5,20);  //stock
			pstmt.setString(6,"GC");  //maker
			pstmt.setString(6,"근처");  //brand
			
			
			//5. sql 문장을 실행하고 결과를 리턴 -sql 문장 실행 후, 변경된 row 수 int type 리턴
			int r = pstmt.executeUpdate();
			
			// pstmt.excuteQuery() : select
			// pstmt.excuteUpdate() : insert, update, delete
			
			System.out.println("변경된 row : " + r);
			
			pstmt.close();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
}
