//Prompt Alert
package seleniumAssessments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAssessmentBPromptAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Shruthi\\chromedriver.exe");//Chrome driver exe file path
		  WebDriver driver = new ChromeDriver();
		
		  driver.get("https://demo.automationtesting.in/Alerts.html");
		 
		  driver.findElement(By.linkText("Alert with Textbox")).click();//finding element using linkText
		  driver.findElement(By.cssSelector("button.btn.btn-info")).click();//finding element using cssSelector
		  driver.switchTo().alert().sendKeys("Shruthi");
		  Alert Alertbox=driver.switchTo().alert();
	  Thread.sleep(2000);
		  Alertbox.accept();

	}

}
