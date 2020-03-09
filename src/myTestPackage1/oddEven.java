package myTestPackage1;

public class oddEven {
	
public String OddEven(int num){
	
	if(num % 2 == 1) {
		return "Odd";
	}else {
		return "Even";
	}
	
}
	
public void testOddEvenManually(String expected,String actual){
	if(expected==actual)
	{
		System.out.println("Expected value and Actual value are matching");
	}
	else
	{
		System.out.println("Expected value and Actual value are not matching");
	}
}

public static void main(String[] args) {
	
	oddEven oe = new oddEven();
	System.out.println(oe.OddEven(10));
	oe.testOddEvenManually("Even", oe.OddEven(10));
}


}
