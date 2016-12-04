import java.util.Scanner;

public class OddEven {
	
	public static void main(String []args){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Enter a number: ");
		int input = scanner.nextInt();
		
		if ((input%2) == 0){
			System.out.printf("Number %d is even", input);
		}else{
			System.out.printf("Number %d is odd", input);
		}
	}

}
