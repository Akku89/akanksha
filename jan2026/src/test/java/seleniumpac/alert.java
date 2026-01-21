package seleniumpac;
 
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class alert {
 
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/alert");
		
		driver.findElement(By.id("accept")).click();
		
		Thread.sleep(5000);
		
		Alert Confirmalert=driver.switchTo().alert();
		System.out.println("confirm alert text:"+Confirmalert.getText());
		Confirmalert.accept();
		
	}
 
}
 
 