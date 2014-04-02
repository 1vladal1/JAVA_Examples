package tests.abstracts;

/**
 * Created by vlad
 */
public abstract class MakeMethod3 extends MakeMethod2 {
    @Override
    public void method3() {
        this.a = 20;
        System.out.println("Running: method3() a = " + a);
    }
}
