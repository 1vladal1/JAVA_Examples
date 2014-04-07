package io.xfiles;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by vlad on 24.03.14.
 */
public class ThawAlien {
    public static void main(String[] args) throws Exception {
        ObjectInput in = new ObjectInputStream(new FileInputStream(new File(".", "X.file")));
        Object mystery = in.readObject();
        in.close();
        System.out.println(mystery.getClass());

        //Reflection
        Method[] methods = mystery.getClass().getDeclaredMethods();
        Field[] fields = mystery.getClass().getDeclaredFields();
        System.out.println("\nMethods: ");
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("\nFields: ");
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println();
        Method m = mystery.getClass().getDeclaredMethod("method2");
        m.setAccessible(true);
        System.out.println("METHOD: " + m + " -> " + m.isAccessible());
        System.out.println("Running METHOD. Result: " + m.invoke(mystery));
    }
}
