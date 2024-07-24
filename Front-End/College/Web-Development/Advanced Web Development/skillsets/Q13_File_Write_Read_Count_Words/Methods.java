import java.util.Scanner; //always add the scanner class first!
import java.io.*; //This import provides input/output streams used to read/write data to sources 

public class Methods {
    public static void getRequirements() {

        //display optional messages 
        System.out.println("Author: Kalecia McNeal");
        System.out.println("Program Requirements: "); 
        System.out.println("Program captures user input, writes to and reads from the same file, and counts number of words in a file.");
        System.out.println("Hint: use hasNext() method to read number of words (tokens).");

        System.out.println(); //prints blank line
    } //end of getRequirements 

    //non-value returning method (static requires no object)
    public static void getWriteRead() {
        String myFile="filecountwords.txt";

        try {
            File file = new File(myFile);
            PrintWriter writer = new PrintWriter(file);

            Scanner input = new Scanner(System.in);
            String str = "";
            
            System.out.print("Please enter line of text: ");
            str = input.nextLine();

            writer.write(str);

            System.out.println("Saved to file \"" + myFile + "\"");

            input.close();
            writer.close();

            Scanner read = new Scanner (new FileInputStream(file));
            int count = 0;
            while (read.hasNext()) {
                read.next();
                count++;
            }
            System.out.println("Number of words: " + count);

            read.close();
        } catch (IOException ex) {
            System.out.println("Error writing to or reading from file " + myFile + "");
        }
    } //end of getWriteRead 
} //end of Methods class 
