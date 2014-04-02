package tests.abstracts;

/**
 * Created by vlad
 */
public abstract class Sallary {
    protected int a;
    public abstract void method1();
    public abstract void method2();
    public abstract void method3();
    public void makeSallary() {
        method1();
        method2();
        method3();
    }
}
