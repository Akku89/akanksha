package seleniumpac;
 
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
import java.util.List;
 
public class lab5_2 {
 
    public static void main(String[] args) {
 
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
 
        driver.get("https://tutorialsninja.com/demo");
        driver.manage().window().maximize();
 
        driver.findElement(By.xpath("//span[text()='My Account']")).click();
        driver.findElement(By.linkText("Register")).click();
 
        driver.findElement(By.id("input-firstname")).sendKeys("Akankshaaaaaaaaaaaaaaaaaaaaaaaaaa");
        driver.findElement(By.id("input-lastname")).sendKeys("Choudharyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy");
        driver.findElement(By.id("input-email")).sendKeys("akch@mail.com");
        driver.findElement(By.id("input-telephone")).sendKeys("92");
 
        driver.findElement(By.xpath("//input[@value='Continue']")).click();
 
        List<WebElement> errors = driver.findElements(By.cssSelector(".text-danger"));
        for (WebElement e : errors) {
            System.out.println("Error: " + e.getText());
        }
 
        /*driver.quit();*/
    }
}
