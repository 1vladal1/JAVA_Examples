package io;

/**
 * Created by vlad on 25.03.14.
 */
//Run first StoreCADState

import java.io.*;
import java.util.*;

public class RecoverCADState {
    @SuppressWarnings("uncheked")

    public static void main(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("CADState.out"));
        Circle.deserializeStaticState(in);
        Square.deserializeStaticState(in);
        Line.deserializeStaticState(in);
        List<Shape> shapes = (List<Shape>)in.readObject();
        System.out.println(shapes);
    }
}
