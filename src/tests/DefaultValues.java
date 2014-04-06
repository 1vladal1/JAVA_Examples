package tests;


/**
 * Created by vlad
 */

class Primitives {
    boolean aBoolean;
    char aChar;
    byte aByte;
    short aShort;
    int anInt;
    long aLong;
    float aFloat;
    double aDouble;
}

public class DefaultValues {
    public static void main(String[] args) {
        Primitives primitives = new Primitives();
        System.out.println("Default values of primitives as fields in class");
        System.out.println("boolean: " + primitives.aBoolean);
        System.out.println("char: " + primitives.aChar);
        System.out.println("byte: " + primitives.aByte);
        System.out.println("short: " + primitives.aShort);
        System.out.println("int: " + primitives.anInt);
        System.out.println("long: " + primitives.aLong);
        System.out.println("float: " + primitives.aFloat);
        System.out.println("double: " + primitives.aDouble);
        byte bb = (byte)(100*100);
        System.out.println(100*100 % 128 + " " + bb);

    }
}
