public class Square extends Rectangle {
    int side;

    public Square(String color, int side) {
        super(color, side, side);

    }

    @Override
    public void display() {
        System.out.println("this is a " + super.color + " " + "square");
    }
}