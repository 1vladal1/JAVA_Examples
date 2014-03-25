package test1;

/**
 * Created by vlad on 13.02.14.
 */
public class Triangle implements Shape, Comparable<Shape> {
    @Override
    public void draw() {
        System.out.println("   #  ");
        System.out.println("  ###  ");
        System.out.println(" ##### ");
        System.out.println("#######");
    }

    @Override
    public int getCorners() {
        return 3;
    }

    @Override
    public int compareTo(Shape shape) {
        return new Integer(getCorners()).compareTo(shape.getCorners());
    }
}
