package Toolsqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment_2 {

	public static void main(String[] args) {
        System.out.println("Virgo Signup automation");
		
		//opening chrome browser
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		//Go to http://toolsqa.com/automation-practice-form/
		driver.get("https://virgoinnovations.com/Virgo/#/app/login");
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		WebElement signup=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//a[@ui-sref='main.app.register']")));
		signup.click();		

		WebElement email=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("EmailId")));
		email.sendKeys("bolomaya@gmail.com");
		driver.findElement(By.name("password")).sendKeys("bolomaya");
		driver.findElement(By.name("password_confirmation")).sendKeys("bolomaya");
		
		WebElement rgister=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//button[text()='Register']")));
		rgister.click();
		
	//	WebDriverWait wait2=new WebDriverWait(driver, 60);
	//	WebElement login=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//b[@class='ng-binding']")));
	//	login.click();
		
		driver.navigate().back();
		WebElement email2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("LoginID")));
		email2.sendKeys("bolomaya@gmail.com");
		
		driver.findElement(By.id("login-password")).sendKeys("bolomaya");
		
		driver.findElement(By.className("popup-btn-text ng-binding")).click();
		
		WebElement check=wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("panel-heading")));
		if (check.isDisplayed()) {
			System.out.println("Login Successfully");
		}		
		
	}

}
