package calculatorTestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import calculator.calculator;

public class calculatorTest {
	calculator objcal = new calculator();
	
	
	  @Parameters({"param1", "param2"})
	  
	  @Test(priority=1) public void Add(int param1,int param2) {
	  System.out.println("Addition result :" + objcal.Add(param1, param2)); }
	 
	
	  @Parameters({"param3", "param4"})
	  
	  @Test(priority=2) public void subtract(int param3,int param4) {
	  System.out.println("Subtraction result :" + objcal.Subtract(param3, param4));
	  }
	  
	  @Parameters({"param1", "param2"})
	  
	  @Test(priority=3) public void divide(int param1,int param2) {
	  System.out.println("Division result :" + objcal.Divide(param1, param2)); }
	  
	  @Parameters({"param1", "param2"})
	  
	  @Test(priority=4) public void multiply(int param1,int param2) {
	  System.out.println("Multiplication result :" +objcal.Multiply(param1,
	  param2)); }
	 
	
	
	@Test(priority=5,dataProvider = "provideNumbers")
	public void Add1(int num1, int num2) {
		System.out.println("Addition result :" + objcal.Add(num1, num2));
		//Assert.assertEquals(num1, num1);
	}
	
	@Test(priority=6,dataProvider = "provideNumbers")
	  public void subtract1(int num1, int num2) {
	  System.out.println("Subtraction result :" + objcal.Subtract(num1, num2)); }
	
	
	  @Test(priority=7,dataProvider = "provideNumbers") 
	  public void divide2(int num1, int num2) { 
		  System.out.println("Division result :" + objcal.Divide(num1, num2)); }
	

	  @Test(priority=8,dataProvider = "provideNumbers") 
	  public void multiply3(int num1, int num2) {
	  System.out.println("Multiplication result :" +objcal.Multiply(num1, num2)); }

	@DataProvider(name = "provideNumbers")
	public Object[][] provideData() {

		return new Object[][] { 
			{ 10, 20 }, 
			{ 100, 110 }, 
			{ 200, 210 } 
		};
	}
	 
}
