package root;

public class NumberRecursion {

	public static void main(String[] args) {
		// factorise
		//System.out.println(NumberOperation.factorise(5));
		
		// fibonacci series
		// System.out.println(0);
		// System.out.println(1);
		// NumberOperation.fibonacciSeries(0, 1);
		
		// fibonacci series in reverse
		NumberOperation.fibonacciSeriesInReverse(0, 1);
		System.out.println(1);
		System.out.println(0);
				
		
	}

}

class NumberOperation{
	public static int factorise(int number) {
		if(number == 1) return 1;
		return number*factorise(number-1);
	}
	
	public static void fibonacciSeries(int number1, int number2) {
		int sum = number1+number2;
		if(sum > 20) return;
		System.out.println(sum);
		fibonacciSeries(number2,sum);
	}
	
	public static void fibonacciSeriesInReverse(int number1, int number2) {
		int sum = number1+number2;
		if(sum > 20) return;
		fibonacciSeriesInReverse(number2,sum);
		System.out.println(sum);
	}
}
