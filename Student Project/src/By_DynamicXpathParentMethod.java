

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class By_DynamicXpathParentMethod {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\amit\\Desktop\\Testing Document\\chromedriver_win32\\chromedriver.exe");
		  
		  WebDriver driver= new ChromeDriver();
		  
		  
		  driver.get("file:///C:/Users/amit/Desktop/B4/index.html");
		
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[@class='login']/parent :: div[@class='header_user_info']")).click();
		
		driver.findElement(By.xpath("//input[@name='email_create']")).sendKeys("mandulkar.akash232@gmail.com");
				
		driver.findElement(By.xpath("//div[@class='submit']/child :: button[@name='SubmitCreate']/span")).click();
				
		driver.findElement(By.xpath("")).click();

	}

}