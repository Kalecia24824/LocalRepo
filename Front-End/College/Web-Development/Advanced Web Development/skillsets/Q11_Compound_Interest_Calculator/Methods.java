import java.util.Scanner; 
import java.text.NumberFormat; 
import java.util.Locale;

public class Methods{
    public static void getRequirements() {
        System.out.println("Developer: Kalecia McNeal");
        System.out.println("Program Requirements:");
        System.out.println("\t1. Calculates amount of money saved for a period of years at a *monthly* interest rate.");
        System.out.println("\t2. Returned amount is formatted in U.S. currency, and rounded to two decimals places.");

        System.out.println("\t3. Must perform data validation: for non-numeric values, as well as only integer values for years.");

        System.out.println();
    } //end of getRequirements 

    public static void getInterestValue() {

        //Initialize variables 
        Scanner sc = new Scanner(System.in); 
        double principal = 0.0; //the initial amount
        double rate = 0.0; //percentage rate 
        int time = 0; //years 
        // This formula is very similar to Pe^rt 

        //prompt user for principal 
        System.out.print("Current principal: $"); 
        
        while(!sc.hasNextDouble()) {
            System.out.println("Not valid number!\n");
            sc.next(); 
            System.out.print("Please try again. Enter principal: $");
        }
        
        principal = sc.nextDouble(); 

        //prompt user for interest 
        System.out.print("Interest Rate (per year): "); 
        
        while(!sc.hasNextDouble()) {
            System.out.println("Not valid number!\n");
            sc.next(); 
            System.out.print("Please try again. Enter interest rate: ");
        }
        
        rate = sc.nextDouble();
        rate = rate / 100; 

        //prompt user for time
        System.out.print("Total time (in years): "); 
        
        while(!sc.hasNextInt()) {
            System.out.println("Not valid integer!\n");
            sc.next(); 
            System.out.print("Please try again. Enter years: ");
        }
        
        time = sc.nextInt();

        sc.close(); //close scanner 

        //method call 
        calculateInterest(principal, rate, time); 

    } //end getInterestValue

    public static void calculateInterest(double p, double r, int t) {
        //Initialize variables 
        int n = 12; //number of times per year for interest
        double i = 0.0; //interest
        double a = 0.0; //amount 

        //assign values 
        a = p * Math.pow(1 + (r / n), n * t); 
        i = a - p; 
        r = r * 100; //converting back to percent value 

        //US currency 
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US); 
        System.out.println("\nInitial prinicpal: " + nf.format(p));
        System.out.printf("Annual interest rate: %.1f%%%n", r);
        System.out.println("Total monthly compounded interest after " + t + " years: " + nf.format(i));
        System.err.println("Total amount: " + nf.format(a));

    } //end of calculateInterest
} //end of Methods
