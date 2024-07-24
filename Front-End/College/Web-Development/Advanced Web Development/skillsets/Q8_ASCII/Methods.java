import java.util.Scanner; 

public class Methods {
    public static void getRequirements() {

        //display optional messages 
        System.out.println("Developer: Kalecia McNeal");
        System.out.println("Program Requirements:");
        System.out.println("\t1. Write an application that displays integer equivalents of uppercase letters.");
        System.out.println("\t2. Display character equivalents of ASCII vales 48 - 122.");
        System.out.println("\t3. Display the character equivalents of ASCII value user input.");

        System.out.println("\tNote: Compare answers to https://www.asciitable.com/");
        System.out.println(); //prints blank line 

    } //end of getRequirements

    public static void getAscii() {
        //declare variables 
        int num = 0; 
        boolean isValidNum = false; 
        Scanner sc = new Scanner(System.in); 

        System.out.println("Printing characters A-Z as ASCII values: ");
        for (char character = 'A'; character <= 'Z'; character++) {
            System.out.printf("Character %c has ascii value %d\n", character, ((int)character));
        } // end of char for loop 

        //Or, typecasting 
        System.out.println("\nPrinting ASCII values 48-122 as characters: ");
        for(num = 48; num <= 122; num++) {
            System.out.printf("ASCII value %d has character value %c\n", num, ((char)num));
        } //end of num for loop

        //Ask/Allow user input 
        System.out.println("\nAllowing user ASCII value input:");

        while (isValidNum == false) {
            //check num double 
            System.out.print("Please enter ASCII value (32 - 127): ");
            
            if (sc.hasNextInt()) {
                num = sc.nextInt(); 
                isValidNum = true;
            } //end of hasNextInt loop

            else {
                System.out.println("Invalid integer-ASCII value must be a number.\n");
            } //end of else 

            sc.nextLine(); // discard any other data entered on line 

            //If num data is true, check num range 
            if (isValidNum == true && num < 32 || num > 127) {
                System.out.println("ASCII value must be >= 32 and <= 127.\n");
                isValidNum = false;
            } //end of isValidNum if loop

            if (isValidNum == true) {
                System.out.println();

                //display result 
                System.out.printf("ASCII value %d has character value %c\n", num,((char)num));
            }
        } //end of while loop

        sc.close(); //close scanner 
    } //end of getAscii
}
