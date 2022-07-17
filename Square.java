public class Square extends Rectangle {
    int side;

    public Square(String color, int side) {
        super(color, side, side);

    }

    @Override
    public double calculateArea() {
        System.out.println("Calculate method is called");
        return this.width * this.length;
    }

    // @Override
    // public void draw() {
    // System.out.println("this is a " + super.color + " " + "square");
    // }
}