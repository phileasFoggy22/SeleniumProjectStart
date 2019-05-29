import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTesting {
	public static WebDriver driver;

	@BeforeClass
	public static void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void methodTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://www.google.co.uk/");
		WebElement getSearchBar = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input"));
		getSearchBar.sendKeys("cute puppies");
		getSearchBar.sendKeys(Keys.ENTER);
		// WebElement searchGoogle = driver
		// .findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[2]/div[2]/div/center/input[1]"));
		// searchGoogle.click();
		WebElement googleImages = driver.findElement(By.xpath("//*[@id=\"hdtb-msb-vis\"]/div[2]/a"));
		googleImages.click();
		TimeUnit.SECONDS.sleep(1);
		WebElement cookieConsent = driver.findElement(By.xpath("//*[@id=\"epbar\"]"));

		assertTrue(cookieConsent.isDisplayed());

	}

	@AfterClass
	public static void teardown() {
		driver.quit();
	}

}
