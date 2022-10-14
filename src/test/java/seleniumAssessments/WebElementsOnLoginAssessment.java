//Login using web elements
package seleniumAssessments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsOnLoginAssessment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Shruthi\\chromedriver.exe");//Finding path of Chromedriver exe file
		WebDriver driver = new ChromeDriver();
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(500);
		driver.findElement(By.name("username")).sendKeys("Admin");//Sending keys using name
		driver.findElement(By.name("password")).sendKeys("admin123");//Sending keys using name
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//Using Xpath
		/*driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();*/

		

	}

}
