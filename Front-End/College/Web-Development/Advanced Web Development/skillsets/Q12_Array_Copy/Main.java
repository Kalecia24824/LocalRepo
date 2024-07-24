// Javadoc: documentation generator for generating 
//API documentation in HTML format for Java source code 
// https://www.oracle.com/technical-resources/articles/java/javadoc-tool.html

public class Main {
    public static void main(String args[]) {
        //call static methods 
        Methods.getRequirements(); 

        //call array using Java 
        String [] userArray = Methods.createArray(); //Java style array 

        //call generatePseudoRandomNumber() method which passes the array above. This method prints pseduo-random generated numbers determined by user input 
        Methods.copyArray(userArray); //pass array

    } // end of public 
} // end of Main class
