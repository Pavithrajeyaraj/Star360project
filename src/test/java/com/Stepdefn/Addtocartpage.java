package com.Stepdefn;

import com.Base.BaseClass;
import com.Pojo.Pojoclass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Addtocartpage extends BaseClass{
	@Given("User enters the product and click search button")
	public void user_enters_the_product_and_click_search_button() {
	    Pojoclass p = new Pojoclass();
	   fill(p.getItemsearch(), "Sandals");
	   click(p.getItemclick());
	}
	@When("User click the item")
	public void user_click_the_item() {
		 Pojoclass p = new Pojoclass();
		 click(p.getQuickbuy());
	}
	@When("user enters the size and color and quantity")
	public void user_enters_the_size_and_color_and_quantity() {
		 Pojoclass p = new Pojoclass();
		 driver.switchTo().frame("iFrame99832");
		 click(p.getSize());
		 click(p.getColor());
	}
	@Then("User click the add to cart")
	public void user_click_the_add_to_cart() {
		 Pojoclass p = new Pojoclass();
		 click(p.getAddtocart());  
	}
}
