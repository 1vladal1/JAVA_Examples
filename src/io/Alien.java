package io;

/**
 * Created by vlad on 24.03.14.
 */

import java.io.*;
//Serializable class
public class Alien implements Serializable {
    private static int value = 1;
    private int method1() {
        return value;
    }
    public int method2() {
        return method1();
    }
}
