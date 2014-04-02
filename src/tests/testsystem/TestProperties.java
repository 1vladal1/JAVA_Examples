package tests.testsystem;

import java.util.Map;
import java.util.Properties;

/**
 * Created by vlad
 */
public class TestProperties {
    public static void main(String[] args) {
        Properties p = System.getProperties();
        for (Map.Entry<Object, Object> entry : p.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        System.out.println();
        System.out.println("File separator is: " + p.getProperty("file.separator"));
    }
}
