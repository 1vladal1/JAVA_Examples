package tests.interfaces;

/**
 * Created by vlad
 */
public class ClassB implements Interface2 {
    @Override
    public void method2() {
        System.out.println("ClassB method2()");
    }

    public void method4() {
        System.out.println("ClassB method4()");
    }
}
