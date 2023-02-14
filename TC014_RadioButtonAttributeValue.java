	import java.util.List;
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class TC014_RadioButtonAttributeValue {
	@Test
	   public void RadioButton() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chrome\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	    // Navigate to the URL
	    driver.get("http://www.echoecho.com/htmlforms10.htm");
	    // Sleep for 5 seconds
	    Thread.sleep(12000);
	    // Find the checkbox or radio button element by its name.
	    List<WebElement> list = driver.findElements(By.name("radio1"));
	    // Get the number of checkboxes available.
	    int count = list.size();
	    System.out.println(count);
	    // Now, iterate the loop from first checkbox to last checkbox.
	    for (int i = 0; i < count; i++) {
	    // Store the checkbox name to the string variable, using 'Value'
	    // attribute
	    String sValue = list.get(i).getAttribute("type");
	    System.out.println(sValue);
	    // Select the checkbox if its value is the same that you want.
	    if (sValue.equalsIgnoreCase("radio")) {
	    list.get(i).click();
	    // This statement will get you out of the for loop.
	    break;
	            }
	    driver.quit();

	        }
	    }
	}





