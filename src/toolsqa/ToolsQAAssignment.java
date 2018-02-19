package toolsqa;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class ToolsQAAssignment {

	public static void main(String[] args) throws AWTException {
		System.out.println("Tools QA automation");
		
		//opening chrome browser
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		//Go to http://toolsqa.com/automation-practice-form/
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		//scrolling down the web page
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)");
		
		//Select “Navigation Commands” in Selenium Commands 
		WebElement element=driver.findElement(By.id("selenium_commands"));
		Select command=new Select(element);
		command.selectByVisibleText("Navigation Commands");	
		System.out.println("Navigation Commands selected");
		
		//Select “Australia” in Continents
		element=driver.findElement(By.id("continents"));
		Select continents=new Select(element);
		continents.selectByVisibleText("Australia");
		System.out.println("Australia selected");
	
		//Click on “Selenium IDE” and “Selenium WebDriver”
		driver.findElement(By.id("tool-1")).click();
		driver.findElement(By.id("tool-2")).click();
		System.out.println("Selenium IDE and Selenium WebDriver are selected" );
		
		//Click on link “Selenium Automation Hybrid Framework” and “Test File to Download” and wait for files to download
		driver.findElement(By.linkText("Selenium Automation Hybrid Framework")).click();
		driver.findElement(By.linkText("Test File to Download")).click();
		System.out.println("files downloaded");
		
		js.executeScript("window.scrollBy(0,-500)");
		
		//Upload a file from your local machine using Profile Picture
		WebElement upload=driver.findElement(By.id("photo"));
		upload.sendKeys("D:\\photo.jpg");
		System.out.println("Photo uploaded");
		
		//Click and Select “Manual Testing” and “Automation Tester” checkboxes
		driver.findElement(By.id("profession-0")).click();
		driver.findElement(By.id("profession-1")).click();
		System.out.println("Profession selected");
		
		//Enter your Date of Birth in Textbox
		driver.findElement(By.id("datepicker")).sendKeys("19/01/1993");
		System.out.println("DOB inserted");
		
		//Select your years of experience in Testing Field
		driver.findElement(By.id("exp-1")).click();
		System.out.println("Experience selected");
		
		//Select your Gender
		driver.findElement(By.id("sex-1")).click();
		System.out.println("Gender selected");
		
		js.executeScript("window.scrollBy(0,-200)");
		
		//Enter Your Name and Surname in First Name and Last Name field
		driver.findElement(By.name("lastname")).sendKeys("Thangan");
		driver.findElement(By.name("firstname")).sendKeys("Varsha");
		System.out.println("Name entered  \n *********End of Program**********");
	}

}
