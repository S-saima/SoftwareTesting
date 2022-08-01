

	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	public class TestOrder {
	 @Test
	 public void test_order() {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://127.0.0.1:8000/login");
			
			driver.findElement(By.name("id")).sendKeys("mr.anjumfaisal@gmail.com");
			driver.findElement(By.name("password")).sendKeys("Asd@1234");
			driver.findElement(By.id("submit")).click();
			
			String expected_title = "dashboard";	
			String actual_title = driver.getTitle();
			
			if(expected_title.equals(actual_title)) {
				System.out.println("Login Successful");
				driver.get("http://127.0.0.1:8000/cart");
				
				driver.findElement(By.name("Shipping_place")).sendKeys("Dhaka");
				driver.findElement(By.name("Payment_type")).sendKeys("Bkash");
				driver.findElement(By.id("submit")).click();
				
				String expected_titles = "dashboard";	
				String actual_titles = driver.getTitle();
				
				if(expected_titles.equals(actual_titles)) {
					System.out.println("Order Confirm Successful");
				}
				else {
					System.out.println("Order Failed");
				}	
			}
			else {
				System.out.println("Login Failed");
			}	
		}
		
	}

