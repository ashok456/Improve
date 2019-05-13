package Daily;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Handle_Alert {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.ie.driver","C:\\Drivers\\IEDriverServer.exe");
		//WebDriver driver=new InternetExplorerDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");//KSRTC BUS Site
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"bookingsForm\"]/div/div/div[2]/div[3]/button")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.close();
		
	}

}
