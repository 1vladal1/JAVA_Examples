package test2;
import shapes.*;

/**
 * Created by vlad on 13.02.14.
 */
public class Test2 {
    public static void main(String[] args) {
        Shape shape = new Square(5);
        System.out.println(shape);
        shape.draw();
    }
}
