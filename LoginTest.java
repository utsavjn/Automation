package Jenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
	
@Test

public static void testJenkins(){
//1. Define the webdriver that open chrome browser
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Utsav\\Downloads\\Selenium\\Softwares\\chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
//2. open web browser and navigate to page 
	driver.get("https://auth.voxmedia.com/login?community_id=405&return_to=https://www.polygon.com/ ");
	
//3. Print the titile of the page
	System.out.println(driver.getTitle());
	
//Locate elements in the webpage, determine the action, pass the parameters
	driver.findElement(By.cssSelector("a[href*='#signup']")).click();
// 4. Username
	driver.findElement(By.name("username")).sendKeys("Sinew10");
// 5. Password
	driver.findElement(By.name("password")).sendKeys("Rinku2468");
// 6. Email
	driver.findElement(By.id("user[email]")).sendKeys("utsavj77@gmail.com");

// 7. Get Confirmation
	driver.close();
	
}

}


