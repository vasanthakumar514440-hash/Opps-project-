import java.util.Scanner;

public class Rectangle {
    double area(double l, double b) {
        return l * b; 
    }
    double area(double s) {
        return s * s; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle r = new Rectangle(); 

        System.out.print("Enter length and breadth of rectangle: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Area of Rectangle: " + r.area(l, b));

        System.out.print("Enter side of square: ");
        double s = sc.nextDouble();
        System.out.println("Area of Square: " + r.area(s));

        sc.close();
    }
}
