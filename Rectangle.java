public class Rectangle {
    public int area(int length, int width) {
        return length * width;
    } 
    public int area(int side) {
        return side * side;
    }
    public double area(double length, double width) {
        return length * width;
    }
    public double area(double side) {
        return side * side;
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();

        System.out.println("Area of rectangle (int): " + rect.area(5, 10));

        System.out.println("Area of square (int): " + rect.area(7));

        System.out.println("Area of rectangle (double): " + rect.area(5.5, 8.2));

        System.out.println("Area of square (double): " + rect.area(6.3));
    }
}
