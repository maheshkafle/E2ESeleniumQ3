import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class SelIntroduction {

	public static void main(String[] args) 
	{
		//Invoking Browser
		//Selenium runs on different browsers like Chrome, Firefox, Safari
		//In this example take Chrome
		//Chrome -> ChromeDriver -> Contains Methods that helps in automate in chrome browser
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\kaflemah\\Downloads\\chromedriver-win64\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\kaflemah\\Downloads\\geckodriver-win32\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kaflemah\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		
		//WebDriver driver = new ChromeDriver();
		
		//WebDriver driver = new FirefoxDriver();
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://nohello.net/en/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.quit();
		
	}

}
