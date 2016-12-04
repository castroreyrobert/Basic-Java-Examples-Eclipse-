import java.util.Scanner;

public class WordsCount {
	public static void main (String []args){
		System.out.print("Enter a Sentence: \n ");
	try(Scanner scanner = new Scanner(System.in)){
		String input = scanner.nextLine();
		
		int ch = 0;
		int nwords = 0;
		int nlines = 0;
		
		boolean stopCount = false;
		while(true){
			if(input.contains(".")){
			String [] splitl = input.split(".");
			if(splitl.length>1){
				input = splitl[0];
				break;
			}
			stopCount = true;			
		}
		ch+= input.replace(" ", "").length();
		nlines++;
		String [] words = input.split(" ");
		nwords+=words.length;
		
		if(stopCount){
			break;
		}
		input = scanner.nextLine();
	}
		System.out.println("Number of Words: " +nwords);
		System.out.println("Number of letters: " +ch);
		System.out.println("Number of Sentences: " +nlines);
	}
}
}
