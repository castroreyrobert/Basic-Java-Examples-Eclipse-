import java.util.Scanner;

public class BasicOperators {

	public static void main (String []args){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Choose an operation! (Number only)");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Division");
		System.out.println("4. Multiplication");
		int input = scanner.nextInt();
		
		System.out.print("You choose " + input + "!");
		
		System.out.println("Enter the first number: ");
		int number1 = scanner.nextInt();
		
		System.out .println("Enter the second number: ");
		int number2 = scanner.nextInt();
		
		switch (input){
		case 1: 
			int total = number1 + number2;
			System.out.println("The total is "+total);
			break;
		case 2: 
			int diff = number1 - number2;
			System.out.println("The difference is "+diff);
			break;
		case 3:
			int div = number1/number2;
			System.out.print("The answer is "+div);
			break;
		case 4:
			int mul = number1 * number2;
			System.out.println("The anser is " + mul);
			break;
		default:
			System.out.print("Invalid operation.");
			break;
			
		}
	}
}
