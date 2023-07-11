package com.rsaad.shoppingbasket;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import com.rsaad.shoppingbasket.Item;
import com.rsaad.shoppingbasket.ShoppingBasket;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShoppingCardSteps {

	private ShoppingBasket shoppingBasket;
	private double result;
	
	@Given("^Empty basket$")
	public void iUseEmptyBasket() {
		shoppingBasket = new ShoppingBasket(new ArrayList<>());
	}
	
	@Given("^Basket with one item$")
	public void iUseBasketWithOneItem() {
		shoppingBasket = buildBasketWithItems(new Item(100.0,1));
	}
	
	@Given("^Basket with multiple items$")
	public void basketWithMultipleItems() {
		shoppingBasket = buildBasketWithItems(new Item(100.0, 1), new Item(200.0, 2));
	}
	
	@When("^Calculate total price$")
	public void getTotalPrice() {
		result = shoppingBasket.getTotal();
	}
	
	@Then("^Result should be 0.0$")
	public void resultShouldBeZero() {
		assertEquals(0.0,result,0.0);
	}
	
	@Then("^Result should be 100.0$")
	public void resultShouldBeHoundered() {
		assertEquals(100.0,result,0.0);
	}
			
	@Then("^Result should be 500.0$")
	public void resultShouldBeFiveHoundered() {
		assertEquals(500.0,result,0.0);
	}
	
	public ShoppingBasket buildBasketWithItems(Item... items) {
		return new ShoppingBasket(Arrays.asList(items));
	}
}
