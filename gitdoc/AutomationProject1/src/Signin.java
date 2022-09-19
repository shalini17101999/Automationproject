import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Signin
{
	@Test(priority = 2)
	public void register()throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\shalini.a\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get(" https://mobileworld.banyanpro.com/");
	System.out.println(driver.getTitle());
	driver.findElement(By.className("btn-warning")).click();
	driver.findElement(By.id("username")).sendKeys("shalini17101999@gmail.com");
    driver.findElement(By.id("password")).sendKeys("shalma");
    Thread.sleep(1000);
    driver.findElement(By.className("custom-control-label")).click();
    Thread.sleep(1000);
    driver.findElement(By.className("btn-block")).click();      




	}
	 

}
