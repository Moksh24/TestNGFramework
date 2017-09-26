package TestNG;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Screenshot {
	
   WebDriver driver;
	public void takesscreenshot(String Keyword) throws InterruptedException, IOException{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_ADMIN\\Desktop\\Browser Exe\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https:\\www.facebook.com\\");
		
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

	    File dest= new File("C:\\Users\\IBM_ADMIN\\Desktop\\TestNG_Screenshot\\TClogin"+Keyword+".png");
	    FileUtils.copyFile(scr, dest);
	    Thread.sleep(3000); 
	   
	}

	public String timestamp() {
	    return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());	
}
	
	public static void main(String args[]) throws InterruptedException, IOException{
		Screenshot obj= new Screenshot();
		obj.takesscreenshot("Login");
	}
	}


