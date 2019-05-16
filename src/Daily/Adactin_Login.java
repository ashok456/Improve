package Daily;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin_Login {

	public static void main(String[] args) throws Throwable {
		
		//Webdriver Connection
		System.setProperty("webdriver.Chrome.driver","C:\\Drivers\\chromedriver.exe");
		//Intializing the WebDriver
		WebDriver driver = new ChromeDriver();
	
		//Passing A qualified link
		//LOGIN Method
		driver.get("http://www.adactin.com/HotelAppBuild2/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ashok1234");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("ashok1234");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='login']")).click();
	}

}
