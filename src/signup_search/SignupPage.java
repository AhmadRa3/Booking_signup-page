package signup_search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignupPage {

	public static void main(String[] args) throws InterruptedException {
		String Email="ahmadkamalrahahleh@yahoo.com";
		String Password="Ahmad.kamal.110"	;	

		System.setProperty("webdriver.chrome.driver", "G:\\MyNewDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.booking.com");
		driver.findElement(By.xpath("//*[@id=\"b2indexPage\"]/header/nav[1]/div[2]/div[5]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(Email);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/form/div[3]/button/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("new_password")).sendKeys(Password);
		driver.findElement(By.id("confirmed_password")).sendKeys(Password);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/form/button/span")).click();
		
		
	}

}
