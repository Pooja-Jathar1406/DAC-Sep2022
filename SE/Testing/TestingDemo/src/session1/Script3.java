package session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Script3 {
    
	ChromeDriver driver;
	
	public void open()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\CDAC\\6. SE\\Testing\\Library\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/v4/");  //website url
		driver.manage().window().maximize();  //maximize
		//driver.close(); //to close the tab
		//driver.quit(); //to close ALL tabs
	}
	
	//automatically enter creds for login
	public void login()
	{
		//to select the element
		WebElement username = driver.findElement(By.name("uid")) ;
		//to send some value to selected web element
		username.sendKeys("mngr475230");
		
		//same thing we can do like -
		driver.findElement(By.name("password")).sendKeys("rYjUned"); ;
		
		driver.findElement(By.name("btnLogin")).click();
		
	}
	 
	
	public void addCustomer() throws InterruptedException {
		
		 //selecting and clicking on a link
		driver.findElement(By.linkText("New Customer")).click();
		Thread.sleep(5000); 
		
		driver.findElement(By.name("name")).sendKeys("Pooja");
		//driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]"));
		driver.findElement(By.xpath("//input[@value='f']")).click();
		driver.findElement(By.name("dob")).sendKeys("14/06/1999");
		driver.findElement(By.name("addr")).sendKeys("Takalibhan");
		driver.findElement(By.name("city")).sendKeys("Shrirampur");
		driver.findElement(By.name("state")).sendKeys("Maharashtra"); 
		driver.findElement(By.name("pinno")).sendKeys("413725");
		driver.findElement(By.name("telephoneno")).sendKeys("9762467545");
		driver.findElement(By.name("emailid")).sendKeys("pooja@gmail.com");
		driver.findElement(By.name("password")).sendKeys("pooja123");
		driver.findElement(By.name("sub")).click();
		
	}
	
	public static void main(String args[]) throws InterruptedException
	{
		Script3 o =new Script3();
		o.open(); 
		o.login(); 
		o.addCustomer();
	}
}