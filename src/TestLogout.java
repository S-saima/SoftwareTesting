	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;
	public class TestLogout {
	 @Test
	 public void test_logout() {
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
				driver.get("http://127.0.0.1:8000/dashboard");
				
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
			
				String expected_titles = "List";	
				String actual_titles = driver.getTitle();
				
				if(expected_titles.equals(actual_titles)) {
					System.out.println("Logout Successful");
				}
				else {
					System.out.println("Logout Failed");
				}								
			}
			else {
				System.out.println("Login Failed");
			}	
		}
		
	}

