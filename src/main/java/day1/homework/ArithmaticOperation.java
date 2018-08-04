package day1.homework;

public class ArithmaticOperation {
	//declare and initializing variable
	int numberOne =20;
	int numberTwo =10;
	
	//method for adding two numbers
	public void addition() {
		System.out.println(numberOne + numberTwo);
	}
	
	//method for subtraction
	public int subtract() {
		int result;
		result= numberOne - numberTwo;
		return result;
	}
	
	//method for multiplication
	public int multiply() {
		int result;
		result=numberOne * numberTwo;
		return result;
	}
	
	//method to multiply the numberOne with 2
	public void multiplyNumberOneByTwo()
	{
		System.out.println(numberOne * 2);
	}
	
	//method to divide numberTwo by the value which is passed as parameter
	public int divideNumberTwoBy(int divident) {
		int result;
		result= numberTwo/divident;		
		return result;
	}
}
