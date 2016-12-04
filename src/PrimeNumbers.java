import java.util.Scanner;

public class PrimeNumbers {
	public static void main (String []args){
		
		int temp;
		boolean isPrime = true;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		//capture the input in an integer
		int num = scanner.nextInt();
		for(int i =2; i<=num/2; i++){
			temp = num%i;
			if(temp==0){
				isPrime = false;
				break;
			}
		}
		if(isPrime){
			System.out.printf("%d is a prime number" , num);
		}else{
			System.out.printf("%d is not a prime number", num);
		}
	}

}
