package sample;
import org.openqa.selenium.By; 
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class MyApp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahsan\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 // Navigate to the website
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize(); 
        
        Thread.sleep(4000);

        // Find the username field and enter "standard_user"
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        // Find the password field and enter "secret_sauce"
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        // Click the login button
        driver.findElement(By.id("login-button")).click();
        
        Thread.sleep(4000);

        // Find the "Sauce Labs Backpack" product and click the "Add to Cart" button
        driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']/ancestor::div[@class='inventory_item']//button"))
              .click();
        
        Thread.sleep(4000);

        // Find the "Sauce Labs Fleece Jacket" product and click the "Add to Cart" button
        driver.findElement(By.xpath("//div[text()='Sauce Labs Fleece Jacket']/ancestor::div[@class='inventory_item']//button"))
              .click();
        
        Thread.sleep(4000);

        // Click the shopping cart icon to go to the cart page
        driver.findElement(By.className("shopping_cart_container")).click();
        
        Thread.sleep(4000);

        // Click the "CHECKOUT" button to go to the "Checkout: Your Information" page
        driver.findElement(By.className("checkout_button")).click();
        
        Thread.sleep(4000);

        // Find the first name field and enter "John"
        driver.findElement(By.id("first-name")).sendKeys("Rakib");

        // Find the last name field and enter "Doe"
        driver.findElement(By.id("last-name")).sendKeys("Ahsan");

        // Find the zip code field and enter "12345"
        driver.findElement(By.id("postal-code")).sendKeys("2016331039");
        
        Thread.sleep(4000);

        // Click the "CONTINUE" button to go to the "Checkout: Overview" page
        driver.findElement(By.className("cart_button")).click();
        
        Thread.sleep(4000);

        // Click the "FINISH" button to complete the order
        driver.findElement(By.className("cart_button")).click();
        
        Thread.sleep(4000);

        // Close the browser
        driver.quit();
		
		
			
	}		
	

}
