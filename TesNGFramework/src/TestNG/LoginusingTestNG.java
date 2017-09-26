package TestNG;

import java.io.IOException;

import org.openqa.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import Automation.ARCOS_Scripts;
import Basic.Read_WriteExcel;

public class LoginusingTestNG{
	
	
	WebDriver driver;
	String P1;
	String Keyword;
	
	Screenshot obj1= new Screenshot();

	@BeforeTest
	public void Datareadfromexcel() throws IOException {
		
		Read_WriteExcel obj=new Read_WriteExcel();
		P1=obj.values();
		
	}
	
	@Test(dataProvider="getdata1")
	public void Login(String browsername) throws InterruptedException, IOException{
		
		Keyword="login";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_ADMIN\\Desktop\\Browser Exe\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		
		System.out.println(browsername);
		driver.get("https:\\www.facebook.com\\");
		obj1.takesscreenshot(Keyword);
		
	
//		driver.findElement(By.xpath("//*[@id='']")).sendKeys(P1);
		
		
		
			
		}
	
	@DataProvider
	public Object[][] getdata1(){
		
		Object[][] arr= new Object[2][1];
		
		arr[0][0]="firefox";
		arr[1][0]="chrome";
		
		return arr;
	}
	
	@Test
	@Parameters({"Suitelevel"})
	
	public void TestCase1(String Suitelevel){
		System.out.println(Suitelevel);
	}
	
	@Test
	@Parameters({"Testlevel", "Suitelevel"})
	
	public void TestCase2(String Suitelevel, String Testlevel){
		System.out.println(Suitelevel + Testlevel);
	}
}	


