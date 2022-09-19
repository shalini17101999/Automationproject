import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Signup 
{
	   @Test(priority = 1)
	   public void test() throws InterruptedException {
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\shalini.a\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.get(" https://mobileworld.banyanpro.com/");
		   System.out.println(driver.getTitle());
		   driver.findElement(By.className("btn-warning")).click();
	       driver.findElement(By.cssSelector("body > div > div > div > div > div > p > a")).click();
	       driver.findElement(By.className("form-control")).sendKeys("shalini");
	       driver.findElement(By.cssSelector("#myForm > div:nth-child(4) > div:nth-child(3) > input")).sendKeys("Arumugam");
	       driver.findElement(By.cssSelector("#myForm > div:nth-child(6) > div.col-md-10 > input:nth-child(1)\r\n"+ "")).sendKeys("shalini17101999@gmail.com");
	       driver.findElement(By.cssSelector("#myForm > div:nth-child(6) > div.col-md-10 > input:nth-child(3)")).sendKeys("Shalinia@");
	       driver.findElement(By.cssSelector("#myForm > div:nth-child(9) > div.col-md-5 > input\r\n")).sendKeys("05/07/1999");
	       driver.findElement(By.cssSelector("#myForm > div:nth-child(9) > div.col-md-3 > input[type=radio]")).click();
	       driver.findElement(By.cssSelector("#myForm > div:nth-child(12) > div.col-md-10 > input")).sendKeys("9876543321");
	       driver.findElement(By.cssSelector("#myForm > div:nth-child(14) > div.col-md-10 > textarea")).sendKeys("Qualitest vision is to become the most trusted and modern quality engineering partner");
	       driver.findElement(By.className("btn-info")).click();
}
	   }



