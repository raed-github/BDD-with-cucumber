package com.rsaad.shoppingbasket;

public class Item {
	private Double unitPrice;
	private int quantity;
	
	public Item(Double unitPrice, int quantity) {
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
