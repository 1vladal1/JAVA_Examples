package tests.enums;

/**
 * Created by vlad
 */
public class TestEnums {
    public static void main(String[] args) {
        for (Seasons season : Seasons.values()) {
            System.out.println(season.name() + " -> " + season);
            System.out.println("getName(): " + season.getName() + " getId():" + season.getId());
        }
    }
}
