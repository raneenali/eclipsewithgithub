package selenionum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class TestFasebookwithjnit {
static WebDriver driver;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("Webdriver.gecko.driver", "C:\\gecko\\geckodriver.exe");
		driver=new ChromeDriver();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void test() {
		//fail("Not yet implemented");
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='email']*")).sendKeys("your email");
		driver.findElement(By.xpath(".//*[@id='pass']*")).sendKeys("password");
		driver.findElement(By.xpath(".//*[@id='u_0_2']*")).click();
	}

}
