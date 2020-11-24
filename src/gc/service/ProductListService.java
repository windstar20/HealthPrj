package gc.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import gc.entity.Product;

public class ProductListService {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@hi.namoolab.com:1521/xepdb1";
	String sql = "SELECT * FROM PRODUCT_LIST";

	public List<Product> getList() {
		
		
		List<Product> list = new ArrayList<>();
		//1. 드라이버 로드하기
		try {
			Class.forName(driver);
			//2. 연결하기
			Connection con = DriverManager.getConnection(url, "hm", "1026");
			//3. 명령어를 옮겨주기 위한 객체 생성
			Statement st = con.createStatement();
			//4. 결과집합 사용하기
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String code = rs.getString("code");
				int price = rs.getInt("price");
				int stock = rs.getInt("stock");
				String maker = rs.getString("maker");
				String brand = rs.getString("brand");
				
				Product p = new Product();
				p.setId(id);
				p.setName(name);
				p.setCode(code);
				p.setPrice(price);
				p.setStock(stock);
				p.setMaker(maker);
				p.setBrand(brand);
				
				list.add(p);
			}
			rs.close();
			st.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return list;
	}
		
	
	
		
	
	
}
