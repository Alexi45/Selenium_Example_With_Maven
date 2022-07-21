package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WikipediaPage extends BasePAGE{
	
	By articulo_bueno = By.xpath("//*[@id=\"Wallis_Simpson\"]/a");
	
	public WikipediaPage(WebDriver driver) {
		
		super(driver);

		
	}
	
	public String getArticuloBuenoTitle() {
		return this.driver.findElement(articulo_bueno).getAttribute("title");
	}
	
	
}
