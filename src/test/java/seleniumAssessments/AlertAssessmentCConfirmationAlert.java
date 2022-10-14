//Confirmation Alert Assessment

package seleniumAssessments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAssessmentCConfirmationAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Shruthi\\chromedriver.exe");//chrome driver exe file path
		  WebDriver driver = new ChromeDriver();
		
		  driver.get("https://demo.automationtesting.in/Alerts.html");
		 
		  driver.findElement(By.linkText("Alert with OK & Cancel")).click();//finding element using linkText
		  driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();//finding element using xpath
		  Alert Alertbox=driver.switchTo().alert();
	  Thread.sleep(2000);
		  Alertbox.accept();

	}

}
