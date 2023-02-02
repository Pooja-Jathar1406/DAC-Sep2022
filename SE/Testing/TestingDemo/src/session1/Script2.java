package session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script2 {
    
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
		
		//selecting and clicking on a link
//		driver.findElement(By.linkText("New Customer")).click();
		driver.findElement(By.partialLinkText("Depo")).click();
		

	}
	
	public static void main(String args[])
	{
		Script2 o =new Script2();
		o.open(); 
		o.login();
	}
}