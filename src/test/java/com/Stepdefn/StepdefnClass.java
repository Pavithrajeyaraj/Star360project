package com.Stepdefn;
import org.openqa.selenium.WebDriver;

import com.Base.BaseClass;
import com.Pojo.Pojoclass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class StepdefnClass extends BaseClass {
	@Given("Click the Myaccount button")
	public void click_the_Myaccount_button() {
		Pojoclass p = new Pojoclass();
		click(p.getmyaccount());
		}
	@When("Already user has account in it give the email and password and click sign up button")
	public void already_user_has_account_in_it_give_the_email_and_password_and_click_sign_up_button() {
		Pojoclass p = new Pojoclass();
		fill(p.getRegemail(),"pavithrajeyaraj@gmail.com");
		fill(p.getRegpassword(),"9095171872");
		click(p.getRegsignup());    
	}
	@When("User forgets the password click the forget password link")
	public void user_forgets_the_password_click_the_forget_password_link() {
		Pojoclass p = new Pojoclass();
		click(p.getRegforgetpassword());
	}
	@When("User enters the email to receive the password link then click submit button")
	public void user_enters_the_email_to_receive_the_password_link_then_click_submit_button() {
	    Pojoclass p = new Pojoclass();
	    fill(p.getForgetpassword(), "pavithrajeyaraj@gmail.com");
	    click(p.getForgetsubmit());    
	}
	@Given("New customers click the create account")
	public void new_customers_click_the_create_account() {
		Pojoclass p = new Pojoclass();
		click(p.getNewcreateaccount());  
	}
	@Given("User enters the personal information as fname, lname and email and click signup")
	public void user_enters_the_personal_information_as_fname_lname_and_email_and_click_signup() {
		Pojoclass p = new Pojoclass();
		fill(p.getNewfname(), "pavithra");
		fill(p.getNewlname(),"jeyaraj");
		fill(p.getNewemail(),"pavithrajeyaraj@gmail.com");
		click(p.getNewsignup());
	}
	@Given("User enters the signin information password and confirm password")
	public void user_enters_the_signin_information_password_and_confirm_password() {
		Pojoclass p = new Pojoclass();
		fill(p.getNewpassword(),"9095171872");
		fill(p.getNewconfirmpassword(),"9095171872");
	}
	@Then("User clicks the create an account button")
	public void user_clicks_the_create_an_account_button() {
		Pojoclass p = new Pojoclass();
		click(p.getNewclickaccount());
	}	
}
