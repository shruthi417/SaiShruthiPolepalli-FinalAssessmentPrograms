//Simple Alert Assessment

package seleniumAssessments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAssessmentA {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Shruthi\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		
		  driver.get("https://demo.automationtesting.in/Alerts.html");
		 
		  driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		  Alert Alertbox=driver.switchTo().alert();
		 
	  Thread.sleep(2000);
		  Alertbox.accept();

	}

}
