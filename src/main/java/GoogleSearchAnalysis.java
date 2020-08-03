import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class GoogleSearchAnalysis {
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		//input[@name='q']
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Java");
		List<WebElement>list=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
		System.out.println("Total suggestion:::" +list.size());
//	    for(WebElement ele:list) 
//	        {
//		      System.out.println(ele.getText());
//		    }
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("java jdk")) {
				list.get(i).click();
				break;
			}
		}
	}

}
