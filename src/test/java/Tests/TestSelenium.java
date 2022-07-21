package Tests;


import static org.junit.Assert.assertEquals;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page_objects.WikipediaPage;
import page_objects.googlePage;
import page_objects.googleSearchResultPage;


public class TestSelenium {
	/*
	WebDriver driver;
	
	
	@BeforeEach
	public void starting() {
	 
		System.setProperty("webdriver.chrome.driver", "D:/descargas/chromedriver.exe");

		
		driver = new ChromeDriver();
		
		try {
			Thread.sleep(3000);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
	}

	
	@Test
	public void testA() {
		googlePage google_page = new googlePage(driver);
		google_page.accept();
		google_page.search_for_something("wikipedia");
		assertEquals("wikipedia - Buscar con Google", driver.getTitle());
		googleSearchResultPage search_page = new googleSearchResultPage(driver);
		search_page.click_on_first_result();
		WikipediaPage wiki = new WikipediaPage(driver);
		String articuloBuenoTitlte = wiki.getArticuloBuenoTitle();
		assertEquals("Miles Away", articuloBuenoTitlte );
	}

	@AfterEach
	public void afterEach() {
	
	}*/
}
