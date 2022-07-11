public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("RED", 3);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());
        circle.display();

        Rectangle rectangle = new Rectangle("Blue", 6, 7);
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());
        rectangle.display();

        Triangle triangle = new Triangle("Green", 5, 8);
        System.out.println(triangle.calculateArea());
        System.out.println(triangle.calculatePerimeter());
        triangle.display();

        Square square = new Square("Yellow", 10);
        System.out.println(square.calculateArea());
        System.out.println(square.calculatePerimeter());
        square.display();
    }
}
