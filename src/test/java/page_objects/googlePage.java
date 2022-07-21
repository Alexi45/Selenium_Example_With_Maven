package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class googlePage extends BasePAGE {

	By search_bar = By.name("q");
	By accept_cooki = By.id("L2AGLb");

	
	public googlePage(WebDriver driver) {
		super(driver);
	}

	public void search_for_something(String text_to) {
		WebElement search_bar_element = this.driver.findElement(By.name("q"));
		search_bar_element.sendKeys(text_to);
		search_bar_element.sendKeys(Keys.ENTER);
	}


	 public void accept() {
		 this.driver.findElement(accept_cooki).click();
		 
	 }
}
