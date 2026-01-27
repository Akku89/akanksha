package seleniumpac;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
 
public class Login_PageFactory {
	WebDriver  driver;
	
	//By username=By.name("username");
	@FindBy(name="username")
	WebElement username;
	//By Password=By.name("password");
	@FindBy(name="password")
	WebElement password;
	//By submitbutton=By.xpath("//button[@type='submit']");
	@FindBy(xpath="//button[@type='submit']")
	WebElement submitbutton;
	//By dashboard=By.xpath("//h6[text()='Dashboard']");
	@FindBy(xpath="//h6[text()='Dashboard']")
	WebElement dashboard;
	
	public Login_PageFactory(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}
	public void enterusername(String uname) {
		username.sendKeys(uname);
		
	}
	public void enterpassword(String pword)
	{
		username.sendKeys(pword);
		
	}
	public void clickonsubmit()
	{
		submitbutton.click();	
	}
	public boolean dashboarddisplayed()
	{
		return dashboard.isDisplayed();
	}
}
 
 