package gc.entity;

import java.util.Date;

public class Product {
   private int id;
   private String name;
   private String code;
   private int price;
   private int stock;
   private String maker;
   private String brand;
   
   public Product() {
	// TODO Auto-generated constructor stub
}

public Product(int id, String name, String code, int price, int stock, String maker, String brand) {
	super();
	this.id = id;
	this.name = name;
	this.code = code;
	this.price = price;
	this.stock = stock;
	this.maker = maker;
	this.brand = brand;
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

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public int getStock() {
	return stock;
}

public void setStock(int stock) {
	this.stock = stock;
}

public String getMaker() {
	return maker;
}

public void setMaker(String maker) {
	this.maker = maker;
}

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", code=" + code + ", price=" + price + ", stock=" + stock
			+ ", maker=" + maker + ", brand=" + brand + "]";
}

   
   
	
}
