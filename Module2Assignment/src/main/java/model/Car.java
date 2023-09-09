/**
 * @author Alec Smith - ajsmith44 
 * CIS175 Fall 2023
 * Sep 8, 2023
 */
package model;

/**
 * 
 */
public class Car {
	private int yearModel;
	private String brand;
	private int unitPrice;
	private int lotNumber;
	private boolean sold;

	public Car(String b, int year, int price, int number) {
		yearModel = year;
		brand = b;
		unitPrice = price;
		lotNumber = number;
		sold = false;
	}

	public int getYear() {
		return yearModel;
	}

	public String getBrand() {
		return brand;
	}

	public int getPrice() {
		return unitPrice;
	}

	public int getLotNumber() {
		return lotNumber;
	}

	public boolean getSold() {
		return sold;
	}

	public void setYear(int year) {
		yearModel = year;
	}

	public void setBrand(String carBrand) {
		brand = carBrand;
	}

	public void setPrice(int price) {
		unitPrice = price;
	}

	public void setLotNumber(int number) {
		lotNumber = number;
	}

	public void setSold(boolean sold) {
		this.sold = sold;
	}
	
	public void sellCar() {
		sold = true;
		lotNumber = 0;
	}
}