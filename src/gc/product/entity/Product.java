package gc.product.entity;

import java.util.Date;

public class Product {

	private int productNumber;
	private String productName;
	private String code;
	private String categoryA;
	private String categoryB;
	Date regdate;
	private int price;
	private int inventory;
	private String manufacturer;
	private String model;
	private String summaryExplain;
	private String keyword;
	private String reddateInput;
	private String managerMemo;
	private String discount;
	private int discountInput;
	private String inventoryAmount;
	private int inventoryInput;
	private int point;
	private int savePoint;
	private String delivery;
	private String brand;
	private String explain;
	private String detailExplain;

	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Product(int productNumber, String productName, String code, String categoryA, String categoryB, Date regdate,
			int price, int inventory, String manufacturer, String model) {
		super();
		this.productNumber = productNumber;
		this.productName = productName;
		this.code = code;
		this.categoryA = categoryA;
		this.categoryB = categoryB;
		this.regdate = regdate;
		this.price = price;
		this.inventory = inventory;
		this.manufacturer = manufacturer;
		this.model = model;
	}



	public Product(int productNumber, String productName, String code, String categoryA, String categoryB, Date regdate,
			int price, int inventory, String manufacturer, String model, String summaryExplain, String keyword,
			String reddateInput, String managerMemo, String discount, int discountInput, String inventoryAmount,
			int inventoryInput, int point, int savePoint, String delivery, String brand, String explain,
			String detailExplain) {
		super();
		this.productNumber = productNumber;
		this.productName = productName;
		this.code = code;
		this.categoryA = categoryA;
		this.categoryB = categoryB;
		this.regdate = regdate;
		this.price = price;
		this.inventory = inventory;
		this.manufacturer = manufacturer;
		this.model = model;
		this.summaryExplain = summaryExplain;
		this.keyword = keyword;
		this.reddateInput = reddateInput;
		this.managerMemo = managerMemo;
		this.discount = discount;
		this.discountInput = discountInput;
		this.inventoryAmount = inventoryAmount;
		this.inventoryInput = inventoryInput;
		this.point = point;
		this.savePoint = savePoint;
		this.delivery = delivery;
		this.brand = brand;
		this.explain = explain;
		this.detailExplain = detailExplain;
	}

	public int getProductNumber() {
		return productNumber;
	}

	public void setProductNumber(int productNumber) {
		this.productNumber = productNumber;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
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

	public int getInventory() {
		return inventory;
	}

	public void setInventory(int inventory) {
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

	public String getSummaryExplain() {
		return summaryExplain;
	}

	public void setSummaryExplain(String summaryExplain) {
		this.summaryExplain = summaryExplain;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getReddateInput() {
		return reddateInput;
	}

	public void setReddateInput(String reddateInput) {
		this.reddateInput = reddateInput;
	}

	public String getManagerMemo() {
		return managerMemo;
	}

	public void setManagerMemo(String managerMemo) {
		this.managerMemo = managerMemo;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public int getDiscountInput() {
		return discountInput;
	}

	public void setDiscountInput(int discountInput) {
		this.discountInput = discountInput;
	}

	public String getInventoryAmount() {
		return inventoryAmount;
	}

	public void setInventoryAmount(String inventoryAmount) {
		this.inventoryAmount = inventoryAmount;
	}

	public int getInventoryInput() {
		return inventoryInput;
	}

	public void setInventoryInput(int inventoryInput) {
		this.inventoryInput = inventoryInput;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public int getSavePoint() {
		return savePoint;
	}

	public void setSavePoint(int savePoint) {
		this.savePoint = savePoint;
	}

	public String getDelivery() {
		return delivery;
	}

	public void setDelivery(String delivery) {
		this.delivery = delivery;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getExplain() {
		return explain;
	}

	public void setExplain(String explain) {
		this.explain = explain;
	}

	public String getDetailExplain() {
		return detailExplain;
	}

	public void setDetailExplain(String detailExplain) {
		this.detailExplain = detailExplain;
	}

	@Override
	public String toString() {
		return "Product [productNumber=" + productNumber + ", productName=" + productName + ", code=" + code
				+ ", categoryA=" + categoryA + ", categoryB=" + categoryB + ", regdate=" + regdate + ", price=" + price
				+ ", inventory=" + inventory + ", manufacturer=" + manufacturer + ", model=" + model
				+ ", summaryExplain=" + summaryExplain + ", keyword=" + keyword + ", reddateInput=" + reddateInput
				+ ", managerMemo=" + managerMemo + ", discount=" + discount + ", discountInput=" + discountInput
				+ ", inventoryAmount=" + inventoryAmount + ", inventoryInput=" + inventoryInput + ", point=" + point
				+ ", savePoint=" + savePoint + ", delivery=" + delivery + ", brand=" + brand + ", explain=" + explain
				+ ", detailExplain=" + detailExplain + "]";
	}
	
	


}