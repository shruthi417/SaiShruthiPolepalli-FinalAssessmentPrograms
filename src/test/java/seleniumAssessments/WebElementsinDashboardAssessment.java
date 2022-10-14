//WebElements in home page

package seleniumAssessments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsinDashboardAssessment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Shruthi\\chromedriver.exe");//chrome driver.exe file path
		WebDriver driver = new ChromeDriver();//Chrome driver object
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//OrangeHRM site
		driver.manage().window().maximize();//To maximize window
		Thread.sleep(1000);
		//Login to OrangeHRM
		driver.findElement(By.name("username")).sendKeys("Admin");//using name and xpath
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();//using xpath
		
		//Clicking on web elements
		//Using Xpath
		driver.findElement(By.xpath("//span[normalize-space()='Admin']")).click();//Clicking Admin
		driver.findElement(By.xpath("//span[normalize-space()='Leave']")).click();//Clicking Leave  Using Xpath
		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();//Clicking PIM
		driver.findElement(By.xpath("//span[normalize-space()='Recruitment']")).click();//Clicking Recruitment
		
		//Using linkText
		/*driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Leave")).click();            
		driver.findElement(By.linkText("Recruitment")).click();*/
		

	}

}
