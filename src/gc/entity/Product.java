package gc.entity;

import java.util.Date;

public class Product {

	private int	id;
	private String productName;
	private String brand;
	private String  manufacturer;
	private String productModel;
	private String category;
	private Date regdate;
	private int price;
	private int savePoint;
	private String summaryExplain;
	private String delivery;
	private String detailExplain;

	public Product() {
		
	}	

	public Product(int id, String productName, String brand, Date regdate, int price) {
		super();
		this.id = id;
		this.productName = productName;
		this.brand = brand;
		this.regdate = regdate;
		this.price = price;
	}


	public Product(int id, String productName, String brand, String manufacturer, String productModel, String category,
			Date regdate, int price, int savePoint, String summaryExplain, String delivery, String detailExplain) {
		super();
		this.id = id;
		this.productName = productName;
		this.brand = brand;
		this.manufacturer = manufacturer;
		this.productModel = productModel;
		this.category = category;
		this.regdate = regdate;
		this.price = price;
		this.savePoint = savePoint;
		this.summaryExplain = summaryExplain;
		this.delivery = delivery;
		this.detailExplain = detailExplain;
	}
	public Product(int id, String productName, String brand, String manufacturer, String productModel, String category,
			int price, int savePoint, String summaryExplain, String delivery, String detailExplain) {
		super();
		this.id = id;
		this.productName = productName;
		this.brand = brand;
		this.manufacturer = manufacturer;
		this.productModel = productModel;
		this.category = category;
		this.price = price;
		this.savePoint = savePoint;
		this.summaryExplain = summaryExplain;
		this.delivery = delivery;
		this.detailExplain = detailExplain;
	}

	public Product(String productName, String manufacturer, String brand, String productModel, String category,
					int price, int savePoint, String delivery, String summaryExplain, String detailExplain) {
		this.productName = productName;
		this.manufacturer = manufacturer;
		this.brand = brand;
		this.productModel = productModel;
		this.category = category;
		this.price = price;
		this.savePoint = savePoint;
		this.delivery = delivery;
		this.summaryExplain = summaryExplain;
		this.detailExplain = detailExplain;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getProductModel() {
		return productModel;
	}

	public void setProductModel(String productModel) {
		this.productModel = productModel;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
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

	public int getSavePoint() {
		return savePoint;
	}

	public void setSavePoint(int savePoint) {
		this.savePoint = savePoint;
	}

	public String getSummaryExplain() {
		return summaryExplain;
	}

	public void setSummaryExplain(String summaryExplain) {
		this.summaryExplain = summaryExplain;
	}

	public String getDelivery() {
		return delivery;
	}

	public void setDelivery(String delivery) {
		this.delivery = delivery;
	}

	public String getDetailExplain() {
		return detailExplain;
	}

	public void setDetailExplain(String detailExplain) {
		this.detailExplain = detailExplain;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", brand=" + brand + ", manufacturer="
				+ manufacturer + ", productModel=" + productModel + ", category=" + category + ", regdate=" + regdate
				+ ", price=" + price + ", savePoint=" + savePoint + ", summaryExplain=" + summaryExplain + ", delivery="
				+ delivery + ", detailExplain=" + detailExplain + "]";
	}
	

}