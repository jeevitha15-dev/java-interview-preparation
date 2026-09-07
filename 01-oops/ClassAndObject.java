/*
             Student (Class)
             ┌─────────────┐
             │ name        │
             │ age         │
             │             │
             │ display()   │
             └─────────────┘
                    │
          ┌─────────┴─────────┐
          ↓                   ↓
      student1             student2
       Bobby                 Ravi
       age 35                age 30
      (Object)              (Object)

    What is the difference between a class and an object?
        A class is a blueprint or template that defines the properties and behavior of an entity, while an object is an actual instance of that class created at runtime.

        Student student1 = new Student();
        
        Here:

                Student         → class
                student1        → reference variable
                new Student()   → creates the object

      */

class Student {
    String name;
    int age;

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ClassAndObject {
    public static void main(String[] args) {

        Student student1 = new Student();

        student1.name = "Bobby";
        student1.age = 35;

        student1.displayDetails();
    }
}