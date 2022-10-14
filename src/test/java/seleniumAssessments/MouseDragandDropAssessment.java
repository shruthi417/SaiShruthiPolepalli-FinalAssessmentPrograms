//Mouse Drag and Drop Assessment

package seleniumAssessments;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseDragandDropAssessment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","C:\\Shruthi\\chromedriver.exe");//Chrome driver exe file path
        WebDriver driver = new ChromeDriver();//Chrome driver object
        driver.get("http://www.jqueryui.com/");

        
		driver.manage().window().maximize();//maximizing the window
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Draggable")).click();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		//Thread.sleep(20000);
		Actions mouse=new Actions(driver);
		mouse.dragAndDropBy(driver.findElement(By.id("draggable")),100,100).build().perform();//Using drag and drop by method
		Thread.sleep(10000);
                



	}

}
