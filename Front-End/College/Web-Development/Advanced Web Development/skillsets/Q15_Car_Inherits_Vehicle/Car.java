class Car extends Vehicle {
    //Instance variables 
    private float speed; 

    //Java does not support parameters with default constructors 
    
    //default constructor 
    public Car() {
        //super() method be the first element in constructor 
        super(); 
        System.out.println("\nInside car default constructor.");

        speed = 100;  
    } //end of Car 

    //parameterized constructor 
    public Car(String m, String d, int y, float s) {
        super(m, d, y); 
        System.out.println("\nInside car constructor with parameters.");
        speed = s; 
    } //end public Car 

    //getter/setter methods (accessor/mutator methods)
    public double getSpeed() {
        return speed; 
    } //end of  getSpeed 

    public void setSpeed(float s) {
        speed = s; 
    } //end of setSpeed 

    //remember that sub-classes can override/replace inherited methods
    //overridden methods must have the same signature 
    public void print() {
        super.print(); 
        System.out.println(", Speed: " + speed);
    }
}
