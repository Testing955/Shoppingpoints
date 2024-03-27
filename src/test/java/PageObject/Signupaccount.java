package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Signupaccount extends BaseClass
{
WebDriver driver;
public Signupaccount(WebDriver driver)
{
super(driver);
this.driver=driver;

}
@FindBy(xpath="//div[@class='css-146c3p1 r-1kb76zh r-1sg1l5 r-1tq4jak r-q4m81j r-ubezar r-135wba7']")
WebElement getstarted;
@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[1]/div/div[2]/div/div/div/div/div[2]/div/div/div/div[3]/a")
WebElement signup;
@FindBy(xpath="//input[@placeholder='Enter your first name']")
WebElement Firstname;
@FindBy(xpath="//input[@placeholder='Enter your last name']")
WebElement lastname;
@FindBy(xpath="//input[@placeholder='Enter your email']")
WebElement email;
@FindBy(xpath="//input[@placeholder='Create a password']")
WebElement createpassword;
@FindBy(xpath="//input[@placeholder='Confirm your password']")
WebElement confirmpassword;
@FindBy(xpath="/html/body/div[1]/div/div/div/div[1]/div/div[2]/div/div/div/div/div[2]/div/div/div/div/div[2]/div[6]/div")
WebElement createaccount;
@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[1]/div/div[2]/div/div/div/div/div[2]/div/div/div/div[6]/div/div")
WebElement submitotp;

public void statrted()
{
	getstarted.click();
}
public void signupmodule()
{
	signup.click();
}
public void first(String fname)
{
	Firstname.sendKeys(fname);
}
public void last(String lname)
{
	lastname.sendKeys(lname);
}
public void emailfield(String efield)
{
	email.sendKeys(efield);
}
public void pwd(String pwd)
{
createpassword.sendKeys(pwd);
}
public void confpwd(String cpwd)
{
	confirmpassword.sendKeys(cpwd);
}
public void create()
{
	createaccount.click();
}
public void sbuttons()
{
	submitotp.click();
}
}
