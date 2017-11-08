package Jenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Application {
	public static void main(String[]args){
		//1. Get Driver
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Utsav\\Downloads\\Selenium\\Softwares\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//2. Navigate to page http://job-openings.monster.com/v2/job/apply?jobId=189911041
		driver.get("http://job-openings.monster.com/v2/job/apply?jobId=189911041");
		
		//3. Fill  out the form
		driver.findElement(By.id("Pi_FirstName")).sendKeys("Utsav");
		driver.findElement(By.xpath("//*[@id='Pi_LastName']")).sendKeys("Jain"); //relative xpath
		driver.findElement(By.cssSelector("input[id='Pi_EmailAddress']")).sendKeys("utsavj77@gmail.com");
		new Select (driver.findElement(By.id("Pi_CareerLevelId"))).selectByValue("12");
		new Select (driver.findElement(By.id("Pi_EducationLevelId"))).selectByValue("6");
		driver.findElement(By.cssSelector("input[id='Pi_UserEnteredGeoName']")).sendKeys("95035, Milpitas, CA");
		driver.findElement(By.id("Pi_WorkAuthorizationStatusTrue")).click();
		driver.findElement(By.id("Attachments")).sendKeys("C:\\Users\\Utsav\\Documents\\Desktop\\Resumes\\FT\\JainUtsav.docx");
		driver.findElement(By.id("Rs_SearchableMember")).click();
		new Select (driver.findElement(By.id("Di_GenderId"))).selectByValue("1");
		new Select (driver.findElement(By.id("Di_EthnicityId"))).selectByValue("3");
		driver.findElement(By.xpath("//*[@id='applybtn']")).click();
		
		
		//clicking submit

		
		
		//4. Get Confirmation
		
		//5. Close the browser
		//driver.close();
		
	}
	

}
