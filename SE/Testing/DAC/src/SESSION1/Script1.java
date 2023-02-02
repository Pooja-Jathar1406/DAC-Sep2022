package SESSION1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Script1 {
	
	ChromeDriver driver;

	//to open a browser
	public void open()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\EclipseWorkspace\\lib\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");  //open
		driver.manage().window().maximize(); //maximise
		driver.close();//close
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Script1 o=new Script1();
		o.open();
	}

}
