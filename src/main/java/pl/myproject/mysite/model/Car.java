package pl.myproject.mysite.model;

import java.io.Serializable;

public class Car implements Serializable{
	private static final long serialVersionUID = -3131362819335135081L;
	private Integer id;
	private Integer year;
	private String brand;
	private String color;
public Car(Integer id, Integer year, String brand, String color) {
	this.id = id;
	this.year = year;
	this.brand = brand;
	this.color = color;
}

public Car() {
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public Integer getYear() {
	return year;
}

public void setYear(Integer year) {
	this.year = year;
}

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}
}