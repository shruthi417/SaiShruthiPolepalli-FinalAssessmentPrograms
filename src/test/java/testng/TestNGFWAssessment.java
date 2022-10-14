//Testng Assessment

package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGFWAssessment {
	private static WebDriver driver = null;
	@BeforeMethod
	public void loginpage() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Shruthi\\chromedriver.exe");
		 driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		Thread.sleep(2000);
	}
	@Test(priority=0)
	public void login() {
	driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	driver.close();
	}

	@Test(priority=1)
	public void applyLeave() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Leave")).click();
		driver.findElement(By.xpath("//li//a[@class='oxd-topbar-body-nav-tab-item']")).click();
		driver.findElement(By.xpath("//div[@class='oxd-select-text-input']")).click();
		driver.findElement(By.xpath("//*[contains(text(),'CAN')]")).click();
		
		driver.findElement(By.xpath("//div[@class='oxd-date-input']//input")).sendKeys("2022-09-22");
		driver.findElement(By.xpath("//textarea")).sendKeys("Not well");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.close();
		

	}

	@Test(priority=2)
	public void search_employee( ) throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	
		Thread.sleep(1000);
		driver.findElement(By.linkText("Admin")).click();
		
		search1("Anthony.Nolan",driver);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--ghost']")).click(); //CLICKING ON CLEAR BUTTON
		search1("Charlie.Carter","Charlie Carter",driver);	
		
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--ghost']")).click(); //CLICKING ON CLEAR BUTTON
		
		driver.close();
	}

  
  
  static void search1(String username,WebDriver d) throws InterruptedException {
		
		// WebDriver driver = new ChromeDriver();
		d.findElement(By.xpath("//form//input[@class='oxd-input oxd-input--active']")).sendKeys(username);
		d.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);

	}
  static void search1(String username,String Employeename,WebDriver d) throws InterruptedException {
			
			// WebDriver driver = new ChromeDriver();
			d.findElement(By.xpath("//form//input[@class='oxd-input oxd-input--active']")).sendKeys(username);
			d.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(Employeename);
			d.findElement(By.xpath("//button[@type='submit']")).click();


		}
}
