public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("RED", 3);
        // System.out.println(circle.calculateArea());
        // System.out.println(circle.calculatePerimeter());
        // circle.display();
        circle.renderer.draw();
        circle.renderer.draw("This is a circle");

        Rectangle rectangle = new Rectangle("Blue", 6, 7);
        // System.out.println(rectangle.calculateArea());
        // System.out.println(rectangle.calculatePerimeter());
        rectangle.renderer.draw();
        rectangle.renderer.draw("This is a rectangle");
        // rectangle.display();

        Triangle triangle = new Triangle("Green", 5, 8);
        // System.out.println(triangle.calculateArea());
        // System.out.println(triangle.calculatePerimeter());
        // triangle.display();
        triangle.renderer.draw();
        triangle.renderer.draw("This is a triangle");

        Square square = new Square("Yellow", 10);
        // System.out.println(square.calculateArea());
        // System.out.println(square.calculatePerimeter());
        square.renderer.draw();
        System.out.println(square.calculateArea());

        // square.display();
    }
}
