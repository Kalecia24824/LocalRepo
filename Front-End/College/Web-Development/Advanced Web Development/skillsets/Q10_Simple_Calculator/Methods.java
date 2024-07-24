import java.util.Scanner; 

public class Methods {
    public static void getRequirements() {
        System.out.println("Developer: Kalecia McNeal");
        System.out.println("Program Requirements:");
        System.out.println("Program uses methods to:\nadd, subtract, multiply, divide and power floating point numbers, rounded to two decimal places.");
        
        System.out.println("Note: Program checks for non-numeric values, and division by zero.");

        System.out.println(); 
    } //end of getRequirements 

    public static void calculateNumbers() {
        //Initialize and create variables 
        double num1 = 0.0, num2 = 0.0; 
        char operation = ' '; //String operation must be ""; 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter mathematical equation (a=addition, s=subtraction, m=multiplication, d=division, e=exponentiation): ");
        // the next() function returns a token
        //Tokens are the smallest elements of a program meaningful to the complier Ex.) identifiers, keywords, literals, operators and punctuations 
        
        //Next, we are going to chain methods (built-in)
        operation = sc.next().toLowerCase().charAt(0); //this method uses the next(), toLowerCase() and charAt() to capture characters 

        while(operation != 'a' && operation != 's' && operation != 'm' && operation != 'd' && operation != 'e') {
            System.out.print("\nIncorrect operation. Please enter correct operation: ");
            operation = sc.next().toLowerCase().charAt(0);
        } //end of while 

        //Ask for first number 
        System.out.print("Please enter first number: ");
        while (!sc.hasNextDouble()) {
            System.out.print("Not a valid number!\n");
            sc.next(); //needed to end loop 
            System.out.print("Please try again. Enter first number: ");
        } // end of while loop 

        //Assign num1 
        num1 = sc.nextDouble(); 

        //Ask for second number 
        System.out.print("Please enter second number: ");
        while (!sc.hasNextDouble()) {
            System.out.print("Not a valid number!\n");
            sc.next(); //needed to end loop 
            System.out.print("Please try again. Enter second number: ");
        } // end of while loop

        //Assign num2 
        num2 = sc.nextDouble(); 

        //Test operation 
        if (operation == 'a') {
            Addition(num1, num2); 
        }
        else if (operation == 's'){
            Subtraction(num1, num2); 
        }
        else if (operation == 'm') {
            Multiplication(num1, num2);  
        }
        else if (operation == 'd') {
            if (num2 == 0){
                System.out.print("Cannot divide by zero!");
            }
            else {
                Division(num1, num2); 
            }
        }
        else if (operation == 'e') {
            Exponentiation(num1, num2); 
        }

        System.out.println(); //prints line 
        sc.close(); //closes scanner 

    } //end of calculateNumbers 

    public static void Addition (double n1, double n2) {
        System.out.print(n1 + " + " + n2 + " = ");
        System.out.printf("%.2f", (n1 + n2));
    } //end of Addition

    public static void Subtraction (double n1, double n2) {
        System.out.print(n1 + " - " + n2 + " = ");
        System.out.printf("%.2f", (n1 - n2));
    } //end of Subtraction

    public static void Multiplication (double n1, double n2) {
        System.out.print(n1 + " * " + n2 + " = ");
        System.out.printf("%.2f", (n1 * n2));
    } //end of Multiplication 

    public static void Division (double n1, double n2) {
        System.out.print(n1 + " / " + n2 + " = ");
        System.out.printf("%.2f", (n1 / n2));
    } //end of Division

    public static void Exponentiation (double n1, double n2) {
        System.out.print(n1 + " to the power of " + n2 + " = ");
        System.out.printf("%.2f", (Math.pow(n1,n2)));
    } //end of Exponentiation

} // end of Methods 
