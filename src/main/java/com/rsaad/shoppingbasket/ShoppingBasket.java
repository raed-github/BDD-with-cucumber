package com.rsaad.shoppingbasket;

import java.util.List;

public class ShoppingBasket {
	private List<Item> items;
	
	public ShoppingBasket(List<Item> items) {
		this.items = items;
	}

	public Double getTotal() {
		return items.stream().mapToDouble(item->item.getUnitPrice()*item.getQuantity()).sum();
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

}
