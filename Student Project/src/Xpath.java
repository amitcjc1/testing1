import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath
{

	public static void main(String[] args)
	{
		
		System.out.println("Hello");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sandip\\Desktop\\selenium-java-3.141.59\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\Sandip\\Desktop\\selenium-java-3.141.59\\index.html");
		driver.manage().window().maximize();

		// for absolute path
		driver.findElement(By.xpath("/html/body/form/div[1]/input[1]")).sendKeys("sandip");

		// Relative path
		driver.findElement(By.xpath("//input[@id='pid']")).sendKeys("cjc");

		// dynamic parent
		WebElement sel = driver.findElement(By.xpath("//option[1]/parent::select"));
		Select s = new Select(sel);
		s.selectByIndex(1);

		// Dynamic parent
		driver.findElement(By.xpath("//div/child::button[@id='login']")).click();

	}

}