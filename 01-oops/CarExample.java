/* 
    One class can be used to create many objects, and each object maintains its own state.

    What is an object?
        An object is an instance of a class. It has its own state and can use the behavior defined by the class.

    Here:

        Part	                    Meaning
        Car	                        Class / type
        c1	                        Reference variable
        new Car()	                Creates a new object
        c1.brand	                Accesses object's state
        c1.displayDetails()	        Invokes object's behavior


    One small interview trap ⚠️

        Don't say:

        "c1 is the object."

        More precisely:

        c1 is a reference variable
        new Car() creates the object
        c1 refers to that object
*/

class Car {
    String brand;
    String model;
    int year;

    void displayDetails() {
        System.out.println(" Brand  :  " + brand);
        System.out.println(" Model  :  " + model);
        System.out.println(" Year  :  " + year);
    }
}

public class CarExample {

    public static void main(String[] args){

        Car c1 = new Car();
        c1.brand = "Hyundai";
        c1.model = "Creta";
        c1.year = 2021;

        Car c2 = new Car();
        c2.brand = "Suzuki";
        c2.model = "Swift";
        c2.year = 2010;

        c1.displayDetails();
        c2.displayDetails();
        
    }
}