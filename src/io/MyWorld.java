package io;

/**
 * Created by vlad on 24.03.14.
 */

import java.io.*;
import java.util.*;

class House implements Serializable {}

class Animal implements Serializable {
    private String name;
    private House prefferedHouse;

    Animal(String nm, House h) {
        name = nm;
        prefferedHouse = h;
    }
    public String toString() {
        return name + "[" + super.toString() + "], " + prefferedHouse + "\n";
    }
}

public class MyWorld {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        House house = new House();
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("Bosco the dog", house));
        animals.add(new Animal("Ralph the hamster", house));
        animals.add(new Animal("Molly the cat", house));
        System.out.println("Animals " + animals);

        ByteArrayOutputStream buf1 = new ByteArrayOutputStream();
        ObjectOutput out1 = new ObjectOutputStream(buf1);
        out1.writeObject(animals);
        out1.writeObject(animals);

        ByteArrayOutputStream buf2 = new ByteArrayOutputStream();
        ObjectOutput out2 = new ObjectOutputStream(buf2);
        out2.writeObject(animals);

        ObjectInput in1 = new ObjectInputStream(new ByteArrayInputStream(buf1.toByteArray()));
        ObjectInput in2 = new ObjectInputStream(new ByteArrayInputStream(buf2.toByteArray()));
        List
                animals1 = (List)in1.readObject(),
                animals2 = (List)in1.readObject(),
                animals3 = (List)in2.readObject();
        System.out.println("Animals1: " + animals1);
        System.out.println("Animals2: " + animals2);
        System.out.println("Animals3: " + animals3);
    }
}
