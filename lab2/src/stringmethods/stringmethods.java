package stringmethods;
import java.util.Scanner;

public class stringmethods {
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String input = sc.nextLine();
		System.out.println("Character at position :" + input.charAt(0));
		System.out.println("Length of string:" + input.length());
		System.out.println("String in uppercase:" + input.toUpperCase());
		System.out.println("String in lowercase:" + input.toLowerCase());
		System.out.println("Substring from index 2 to 5: " + input.substring(2, 5));
		System.out.println("Enter a word to search: ");
        String searchWord = sc.nextLine();
	    if(input.contains(searchWord)) {
	    	System.out.println("The string contains '" + searchWord+ "'" );
	    }
	    else {
	    	System.out.println("The string does not contains '" + searchWord+ "'");
	    }
	    	
		sc.close();	

	}

}
