package TestLayer;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.OrderPage;

public class OrderPageTest extends BaseClass {
	
	@BeforeClass
	public void setUp() {
		BaseClass.inilitization();
	}

	@Test
	public void validateLoginFunctionality() {
		OrderPage orderpage = new OrderPage();
		orderpage.clickOnCompLink();
		orderpage.clickonDeskButton();
		orderpage.clickonPriseButton();
		orderpage.clickonAddTocartButton();
		orderpage.clickonShoppingButton();
		orderpage.clickonCheckBoxButton();
		orderpage.clickonCheckOutButton();
	}
	@AfterClass
	public void tearDown() {
		//driver.quit();

}
}
