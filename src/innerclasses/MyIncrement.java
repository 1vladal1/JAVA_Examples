package innerclasses;

/**
 * Created by vlad
 */

class MyIncrement {
    public void increment() {
        System.out.println("Other increment operation");
    }

    public static void f(MyIncrement mi) {
        mi.increment();
    }
}
