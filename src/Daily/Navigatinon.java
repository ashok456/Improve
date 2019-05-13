package Daily;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatinon {
	public static void main (String[] args) {
		
			System.setProperty("webdriver.Chrome.driver","C:\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			//driver.get("http://practice.talentsprint.com/admin/home");
			driver.navigate().to("http://practice.talentsprint.com/admin/home");
			driver.navigate().refresh();
			String title = driver.getTitle();
			System.out.println("Title of the Page is: "+title);
			
			driver.navigate().to("https://www.amazon.in/");
			String title3 = driver.getTitle();
			System.out.println("Title of the Page is: "+title3);
			driver.navigate().back();
			String title1 = driver.getTitle();
			System.out.println("Title of the Page is: "+title1);
			driver.navigate().forward();
			String title2 = driver.getTitle();
			System.out.println("Title of the Page is: "+title2);
			String url = driver.getCurrentUrl();
			System.out.println("Title of the Page is: "+url);
			//String pagesource = driver.getPageSource();
			//System.out.println("page source Code is :"+pagesource);
			
			//System.out.println(s);
			driver.close();
			
		}
		

	}


