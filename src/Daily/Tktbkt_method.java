package Daily;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tktbkt_method {

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
		
		//Searching Process 
		
		new Select(driver.findElement(By.xpath("//*[@name='location']"))).selectByValue("Sydney");
		new Select(driver.findElement(By.xpath("//*[@name='hotels']"))).selectByIndex(2);
		new Select(driver.findElement(By.xpath("//*[@name='room_type']"))).selectByVisibleText("Deluxe");
		new Select(driver.findElement(By.xpath("//*[@name='room_nos']"))).selectByVisibleText("2 - Two");
		
		driver.findElement(By.xpath("//*[@name='datepick_in']")).sendKeys("16/05/2019");
		driver.findElement(By.xpath("//*[@name='datepick_out']")).sendKeys("18/05/2019");
		
		new Select(driver.findElement(By.xpath("//*[@name='adult_room']"))).selectByVisibleText("2 - Two");
		new Select(driver.findElement(By.xpath("//*[@name='child_room']"))).selectByVisibleText("2 - Two");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@name='Submit']")).click();
		Thread.sleep(3000);
		
		//Ticket Booking Process 
		driver.findElement(By.xpath("//*[@name='radiobutton_0']")).click();
		driver.findElement(By.xpath("//*[@name='continue']")).click();
		
		//Payment Method
		
		driver.findElement(By.xpath("//*[@name='first_name']")).sendKeys("Kindros");
		driver.findElement(By.xpath("//*[@name='last_name']")).sendKeys("Lindaa");
		
		driver.findElement(By.xpath("//*[@name='address']")).sendKeys("Somaliya @ Sydney");
		driver.findElement(By.xpath("//*[@name='cc_num']")).sendKeys("1234567891234567");
		
		driver.navigate().back();
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./ScreenShots/Booking_1.png"));
		Thread.sleep(3000);
		/*
		driver.navigate().forward();
		File src1=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1, new File("./ScreenShots/Booking_2.png"));
		Thread.sleep(3000);
		driver.navigate().refresh();
		File src2=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src2, new File("./ScreenShots/Booking_3.png"));
		Thread.sleep(3000);*/
		
		new Select(driver.findElement(By.xpath("//*[@name='cc_type']"))).selectByIndex(3);
		new Select(driver.findElement(By.xpath("//*[@name='cc_exp_month']"))).selectByIndex(4);
		new Select(driver.findElement(By.xpath("//*[@name='cc_exp_year']"))).selectByIndex(11);
		driver.findElement(By.xpath("//*[@name='cc_cvv']")).sendKeys("369");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@name='book_now']")).click();
		
		Thread.sleep(8000);
		driver.close();
	}

}
