package Wait_methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.driver","C:\\Drivers\\chromedriver.exe");
		//Intializing the WebDriver
		WebDriver driver = new ChromeDriver();
			
		//Passing A qualified link
		//LOGIN Method
		driver.get("https://www.irctc.co.in/nget/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
		driver.close();
	}

}
