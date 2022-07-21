package page_objects;

import org.openqa.selenium.WebDriver;

public class BasePAGE {

	public WebDriver driver;
	
	public BasePAGE(WebDriver driver) {
		this.driver=driver;
	}
	
	public String getTitle() {
		return this.driver.getTitle();
	}
	
}
