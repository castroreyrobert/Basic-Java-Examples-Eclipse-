import java.util.Scanner;

public class UserInput {
	
	public static void main (String []args){
		
		//Scanner to get the user input
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter words to display: ");
		String input = scanner.nextLine();
		
		System.out.println(input);
	}

}
