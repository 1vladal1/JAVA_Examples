package io;

/**
 * Created by vlad on 24.03.14.
 */
import java.io.*;

//Create a file with serializable data

public class FreezeAlien {
    public static void main(String[] args) throws Exception {
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("X.file"));
        Alien quellek = new Alien();
        out.writeObject(quellek);
        out.close();
    }
}
