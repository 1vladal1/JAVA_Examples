package test1;

/**
 * Created by vlad on 13.02.14.
 */
public class Square implements Shape, Comparable<Shape> {

    private int side;

    @Override
    public void draw() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < side; i++) {
            s.append("# ");
        }

        for (int i = 0; i < side; i++) {
            System.out.println(s);
        }
    }

    @Override
    public int getCorners() {
        return 4;
    }

    @Override
    public int compareTo(Shape shape) {
        return new Integer(getCorners()).compareTo(shape.getCorners());
    }

    public int getPerimeter() {
        return 4 * side;
    }

    public Square(int side) {
        this.side = side;
    }

}
