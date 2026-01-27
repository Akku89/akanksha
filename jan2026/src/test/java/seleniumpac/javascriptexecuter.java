package seleniumpac;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javascriptexecuter {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        Thread.sleep(5000);
        JavascriptExecutor js=(JavascriptExecutor)driver;
        //js.executeScript("alert('hello from selenium')");
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}

}
