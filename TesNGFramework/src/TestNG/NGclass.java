package TestNG;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NGclass {

	@BeforeTest
	public void beforeTest(){
	 System.out.println("BEFORETEST");
	}
	
	@AfterTest
	public void afterTest(){
		System.out.println("AFTER TEST");
	}
	
	@BeforeMethod
	public void beforemethod(){
		System.out.println("BEFOREMETHOD");
	}
	
	@AfterMethod
	public void aftermethod(){
		System.out.println("AFTERMETHOD");
	}
	
    @Test()
    public void Test2() {
    	
    	throw new SkipException("lEAVE THIS TEST");
//	  System.out.println("This is test two");
    }
  
//  @Test(dependsOnMethods={"Test2"})
    @Test()
  public void Test1() {
	  System.out.println("This is test one");
    }
  
  @Test (dataProvider="getdata1")
  public void Test3(String firstname, String lastname, int age) {
	  
	  System.out.println( lastname+firstname+age);
  }
  
	  @DataProvider 
	  public Object[][] getdata1(){
		  Object[][] obj= new Object[3][3];
		  
		  obj[0][0]="Moksh";
		  obj[0][1]="Juneja";                            
		  obj[0][2]=1;
		  
		  obj[1][0]="Alka";
		  obj[1][1]="Manral";
		  obj[1][2]=3;
		  
		  obj[2][0]="Anchika";
		  obj[2][1]="Kumari";
		  obj[2][2]=4;
		  
		return obj;
		  
	  }
}