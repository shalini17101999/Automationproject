import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class homepage {
	   public static void main(String[] args) throws InterruptedException {
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\shalini.a\\Downloads\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://mobileworld.azurewebsites.net/");
	        System.out.println(driver.getTitle());
	        
	        driver.findElement(By.className("btn-warning")).click();
	        driver.findElement(By.xpath("/html/body/div/div/div/div/div/p/a")).click();
	   }

}


