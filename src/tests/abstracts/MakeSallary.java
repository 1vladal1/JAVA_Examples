package tests.abstracts;

/**
 * Created by vlad
 */
public class MakeSallary extends MakeMethod3 {
    @Override
    public void makeSallary() {
        System.out.println("Starting");
        super.makeSallary();
        System.out.println("Ending");
    }

    public static void main(String[] args) {
        Sallary sallary = new MakeSallary();
        sallary.makeSallary();
    }
}
