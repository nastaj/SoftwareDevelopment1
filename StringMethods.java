import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String word;

        System.out.println("==============");
        System.out.println("Requirement 1:");
        System.out.println("==============");

        System.out.print("Enter a word: ");
        word = input.next();

        System.out.println("Number of characters in "+word+" is: "+word.length());
         System.out.println();

		/*
		 - Add code for rest of 
		   requirements here
		*/

        System.out.println("==============");
        System.out.println("Requirement 2:");
        System.out.println("==============");
		
        System.out.println("First character of " + word + " is: "+ word.charAt(0));
        System.out.println("Last character of "+ word +" is: "+ word.charAt(word.length() - 1));
        System.out.println();
		
        System.out.println("==============");
        System.out.println("Requirement 3:");
        System.out.println("==============");

        System.out.println("Second character "+ word.charAt(1) +" is located at index "+word.indexOf(word.charAt(1)));
        System.out.println();

        System.out.println("==============");
        System.out.println("Requirement 4:");
        System.out.println("==============");
        
        char check;
        System.out.println("Enter a character to check if its contained in the word you previously entered: ");
        check = input.next().charAt(0);
        System.out.println(check);
        System.out.println("Character " + check + " exist in " + word + "? If index not -1 then it does: " + word.indexOf(check));


        System.out.println("==============");
        System.out.println("Requirement 5:");
        System.out.println("==============");

        String firstname;
        String lastname;
        System.out.println("");
        input.close();

    }
}
