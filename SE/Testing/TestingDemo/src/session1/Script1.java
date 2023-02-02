package session1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Script1 {

	ChromeDriver driver;
	
	//method to open the browser
	public  void open() {
		
		//give the path of chromedriver exe file
		System.setProperty("webdriver.chrome.driver", "E:\\CDAC\\6. SE\\Testing\\Library\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//url of browser to open
		driver.get("https://www.google.co.in");
		
		//to maximize the browser window
		driver.manage().window().maximize();
		
		//to close the opened browser
		driver.close();
		//driver.quit(); //to close ALL tabs
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Script1 o = new Script1();
		o.open();
	}

}
