package concurrency;

/**
 * Created by vlad on 25.03.14.
 */
public class MainThread {
    public static void main(String[] args) {
        LiftOff launch = new LiftOff();
        launch.run();
    }
}
