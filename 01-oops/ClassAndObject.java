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

        student1.name = "Jeevitha";
        student1.age = 36;

        student1.displayDetails();
    }
}