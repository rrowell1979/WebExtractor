package prototype;

import java.io.File;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Extractor {
	public Product parseProductAttributes(String id, String retailer, String tld)
	{
		String url = "https://www.walmart.com/ip/" + id;

			File file = new File("src/chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
			WebDriver driver = new ChromeDriver();
			
			
			Product product = new Product(id, retailer, tld, null, null, null);
			driver.navigate().to(url);;
			String title = driver.findElement(By.xpath("//div[@class='ProductTitle']/h1")).getAttribute("content");
			String price = driver.findElement(By.xpath("//div[@class='prod-PriceHero']/span/span/span/span[@itemprop='price']")).getAttribute("content");
			String description = driver.findElement(By.xpath("//div[@class='about-desc']")).getText();getClass();
			String store = retailer;
			System.out.println("Title: " + title);
			System.out.println("Price: " + price);
			System.out.println("Description: " + description);
			System.out.println();
			System.out.println();
			
			product.setDescription(description);
			product.setPrice(Double.parseDouble(price));
			product.setTitle(title);

			driver.close();
			driver.quit();
			return product;
	}
	public Product[] parseProductAttributes(String[] ids, String retailer, String tld)
	{
		
		File file = new File("src/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		WebDriver driver = new ChromeDriver();
		Product[] productArray = new Product[ids.length];
		Product product;
		String store;
		String price;
		String description;
		String title;

		int counter = 0;
		String url;
		
		for(String id: ids)
		{
			url = "https://www.walmart.com/ip/" + id;
			product = new Product(id, retailer, tld, null, null, null);
			driver.navigate().to(url);;
			title = driver.findElement(By.xpath("//div[@class='ProductTitle']/h1")).getAttribute("content");
			price = driver.findElement(By.xpath("//div[@class='prod-PriceHero']/span/span/span/span[@itemprop='price']")).getAttribute("content");
			description = driver.findElement(By.xpath("//div[@class='about-desc']")).getText();getClass();
			store = retailer;
			System.out.println("Title: " + title);
			System.out.println("Price: " + price);
			System.out.println("Description: " + description);
			System.out.println();
			System.out.println();
			
			product.setDescription(description);
			product.setPrice(Double.parseDouble(price));
			product.setTitle(title);
			productArray[counter] = product;
			
			counter++;
			
			product = null;
			price = null;
			description = null;
			title = null;
			
		}
			driver.close();
			driver.quit();
			
			return productArray;
	}

}