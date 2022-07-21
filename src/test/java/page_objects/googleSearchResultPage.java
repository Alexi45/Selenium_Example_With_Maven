package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class googleSearchResultPage extends BasePAGE {

	By first_result_url = By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div[1]/a/h3");

	public googleSearchResultPage(WebDriver driver) {
		super(driver);
	}

	public void click_on_first_result() {
		this.driver.findElement(first_result_url).click();
	}
}