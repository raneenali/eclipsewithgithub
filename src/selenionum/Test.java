package selenionum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {
	static WebDriver driver;
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		System.out.print("This is the seleniom toturial");
		System.setProperty("Webdriver.gecko.driver", "C:\\gecko\\geckodriver.exe");
		driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='u_0_j']*")).sendKeys("MyName");
		Select sel=new Select(driver.findElement(By.xpath(".//*[@id='month']")));
		sel.selectByIndex(4);
		driver.findElement(By.xpath(".//*[@id='u_0_r']*")).click();
	}

}
