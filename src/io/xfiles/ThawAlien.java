package io.xfiles;

import java.io.*;

/**
 * Created by vlad on 24.03.14.
 */
public class ThawAlien {
    public static void main(String[] args) throws Exception {
        ObjectInput in = new ObjectInputStream(new FileInputStream(new File(".", "X.file")));
        Object mystery = in.readObject();
        in.close();
        System.out.println(mystery.getClass());
    }
}
