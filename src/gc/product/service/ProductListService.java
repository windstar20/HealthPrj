package gc.product.service;
import gc.product.entity.Product;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductListService {

	String url = "jdbc:oracle:thin:@hi.namoolab.com:1521/xepdb1";
	String sql = "SELECT * FROM PRODUCT";
	
	List<Product> list = new ArrayList<>();
	
	public List<Product> getList() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url, "hm", "1026");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				int id= rs.getInt("ID");
				String name = rs.getString("NAME");
				String code = rs.getString("CODE");
				String categoryA = rs.getString("CATEGORY_A");
				String categoryB = rs.getString("CATEGORY_B");
				Date regdate = rs.getDate("REGDATE");
				int price = rs.getInt("PRICE");
				String inventory = rs.getString("INVENTORY");
				String manufacturer = rs.getString("Manufacturer");
				String model = rs.getString("MODEL");
				 
				Product p = new Product(
							id,
						    name,
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
}
