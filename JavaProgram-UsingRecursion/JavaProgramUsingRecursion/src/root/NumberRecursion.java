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
		//NumberOperation.fibonacciSeriesInReverse(0, 1);
		//System.out.println(1);
		//System.out.println(0);
				
		//sum of digits
		//System.out.println(NumberOperation.sumOfDigits(412534));
		
		//power
		System.out.println(NumberOperation.power(3,3));
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
	
	public static int sumOfDigits(int number) {
		int sum = 0;
		if(number/10 == 0) {
			return number%10;
		}
		sum = number%10 + sumOfDigits(number/10);
		return sum;
	}
	
	public static int power(int base, int power) {
		int product = 0;
		if(power == 1) {
			return base;
		}
		product = base * power(base, power-1);
		return product;
	}
}
