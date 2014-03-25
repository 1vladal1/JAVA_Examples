package io;

/**
 * Created by vlad on 24.03.14.
 */

import java.io.*;

public class Blip3 implements Externalizable {
    private int i;
    private String s;
    public Blip3() {
        System.out.println("Blip3 Constructor");
    }
    public Blip3(String x, int a) {
        System.out.println("Blip3(String x, int a)");
        s = x;
        i = a;
    }
    public String toString() {
        return s + i;
    }

    public void writeExternal(ObjectOutput out) throws IOException {
        System.out.println("Blip3.writeExternal");
        out.writeObject(s);
        out.writeInt(i);
    }
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        System.out.println("Blip3.readExternal");
        s = (String)in.readObject();
        i = in.readInt();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("Creating objects: ");
        Blip3 b3 = new Blip3("String ", 47);
        System.out.println(b3);

        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("Blip3.out"));
        System.out.println("Saving object: ");
        out.writeObject(b3);
        out.close();

        b3 = null;

        ObjectInput in = new ObjectInputStream(new FileInputStream("Blip3.out"));
        System.out.println("Restoring object: ");
        Blip3 b4 = (Blip3)in.readObject();
        System.out.println(b4);
    }
}
