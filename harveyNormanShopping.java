package harveyNormanShopping;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class harveyNormanShopping {
	WebDriver driver;
	
	@Test(priority=1)
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kyawm\\eclipse-workspace\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.harveynorman.com.au/");
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);		
	}
	@Test(priority=2)
	public void ClickOnFirstItem() {
		//locators--xpath and linktext
		//clicked on Account link
		//driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/ul/li[5]/a")).click();
		driver.findElement(By.xpath("//img[@class='photo photo-category lazy']")).click();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	}
	@Test(priority=3)
	public void Select() {
		//locators--xpath and linktext
		//clicked on Account link
		//driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/ul/li[5]/a")).click();
	
			org.openqa.selenium.support.ui.Select select = new org.openqa.selenium.support.ui.Select(driver.findElement(By.id("select_999999900")));
		  select.selectByVisibleText("1 year Product Care");
	}
	  @Test(priority=4)
	     public void addToCart() {
	    	 
	    	 driver.findElement(By.xpath("//button[contains(@id,\"btn-add-to-cart\")]")).click();
	    	  driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	    	 
	     }
	  @Test(priority=5)
	  public void myCart() throws InterruptedException {
		 driver.findElement(By.xpath("//a[contains(@class,\"btn btn_lg btn_success tracked\")]")).click();
		 driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS); 
		 //pop-up window
		   Thread.sleep(5000); //wait for the modal message to appear
		    String winHandleBefore = driver.getWindowHandle();
		    driver.findElement(By.xpath("//a[contains(@class,\"close pull-right notify_close_0\")]")).click();
		    Thread.sleep(2000);
		    driver.switchTo().window(winHandleBefore);
		    driver.manage().timeouts().pageLoadTimeout(8, TimeUnit.SECONDS);
	/*	NOT FOR THIS CASE 
	 * Set<String> set =  driver.getWindowHandles();
		 List<String> list = new ArrayList<>(set);

		 // store your main window handle in variable
		 String mainWindow = list.get(0);

		  //To close all unwanted popup
		 for(int i =1; i <list.size(); i++)
		 {
		     String unwantedPopup = list.get(i);
		     driver.switchTo().window(unwantedPopup);
		     driver.close();
		 }
		 // Switch back to your main window
		 driver.switchTo().window(mainWindow);
		 
		 
	  test = driver.switchTo().alert().getText();
	 System.out.println(test);
	 alt.accept();
	 driver.switchTo().alert().dismiss();
	 driver.findElement(By.xpath("//a[contains(@class,\"close pull-right notify_close_0\")]")).click();
		 */
	  }
	  
	  @Test(priority=6)
	  public void Continue() {
		  driver.findElement(By.xpath("//*[@id=\"topCartContent\"]/div/div[2]/div[2]/div/a")).click();
		  driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		  //driver.findElement(By.linkText("CONTINUE")).click();
		//  driver.findElement(By.xpath("//*[@id=\"topCartContent\"]/div/div[2]/div[2]/div/a")).click();
	  }
	  @Test(priority=7)
	  public void freeDelivery() {
		  driver.findElement(By.xpath("//input[contains(@class,'shipmethod')]")).click();
	}
	  @Test(priority=8)
	  public void selectStoreAndPostcode() {
		  driver.findElement(By.xpath("//a[contains(@id,\"store_select_btn\")]")).click();
		  driver.manage().timeouts().pageLoadTimeout(8, TimeUnit.SECONDS);  
	} 
//	  @Test(priority=9)
//	  public void postCode() {
//		  
//		  String winHandleBefore = driver.getWindowHandle();
//		  driver.switchTo().window(winHandleBefore);
//		  
//		  driver.findElement(By.linkText("Enter postcode")).sendKeys("3030");
//		  driver.manage().timeouts().pageLoadTimeout(8, TimeUnit.SECONDS);  
//		//input[contains(@class,\"auto_box form-control\")]
//		  
//		  driver.findElement(By.linkText("FIND STORES")).click();
//		  driver.manage().timeouts().pageLoadTimeout(8, TimeUnit.SECONDS);  
//		//button[contains(@id,\"submit_postcode\")]
//		  
//		  driver.findElement(By.linkText("SELECT")).click();
//		  driver.manage().timeouts().pageLoadTimeout(8, TimeUnit.SECONDS);  
//		//a[@href="javascript:void(0)"]
//		//a[contains(@class,'btn btn_block btn_primary')]
//		  driver.switchTo().window(winHandleBefore);
//		  driver.manage().timeouts().pageLoadTimeout(8, TimeUnit.SECONDS);  
//		  
//	}   
//	  @Test(priority=10)
//	  public void continueToCheckout() {
//		  driver.findElement(By.xpath("//a[contains(@id,\"btn_checkout\")]")).click();
//		  driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS); 
//	} 
//	  @Test(priority=11)
//	  public void firstName() {
//		  driver.findElement(By.xpath("//input[contains(@id,\"billing:firstname\")]")).sendKeys("kyaw");
//	} 
	  
}