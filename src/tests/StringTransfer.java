package tests;

/**
 * Created by vlad on 26.03.14.
 */
public class StringTransfer {
    static String str = "Value 1";

    public static void changeIt(String s) {
        s = "Value 2";
    }

    public static void main(String[] args) {
        changeIt(str);
        System.out.println(str);
    }
}