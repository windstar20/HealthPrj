package gc.product.entity;

import java.util.Date;

public class Product {

	private int	id;
	private String name;
	private String code;
	private String categoryA;
	private String categoryB;
	private Date regdate;
	private int price;
	private String inventory;
	private String manufacturer;
	private String model;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Product(int id, String name, String code, String categoryA, String categoryB, Date regdate, int price,
			String inventory, String manufacturer, String model) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
		this.categoryA = categoryA;
		this.categoryB = categoryB;
		this.regdate = regdate;
		this.price = price;
		this.inventory = inventory;
		this.manufacturer = manufacturer;
		this.model = model;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCategoryA() {
		return categoryA;
	}

	public void setCategoryA(String categoryA) {
		this.categoryA = categoryA;
	}

	public String getCategoryB() {
		return categoryB;
	}

	public void setCategoryB(String categoryB) {
		this.categoryB = categoryB;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getInventory() {
		return inventory;
	}

	public void setInventory(String inventory) {
		this.inventory = inventory;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", code=" + code + ", categoryA=" + categoryA + ", categoryB="
				+ categoryB + ", regdate=" + regdate + ", price=" + price + ", inventory=" + inventory
				+ ", manufacturer=" + manufacturer + ", model=" + model + "]";
	}


	
	
	
}
