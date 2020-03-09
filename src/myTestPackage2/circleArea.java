package myTestPackage2;

public class circleArea {
	
	int pi = 22 / 7; 
	public int CircleArea(int radius) {
		return pi * radius * radius;
		
	}
	
	public void testCircleAreaManually(int expected,int actual){
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
		circleArea ca = new circleArea();
		System.out.println(ca.CircleArea(7));
		ca.testCircleAreaManually(147, ca.CircleArea(7));
	}

}
