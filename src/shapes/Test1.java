package shapes;

import java.util.Arrays;

/**
 * Created by vlad on 13.02.14.
 */
//Пример интерфейса для геометрических фигур

public class Test1 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        System.out.println("New SHAPES:");
        shapes[0] = new Square(4);
        shapes[1] = new Triangle();
        for (Shape shape : shapes) {
            System.out.println(shape);
            shape.draw();
            System.out.println();
        }
        System.out.println(Arrays.toString(shapes));
        Arrays.sort(shapes);
        System.out.println(Arrays.toString(shapes));

        System.out.println();
        System.out.println("New SQUARE:");
        Square square = new Square(6);
        square.draw();
        System.out.println(square.getPerimeter());
    }
}
