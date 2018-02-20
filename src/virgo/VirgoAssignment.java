package virgo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VirgoAssignment {

	public static void main(String[] args) {
        System.out.println("Virgo Signup automation");
		
		//opening chrome browser
		System.setProperty("webdriver.chrome.driver","libraries/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		//Go to http://toolsqa.com/automation-practice-form/
		driver.get("https://virgoinnovations.com/Virgo/#/app/login");
		
		WebDriverWait wait=new WebDriverWait(driver, 40);
		WebElement signup=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//a[@ui-sref='main.app.register']")));
		signup.click();		

		WebElement email=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("EmailId")));
		email.sendKeys("bolomaya@gmail.com");
		driver.findElement(By.name("password")).sendKeys("bolomaya");
		driver.findElement(By.name("password_confirmation")).sendKeys("bolomaya");
		
		WebElement rgister=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//button[text()='Register']")));
		if (rgister.isEnabled()) 
		{
			rgister.click();
		}
		else
		{
			System.out.println("email already rgistered hence proceed for login");
		}
		driver.navigate().back();
		WebElement email2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("LoginID")));
		email2.sendKeys("bolomaya@gmail.com");
		
		driver.findElement(By.id("login-password")).sendKeys("bolomaya");
		
		driver.findElement(By.xpath("//*[@id='frmCaptcha']/div[5]/div/div/button/span")).submit();
		
		WebElement check=wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("panel-heading")));
		
		if (check.isDisplayed()) {
			System.out.println("Login Successfully");
		}		
		
	}

}
