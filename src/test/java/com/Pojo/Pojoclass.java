package com.Pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;

public class Pojoclass extends BaseClass {
	public Pojoclass() {
	PageFactory.initElements(driver, this);
	}
@FindBy(xpath="(//a[@href='https://starthreesixty.com/customer/account/'])[1]")
private WebElement myaccount;
@FindBy(xpath="//input[@name='login[username]']")
private WebElement regemail;
@FindBy(xpath="//input[@name='login[password]']")
private WebElement regpassword;
@FindBy(xpath="(//span[text()='Sign In'])[1]")
private WebElement regsignup;
@FindBy(xpath="(//span[text()='Forgot Your Password?'])[1]")
private WebElement regforgetpassword;
@FindBy(xpath="(//span[text()='Create an Account'])[1]")
private WebElement newcreateaccount;
@FindBy(xpath="//input[@name='firstname']")
private WebElement newfname;
@FindBy(xpath="//input[@name='lastname']")
private WebElement newlname;
@FindBy(xpath="//input[@name='email']")
private WebElement newemail;
@FindBy(xpath="//span[text()='Sign Up for Newsletter']")
private WebElement newsignup;
@FindBy(xpath="//input[@name='email']")
private WebElement forgetpassword;
@FindBy(xpath="//span[text()='Submit']")
private WebElement forgetsubmit;
@FindBy(xpath="(//input[@name='password'])[1]")
private WebElement newpassword;
@FindBy(xpath="//input[@name='password_confirmation']")
private WebElement newconfirmpassword;
@FindBy(xpath="(//span[text()='Create an Account'])[1]")
private WebElement newclickaccount;
@FindBy(xpath="//input[@class='input-search-distance input-sm pac-target-input']")
private WebElement distancesearch;
@FindBy(xpath="(//input[@class='input-text'])[1]")
private WebElement itemsearch;
@FindBy(xpath="(//label[@class='label'])[1]")
private WebElement itemclick;
@FindBy(xpath="//a[@data-product-id='99832']")
private WebElement quickbuy;
@FindBy(xpath="(//div[@class='swatch-option text'])[1]")
private WebElement size;//frames
@FindBy(xpath="//div[@class='swatch-option color selected']")
private WebElement color;
@FindBy(xpath="//button[@class='action primary tocart']")
private WebElement addtocart;


















public WebElement getItemsearch() {
	return itemsearch;
}
public WebElement getItemclick() {
	return itemclick;
}
public WebElement getQuickbuy() {
	return quickbuy;
}
public WebElement getSize() {
	return size;
}
public WebElement getColor() {
	return color;
}
public WebElement getAddtocart() {
	return addtocart;
}
public WebElement getDistancesearch() {
	return distancesearch;
}
public WebElement getNewpassword() {
	return newpassword;
}
public WebElement getNewconfirmpassword() {
	return newconfirmpassword;
}
public WebElement getNewclickaccount() {
	return newclickaccount;
}
public WebElement getNewfname() {
	return newfname;
}
public WebElement getMyaccount() {
	return myaccount;
}
public WebElement getForgetpassword() {
	return forgetpassword;
}
public WebElement getForgetsubmit() {
	return forgetsubmit;
}
public WebElement getNewlname() {
	return newlname;
}
public WebElement getNewemail() {
	return newemail;
}
public WebElement getNewsignup() {
	return newsignup;
}
public WebElement getNewcreateaccount() {
	return newcreateaccount;
}
public WebElement getRegforgetpassword() {
	return regforgetpassword;
}

public WebElement getRegsignup() {
	return regsignup;
}
public WebElement getRegemail() {
	return regemail;
}
public WebElement getRegpassword() {
	return regpassword;
}
public WebElement getmyaccount() {
	return myaccount;
}












}
