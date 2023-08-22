package JAVA_PROJECT;

/*
This is an Airthmatic calculator that is used to calculate
It was created by Nannu soni 2023.
*/
public class Calculator {
	Calculator() {
	}
//	add method created
	public int add(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public int subtract(int a, int b) {
		int sub = a - b;
		return sub;
	}

	public int multiply(int a, int b) {
		int mul = a * b;
		return mul;
	}

	public int divide(int a, int b) {
		int div = a / b;
		return div;
	}

	public int modulo(int a, int b) {
		int mod = a % b;
		return mod;
	}

	public static void main(String[] args) {
		Calculator myCalculator = new Calculator();
		int addition = myCalculator.add(5, 7);
		System.out.println(addition);

		int subtract = myCalculator.subtract(45, 11);
		System.out.println(subtract);

		int multiplication = myCalculator.multiply(45, 11);
		System.out.println(multiplication);

		int divide = myCalculator.divide(45, 5);
		System.out.println(divide);
		
		int remainder = myCalculator.modulo(48, 5);
		System.out.println(remainder);
	}
}