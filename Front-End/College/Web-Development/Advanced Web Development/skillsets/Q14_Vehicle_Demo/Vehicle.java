
public class Vehicle {
    //Instance variables (no static keyword) thus they have their own instance variables  
    private String make; 
    private String model; 
    private int year; 

    //Java does not support parameters with default values (like C++ and a few others)

    //default constructor 
    public Vehicle() {
        System.out.println("\nInside vehicle default constructor. ");
        make = "My Make"; 
        model = "My Model"; 
        year = 1970; 
    }

    public Vehicle(String make, String model, int year) {
        System.out.println("\nInside vehicle constructor with parameters. ");
        this.make = make; 
        this.model = model; 
        this.year = year ; 
    }

    public String getMake() {
        return make; 
    }

    public void setMake(String mk) {
        //set the instance variable value to parameter value 
        make = mk; 
    }
    
    public String getModel() {
        return model; 
    }

    public void setModel(String md) {
        //set the instance variable value to parameter value
        model = md; 
    }

    public int getYear() {
        return year; 
    }

    public void setYear(int y) {
        //set the instance variable value to parameter value
        year = y; 
    }

    public void print() {
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year);
    }
}
