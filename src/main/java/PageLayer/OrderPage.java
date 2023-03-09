package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.UtilsClass;

public class OrderPage extends BaseClass {
	@FindBy(xpath = "(//a[@href='/computers'])[3]")
	private WebElement complink;

	@FindBy(xpath = "(//div[@class='sub-category-item'])[1]")
	private WebElement deskbutton;
	
	@FindBy(xpath = "//span[text()='1800.00']")
	private WebElement prise;

	@FindBy(xpath = "(//input[@value='Add to cart'])[1]")
	private WebElement addTocart;

	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement shopping;
	
	@FindBy(xpath = "//input[@id='termsofservice']")
	private WebElement checkbox;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement checkout;
	

	public OrderPage() {
		PageFactory.initElements(driver, this);
	}
	public void clickOnCompLink() {
		UtilsClass.clickOnElement(complink);
	
	}

	public void clickonDeskButton() {
		UtilsClass.clickOnElement(deskbutton);
	}	
	public void clickonPriseButton() {
		UtilsClass.clickOnElement(prise);
	}
	public void clickonAddTocartButton() {
		UtilsClass.clickOnElement(addTocart);
	}
	public void clickonShoppingButton() {
		UtilsClass.clickOnElement(shopping);
	}
	public void clickonCheckBoxButton() {
		UtilsClass.clickOnElement(checkbox);
	}
	public void clickonCheckOutButton() {
		UtilsClass.clickOnElement(checkout);

}
}
