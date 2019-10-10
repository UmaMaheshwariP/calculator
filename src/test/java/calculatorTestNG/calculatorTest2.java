package calculatorTestNG;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import calculator.calculator;

public class calculatorTest2 {
	calculator objcal = new calculator();
	
	@Test(priority=1,dataProvider = "provideNumbers")
	public void Add1(int num1, int num2) {
		System.out.println("Addition result :" + objcal.Add(num1, num2));
		//Assert.assertEquals(num1, num1);
	}
	
	@Test(priority=2,dataProvider = "provideNumbers")
	  public void subtract1(int num1, int num2) {
	  System.out.println("Subtraction result :" + objcal.Subtract(num1, num2)); }
	
	
	  @Test(priority=3,dataProvider = "provideNumbers") 
	  public void divide2(int num1, int num2) { 
		  System.out.println("Division result :" + objcal.Divide(num1, num2)); }
	

	  @Test(priority=4,dataProvider = "provideNumbers") 
	  public void multiply3(int num1, int num2) {
	  System.out.println("Multiplication result :" +objcal.Multiply(num1, num2)); }

	@DataProvider(name = "provideNumbers")
	public Object[][] provideData() {

		return new Object[][] { 
			{ 10, 5 }, 
			{ 20, 10 }, 
			{ 250, 210 } 
		};
	}
	 
}
