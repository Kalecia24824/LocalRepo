import java.util.Scanner; 

public class Methods {

    public static void getRequirements() {
        //display optional messages 
        System.out.println("Developer: Kalecia McNeal");
        System.out.println("Program Requirements:");
        System.out.println("\t1. Create a string array (srt1), based upon users' number of preferred programming languages.");
        System.out.println("\t2. Create a second string array (str2), based upon the length of str1 array.");
        System.out.println("\t3. Copy str1 elements into str2.");
        System.out.println("\t4. Print elements of both arrays using Java's *enhanced* for loop. ");


        System.out.println(); //prints blank line 
    } //end of getRequirements 

    public static String[] createArray() {
        Scanner sc = new Scanner(System.in); 
        int arraySize = 0; 

        //prompt user for favorite programming languages 
        System.out.print("How many favorite programming languages do you have (min 1)? ");

        while (!sc.hasNextInt()) {
            System.out.println("Invalid input!\n");
            sc.next(); //Needed for loop to not be invalid

            System.out.print("Please try again. Enter valid input (min 1): ");
        } //end of while 

        //Initialize after valid input 
        arraySize = sc.nextInt();

        while (arraySize < 1) {
            System.out.print("\nList must be greater than 0. Please enter number of favorite programming languages: ");

            while (!sc.hasNextInt()) {
                System.out.print("\nMust enter valid data: ");
                sc.next(); 
                System.out.print("Please try again. Enter valid input (min 1): ");
            } // end of inner while 

            arraySize = sc.nextInt(); //valid int greater than 0
        }

        //add array Java-style  
        //for C++ (String myArray [])
        String yourArray[] = new String[arraySize]; 
        return yourArray; 

    } //end of createArray 

    public static void copyArray(String [] str1) {
        Scanner sc = new Scanner(System.in); 

        //populate array 
        System.out.println("Please enter your " + str1.length + "favorite programming languages:"); 

        for (int i = 0; i < str1.length; i++) {
            str1[i] = sc.nextLine(); 

        }

        //set the array size 
        String str2[] = new String[str1.length]; 

        //copy all elements of one array into another 
        //by using an enhanced loop 
        int myCounter = 0; 
        for (String myIterator: str1) {
            str2[myCounter++] = myIterator; 
        }

        //prints vertical space 
        System.out.println(); 

        //print array 
        System.out.println("Printing str1 array: ");
        for (String myIterator: str1) {
            System.out.println(myIterator);
        }

        System.out.println("\nPrinting str2 array: ");
        for (String myIterator: str2) {
            System.out.println(myIterator);
        }

        //printing vertical splice 
        System.out.println();

        sc.close(); //closing scanner 

    } //end of copyArray 

} //end of Methods 
