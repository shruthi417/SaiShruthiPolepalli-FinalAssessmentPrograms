//Cucumber Assessment
/*6. Cucumber
a)	Write program to login to HRM Login
b)	Write program to apply leave
c)	User method over loading for searching as discussed in the class assignment
*/

package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HRMLoginTest {
	private static WebDriver driver = null;

	//Opening the website
	@Given("browser is open and application is in login page")
	public void browser_is_open_and_application_is_in_login_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Shruthi\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
	}
	//Entering user name and password
	@When("user enters user name and password")
	public void user_enters_user_name_and_password() {
		
	    
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}
	
	@Then("home page is displayed")
	public void home_page_is_displayed( ) {
	    
	   String act,exp;
	   exp="PIM";
	   act=driver.findElement(By.xpath("//img[@alt='client brand banner']")).getText();
	 
	 
		SoftAssert s=new SoftAssert();
		s.assertEquals(act, exp);	}
	//apply leave
	@Then("apply leave")
	public void apply_leave( ) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.linkText("Leave")).click();
		driver.findElement(By.xpath("//li//a[@class='oxd-topbar-body-nav-tab-item']")).click();
		driver.findElement(By.xpath("//div[@class='oxd-select-text-input']")).click();
		driver.findElement(By.xpath("//*[contains(text(),'CAN')]")).click();
		
		driver.findElement(By.xpath("//div[@class='oxd-date-input']//input")).sendKeys("2022-09-22");
		driver.findElement(By.xpath("//textarea")).sendKeys("Not well");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	}
	//Search Employee
	@Then("search employees")
	public void search_employees() throws InterruptedException {
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
		
		
		d.findElement(By.xpath("//form//input[@class='oxd-input oxd-input--active']")).sendKeys(username);
		d.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);

	}
  static void search1(String username,String Employeename,WebDriver d) throws InterruptedException {
			
			
			d.findElement(By.xpath("//form//input[@class='oxd-input oxd-input--active']")).sendKeys(username);
			d.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(Employeename);
			d.findElement(By.xpath("//button[@type='submit']")).click();


		}
	


}
