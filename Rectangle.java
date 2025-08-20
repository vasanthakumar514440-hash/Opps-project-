public class Rectangle {
    // Method to calculate area with two integer parameters (length and width)
    public int area(int length, int width) {
        return length * width;
    }

    // Method to calculate area with one integer parameter (for square)
    public int area(int side) {
        return side * side;
    }

    // Method to calculate area with two double parameters
    public double area(double length, double width) {
        return length * width;
    }

    // Method to calculate area with one double parameter (for square)
    public double area(double side) {
        return side * side;
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();

        // Rectangle area with int parameters
        System.out.println("Area of rectangle (int): " + rect.area(5, 10));

        // Square area with int parameter
        System.out.println("Area of square (int): " + rect.area(7));

        // Rectangle area with double parameters
        System.out.println("Area of rectangle (double): " + rect.area(5.5, 8.2));

        // Square area with double parameter
        System.out.println("Area of square (double): " + rect.area(6.3));
    }
}