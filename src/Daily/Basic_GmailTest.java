package Daily;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_GmailTest {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.driver","C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.name("identifier")).sendKeys("a****.c*t");
		
		driver.findElement(By.xpath("//*[@id=\'identifierNext\']/content/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("*******");
		driver.findElement(By.xpath("//*[@id=\'passwordNext\']/content/span")).click();
		String title =driver.getTitle();
		System.out.println(title);
		driver.close();
	}

}
