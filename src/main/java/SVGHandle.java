
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGHandle {
	public static WebDriver driver;
       public static void main(String args[]) {
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://debeissat.nicolas.free.fr/svg3d.php");
			/*WebElement e=driver.findElement(By.xpath("//*[name()='svg']//*[local-name()='g']"));
			e.click();*/
			driver.switchTo().frame("svg_result");
			while(true) {
			List<WebElement> PathList=driver.findElements(By.xpath("//*[name()='svg']//*[local-name()='g' and @id='g2']"
					+ "//*[local-name()='path' and  contains(@id,'face')]"));
			for(WebElement List:PathList)
			{
				String text=null;
				text=List.getAttribute("d");
				System.out.println(text);
			}
		}

       }

}
