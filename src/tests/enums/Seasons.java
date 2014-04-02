package tests.enums;

/**
 * Created by vlad
 */
enum Seasons {
    Spring("Весна", 1), Summer("Лето", 2), Autumn("Осень", 3), Winter("Зима", 4);
    private String name;
    private int id;

    private Seasons(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " " + id;
    }
}
