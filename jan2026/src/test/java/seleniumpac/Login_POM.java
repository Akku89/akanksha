package seleniumpac;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
 
public class Login_POM {
	WebDriver  driver;
	
	By username=By.name("username");
	By Password=By.name("password");
	By submitbutton=By.xpath("//button[@type='submit']");
	By dashboard=By.xpath("//h6[text()='Dashboard']");
	
	public Login_POM(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}
	public void enterusername(String uname)
	{
		driver.findElement(username).sendKeys(uname);
		
	}
	public void enterpassword(String pword)
	{
		driver.findElement(Password).sendKeys(pword);
		
	}
	public void clickonsubmit()
	{
		driver.findElement(submitbutton).click();	
	}
	public boolean dashboarddisplayed()
	{
		return driver.findElement(dashboard).isDisplayed();
	}
}
 
 