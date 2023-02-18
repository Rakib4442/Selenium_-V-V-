package sample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SaucedemoTest {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahsan\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize(); 
    }


    
    @Test
    public void goToOrderTest() throws InterruptedException {
    	// Navigate to the website
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(4000);
        
        // Login to the system as "standard_user"
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(4000);
        
        // add products to cart
        WebElement sauceBackpack = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        sauceBackpack.findElement(By.xpath("./ancestor::div[@class='inventory_item']//button")).click();
        WebElement sauceJacket = driver.findElement(By.xpath("//div[text()='Sauce Labs Fleece Jacket']"));
        Thread.sleep(4000);
        sauceJacket.findElement(By.xpath("./ancestor::div[@class='inventory_item']//button")).click();
        Thread.sleep(4000);

        // Go to cart
        WebElement cartIcon = driver.findElement(By.className("shopping_cart_link"));
        cartIcon.click();
        driver.findElement(By.className("checkout_button")).click();
        
       

        // Find the first name field and enter "Rakib"
        driver.findElement(By.id("first-name")).sendKeys("Rakib");

        // Find the last name field and enter "Ahsan"
        driver.findElement(By.id("last-name")).sendKeys("Ahsan");

        // Find the zip code field and enter "2016331039"
        driver.findElement(By.id("postal-code")).sendKeys("2016331039");
        Thread.sleep(4000);
        

        // Click the "CONTINUE" button to go to the "Checkout: Overview" page
        driver.findElement(By.className("cart_button")).click();
        Thread.sleep(4000);
        
        

        // Click the "FINISH" button to complete the order
        driver.findElement(By.className("cart_button")).click();
        Thread.sleep(4000);
        
        driver.quit();

        
      
    }
    
}
	  
	  