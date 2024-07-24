import java.util.Scanner;

    public class Methods {
        //Create Method w/out returning any value 
        public static void getRequirements() {
            //display optional messages 
            System.out.println("Developer: Kalecia McNeal");
            System.out.println("Program Requirements:");
            System.out.println("\t1. Counts number and types of character from user-entered string.");
            System.out.println("\t2. Count: total, letters (upper/lower-case), numbers, spaces, and other characters.");
            System.out.println("\tHint: Helpful methods: isLetter(), isDigit(), isSpaceChar(), and others ;)");
    
            System.out.println(); //prints blank line
        } //end of getRequirements 
    
        public static void countChar() {
            //declare variables 
            int letter = 0; 
            int space = 0; 
            int num = 0; 
            int upper = 0; 
            int lower = 0; 
            int other = 0; 
            String str = ""; 
    
            //Test String: "Here is a Test String"
            System.out.println("Please enter a string: ");
            Scanner sc = new Scanner(System.in);
            str = sc.nextLine(); 
    
            char[] ch = str.toCharArray(); 
    
            //For loop 
            for(int i = 0; i < str.length(); i++) {
                if (Character.isLetter(ch[i])) {
    
                    if (Character.isUpperCase(ch[i])) {
                        upper++;
                    } //end of if isUpperCase loop
    
                    if (Character.isLowerCase(ch[i])) {
                        lower++;
                    } //end of if isLowerCase loop
    
                    letter ++;
                } //end of if isLetter loop 
    
                else if (Character.isDigit(ch[i])) {
                    num++; 
                } //end of isDigit
    
                else if (Character.isSpaceChar(ch[i])) {
                    space++;
                } //end of isSpaceChar
    
                else {
                    other++;
                } //end of else 
                
            } //end of main for loop
    
            System.out.println("\nYour string : \"" + str + "\" has the following number and types of characters: ");
            System.out.println("Total number of characters: " + str.length());
            System.out.println("Letter(s): " + letter);
            System.out.println("Upper-case letter(s): " + upper);
            System.out.println("Lower-case letter(s): " + lower);
            System.out.println("Number(s): " + num);
            System.out.println("Space(s): " + space);
            System.out.println("Other character(s): " + other);
    
        }
    } //end of Methods class 
