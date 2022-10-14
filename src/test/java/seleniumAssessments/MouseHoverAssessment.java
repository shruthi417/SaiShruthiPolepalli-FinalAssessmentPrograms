//Mouse Hover Assessment

package seleniumAssessments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAssessment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Shruthi\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(500);
		//Login to OrangeHRM
		driver.findElement(By.name("username")).sendKeys("Admin");//using name 
		driver.findElement(By.name("password")).sendKeys("admin123");//using name
		driver.findElement(By.xpath("//button[@type='submit']")).click();//using xpath
		Actions mouse=new Actions(driver);//Actions object
		driver.manage().window().maximize();
		
		//To Hover on elements
		mouse.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Configuration ')]"))).build().perform();
		mouse.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Add Employee')]"))).build().perform();
		mouse.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Reports')]"))).build().perform();
		Thread.sleep(1000);

	}

}
