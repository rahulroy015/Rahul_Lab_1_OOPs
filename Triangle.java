public class Triangle implements IShape {
    int heigth, base;
    String color;

    public Triangle(String color, int heigth, int base) {
        // super(color);
        this.color = color;
        this.heigth = heigth;
        this.base = base;

    }

    @Override
    public double calculateArea() {
        return (this.heigth * this.base) / 2;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * ((heigth + base) + Math.sqrt(heigth ^ 2 + base ^ 2));
    }

    // @Override
    // public void display() {
    // System.out.println("this is a " + super.color + " " + "triangle");
    // }
}