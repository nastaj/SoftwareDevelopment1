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
        System.out.println();


        System.out.println("==============");
        System.out.println("Requirement 5:");
        System.out.println("==============");

        String firstname;
        String lastname;

        System.out.println("Enter firstname: ");
        firstname = input.next();
        System.out.println("Enter lastname: ");
        lastname = input.next();
        System.out.println("Name entered is: "+firstname.concat(" ").concat(lastname));
        System.out.println();

        System.out.println("==============");
        System.out.println("Requirement 6:");
        System.out.println("==============");
        
        String firstString;
        String secondString;

        System.out.println("Check if strings match");
        System.out.println("Enter first string: ");
        firstString = input.next();
        System.out.println("Enter second string: ");
        secondString = input.next();
        System.out.println(firstString+" matches "+secondString+": "+firstString.equals(secondString));
        System.out.println(firstString+" matches (ignore cases) "+secondString+": "+firstString.equalsIgnoreCase(secondString));
        System.out.println();

        System.out.println("==============");
        System.out.println("Requirement 7:");
        System.out.println("==============");

        String threeChars;
        
        System.out.println("Create a substring from the 1st character to 3rd character");
        System.out.println("Enter a string to create substring from: ");
        threeChars = input.next();
        System.out.println("Substring from 1st to 3rd character of substring is: "+threeChars.substring(0,3));
        System.out.println();

        System.out.println("==============");
        System.out.println("Requirement 8:");
        System.out.println("==============");

        String replaceString;

        System.out.println("Enter a string, and if it contains any 'u' characters replace them with 'x' characters");
        System.out.println("Enter a string: ");
        replaceString = input.next();
        System.out.println(replaceString+" updated with 'u' characters(if they exist in the string) replaced by 'x' characters: "+replaceString.replace("u","x"));
        input.close();
    }
}
