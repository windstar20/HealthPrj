package gc.product.service;
import gc.product.entity.Product;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductListService {

	public List<Product> getList() {
		String url = "jdbc:oracle:thin:@hi.namoolab.com:1521/xepdb1";
		String sql = "SELECT * FROM PRODUCT";
		
		List<Product> list = new ArrayList<>();		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url, "hm", "1026");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				
				int productNumber = rs.getInt("PRODUCT_NUMBER");
				String productName = rs.getString("PRODUCT_NAME");
				String code = rs.getString("CODE");
				String categoryA = rs.getString("CATEGORY_A");
				String categoryB = rs.getString("CATEGORY_B");
				Date regdate = rs.getDate("REGDATE");
				int price = rs.getInt("PRICE");
				int inventory = rs.getInt("INVENTORY");
				String manufacturer = rs.getString("MANUFACTURER");
				String model = rs.getString("MODEL");
				 
				Product p = new Product(
							productNumber,
							productName,
						    code,
						    categoryA,
						    categoryB,
						    regdate,
						    price,
						    inventory,
						    manufacturer,
						    model						 
				 );
				list.add(p);		
				
			}
				rs.close();
				st.close();
				con.close();			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return list;
	}	
	
	public int insert(Product product) { //입력수정삭제는 반환하는 값이 있다. =레코드개수
		int result = 0;
		
		String url = "jdbc:oracle:thin:@hi.namoolab.com:1521/xepdb1";
		String sql = "INSERT INTO PRODUCT(TITLE, CONTENT) VALUES(?, ?)";
		//테이블 업데이트 후에 추가해야함.
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url, "hm", "1026");
			PreparedStatement st = con.prepareStatement(sql);
			result = st.executeUpdate();			
			//ResultSet rs = st.executeQuery(sql);   //셀렉트문에서만 실행
			
			st.close();
			con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return result;
	}	
}
