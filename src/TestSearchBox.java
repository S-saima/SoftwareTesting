import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import dev.failsafe.internal.util.Assert;

public class TestSearchBox {
 @Test
	public void test_search() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:8000/list");
		
		driver.findElement(By.name("searchbox")).sendKeys("shirt");
		//driver.findElement(By.name("password")).sendKeys("Asd@1234");
		driver.findElement(By.id("submit")).click();
		
		String expected_title = "Search";	
		String actual_title = driver.getTitle();
		
		if(expected_title.equals(actual_title)) {
			System.out.println("Search Successful");
		}
		else {
			System.out.println("Search Failed");
		}	
	}
}


