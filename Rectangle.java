package assign1;

public class Rectangle {

        public int area(int side) {
        return side * side;
    }

        public int area(int length, int breadth) {
        return length * breadth;
    }

        public double area(double length, double breadth) {
        return length * breadth;
    }

       public static void main(String[] args) {
        Rectangle rect = new Rectangle();

        System.out.println("Area of square: " + rect.area(5));
        System.out.println("Area of rectangle (int): " + rect.area(5, 10));
        System.out.println("Area of rectangle (double): " + rect.area(5.5, 3.2));
    }
}
