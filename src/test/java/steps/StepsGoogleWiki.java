package steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java8.En;
import page_objects.WikipediaPage;
import page_objects.googlePage;
import page_objects.googleSearchResultPage;

public class StepsGoogleWiki implements En {

	WebDriver driver;
	
	public StepsGoogleWiki() {
		
		Before(()->{

			System.setProperty("webdriver.chrome.driver", "D:/descargas/chromedriver.exe");

			
			driver = new ChromeDriver();
			
			try {
				Thread.sleep(3000);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.google.com");
		});
		
		Given("Nos encontramos en la pagina de google", () ->{
			googlePage google_page = new googlePage(driver);
			google_page.accept();
			
		});
		
		When("Buscamos wikipedia y entramos en el primer resultado", () ->{
			googlePage google_page = new googlePage(driver);
			google_page.search_for_something("wikipedia");
			assertEquals("wikipedia - Buscar con Google", driver.getTitle());
			googleSearchResultPage search_page = new googleSearchResultPage(driver);
			search_page.click_on_first_result();
		});

		Then("El titulo del articulo bueno del dia es {string}", (String text) ->{
			WikipediaPage wiki = new WikipediaPage(driver);
			String articuloBuenoTitlte = wiki.getArticuloBuenoTitle();
			assertEquals(text, articuloBuenoTitlte );
		});
		
		After(()->{
			driver.quit();
			
			
			
		});
	}
	
	
}
