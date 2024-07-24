import java.util.Scanner; 

public class Methods {  
    public static void getRequirements() { //Debugging: Definitely not getRequirements

        //display optional messages 
        System.out.println("Developer: Kalecia McNeal");
        System.out.println("Program Requirements:");
        System.out.println("\t1. Returns a letter grade based upon user-entered numeric score.");
        System.out.println("\t2. Program checks for non-numeric and out of range values.");

        System.out.println("\tNote: Program is accurate to 6th fraction digit (i.e, 6 digits right of decimal point).");

        System.out.println(); //prints blank line 

    } //end of getRequirements

    //nonvalue-returning method (static requires no object)
    public static void getScore() { //Debugging: Definitely not here either 
        //initalize variables 
        Scanner sc = new Scanner(System.in); 
        double score = 0.0; //The user will input a value 

        //Prompt user for score
        //hasNextDouble() method returns a true value if next token can be interpreted 
        System.out.print("Please enter grade between 0 to 100, inclusive: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Not valid number!\n");
            sc.next(); // This method is important so the loop will not be infinite 
            System.out.print("Please try again. Enter grade between 0 to 100, inclusive: ");
        } // end of while loop

        score = sc.nextDouble(); 
        getGrade(score); 

        sc.close(); //lets you close scanner 
    
    } // end of getScore 

    public static void getGrade(double score) {
        //initalize variable 
        String grade = ""; 

        if (score < 0 || score > 100) {
            System.out.println("\nOut of range!");
            //sc.next(); //Is important in case you don't want infinite loop!!
            getScore(); 
        } // end of if loop  
        else {
            //FSU Grading Score 
            if (score < 60 && score >= 0) {
                grade = "F"; 
            } //end of F grade 

            else if (score < 63 && score >= 60){
                grade = "D-"; 
            }
            else if (score < 67 && score >= 63) {
                grade = "D"; 
            }
            else if (score < 70 && score >= 67 ) {
                grade = "D+"; 
            } //end of "D" loops 


            else if (score < 73 && score >= 70) {
                grade = "C-"; 
            }
            else if (score < 77 && score >= 70) {
                grade = "C"; 
            }
            else if (score < 80 && score >= 77) {
                grade = "C+";
            } // end of "C" loops
            
            else if (score < 83 && score >= 80) {
                grade = "B-"; 
            }
            else if (score < 87 && score >= 83) {
                grade = "B"; 
            }
            else if (score < 90 && score >= 87) {
                grade = "B+";
            } // end of "B" loops 

            else if (score < 93 && score >= 90) {
                grade = "A-"; 
            } // end of "A-" loop

            else {
                grade = "A"; //There can't be anything else ;) 
            } // end of else 
        }

        //printf(): https//www.jquery-az.com/10-examples-learn-java-string-formatting-printf-method/
        System.out.printf("\nScore entered: %f%n", score);
        System.out.printf("Final grade: %s%n", grade);
    } // end of getGrade 

} //end of Method class 
