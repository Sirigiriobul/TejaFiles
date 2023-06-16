package allPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OrangeHrm {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");
	WebDriver driver;
	Actions act;
	
	driver=new ChromeDriver();
String	urlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
driver.get(urlAddress);
String expectedLogInPanelElement="LOGIN PANEL";

WebElement actualLogInPanelElement=driver.findElement(By.id("logInPanelHeading"));
String actualLogInPageText=actualLogInPanelElement.getText();
System.out.println(actualLogInPageText);

WebElement userNameElement=driver.findElement(By.id("txtUsername"));
userNameElement.sendKeys("Obul123");
WebElement passWordElement=driver.findElement(By.id("txtPassword"));
passWordElement.sendKeys("Obulobul@123");
WebElement logInButton=driver.findElement(By.id("btnLogin"));
logInButton.click();

act=new Actions(driver);

WebElement PimElement=driver.findElement(By.linkText("PIM"));

act.moveToElement(PimElement).build().perform();
String pimText=PimElement.getText();
System.out.println(pimText);
WebElement addEmployeeElement=driver.findElement(By.id("menu_pim_addEmployee"));
addEmployeeElement.click();
WebElement firstNameElement=driver.findElement(By.id("firstName"));
firstNameElement.sendKeys("Sirigiri");
WebElement MiddleNameElement=driver.findElement(By.id("middleName"));
MiddleNameElement.sendKeys("Obulesh");
WebElement lastNameElement=driver.findElement(By.id("lastName"));
lastNameElement.sendKeys("Sivamma");
WebElement saveButton=driver.findElement(By.id("btnSave"));
saveButton.click();


String expectedName="Sirigiri";
WebElement firstNameElementLocator=driver.findElement(By.xpath("//*[@id=\"personal_txtEmpFirstName\"]"));
String actualFirstNameText=firstNameElementLocator.getText();
System.out.println(actualFirstNameText);
//WebElement actualName=driver.findElement(By.id("personal_txtEmpFirstName"));
//act.moveToElement(actualName).build().perform();
//String actualNameText=actualName.getText();
//System.out.println(actualNameText);

System.out.println("Success");









Thread.sleep(3000);
driver.close();
}
}
