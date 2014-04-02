package tests;

/**
 * Created by vlad
 */

class SingletonClass {
    private static SingletonClass instance = null;
    private long id;
    private SingletonClass() {
        System.out.println("Create instance");
    }

    public static SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass();
            instance.id = System.currentTimeMillis() + ((long) Math.random() * 1000L);
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Singleton id = " + id;
    }
}

public class Singleton {
    public static void main(String[] args) {
        SingletonClass singleton = SingletonClass.getInstance();
        System.out.println(singleton);
    }
}
