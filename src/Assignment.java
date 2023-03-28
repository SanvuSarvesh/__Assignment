// Qn:- 2.

import java.util.*;
public class Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        int height = sc.nextInt();
        Circle circle = new Circle();
        Cylinder cylinder = new Cylinder();
        double areaOfCircle = circle.area(radius);
        double areaOfCylinder = cylinder.area(radius);
        double volumeOfCylinder = cylinder.volume(height)*cylinder.area(radius);
        System.out.println(areaOfCircle);
        System.out.println(areaOfCylinder);
        System.out.println(volumeOfCylinder);
    }
}
class Circle{
    public double area(int radius){
        return 3.14*radius*radius;
    }
}
class Cylinder extends Circle{
    public int volume(int h){
        return h;
    }
}


/*
*  Qn:- 3.
*   To use Encapsulation we use access modifiers,
*   Example :-
*        if we create private class or method, then we know private variables are only
*        accessible form same class so to access them we make public method called
*        getters and setters.
*
* class Student{
    private String name;
    private int rollNo;
    private String mobileNo;
    private String emailId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
*
*
*  Qn:- 4.
*       Polymorphism is of two types.
*       1. Compile time polymorphism
*               Method overloading:- same method name with different parameter
*               and return type,detected at compile time.
*       2. Runtime polymorphism
*               Method overriding:- same method in both derived class as well as
*               base class.
*
* class Polymorphism{
    public double area(int radius){
        return 3.14*radius*radius;
    }
    public double area(double length, double width ){
        return length*width;
    }
}
*
*
* import java.util.*;
public class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int radius = sc.nextInt();
        int length = sc.nextInt();
        int width = sc.nextInt();
        double areaOfCircle = area(radius);
        int areaOfRectangle = area(length,width);
        System.out.println(areaOfCircle);
        System.out.println(areaOfRectangle);
    }
    public static double area(int radius){
        return 3.14*radius*radius;
    }
    public static int area(int length, int width){
        return length*width;
    }
}
*
*
* Q:- 5.
*           OOPs:-
*           OOPs stands for object oriented programming system,
*           it provides many features(pillers of oops) like
*               1. Polymorphism
*               2. Abstaction
*               3. Encapsulation
*               4. Inheritnce
*           Advantages of OOPs
*           Concepts of OOPs helps us in Data hiding(abstraction) and
*           data binding(encapsulation)
*           Re-useability of code(inheritance), allow us to perform method overloading
*           method overriding(Polymorphism)
* */


