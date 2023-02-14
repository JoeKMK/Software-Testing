import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class TC013_RadioButtonSelect {
@Test
public  void RadioButton() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
// Navigate to the URL
driver.get("http://www.echoecho.com/htmlforms10.htm");
// Sleep for 5 seconds
Thread.sleep(5000);
// Store all the elements of the same category in the list of WebLements.
List<WebElement> list = driver.findElements(By.name("radio1"));
// Create a boolean variable to store true/false.
Boolean is_selected = list.get(0).isSelected();
// If 'is_selected' is true that means the first radio button is
// selected.
if (is_selected == true) {
	                        // If the first radio button is selected by default then,
	                        // select the second radio button.
	                        list.get(1).click();
	                    } else {
	                        // If the first radio button is not selected then, click the first
	                        // radio button.
	                        list.get(0).click();
	                    }
	                }
	            }







