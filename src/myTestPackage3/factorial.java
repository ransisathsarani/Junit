package myTestPackage3;

public class factorial {
	
	public int Factorial(int num) {
		
		int fact = 1;
		for(int i=num; i > 0; i--) {
			fact = fact*i;
		}
		return fact;
	}
	
	public void testFactorialManually(int expected,int actual){
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
		factorial fa = new factorial();
		System.out.println(fa.Factorial(4));   // 4! => 4 x 3 x 2 x 1 = 24
		fa.testFactorialManually(24, fa.Factorial(4));
	}

}
