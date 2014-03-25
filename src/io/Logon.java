package io;

/**
 * Created by vlad on 24.03.14.
 */

//keyword: transient

import java.util.concurrent.*;
import java.util.*;
import java.io.*;

public class Logon implements Serializable {
    private Date date = new Date();
    private String username;
    private transient String password;
    public Logon(String name, String pwd) {
        username = name;
        password = pwd;
    }
    public String toString() {
        return "Session info \nUser: " + username + "\nDate: " + date + "\nPassword: " + password;
    }

    public static void main(String[] args) throws Exception {
        Logon a = new Logon("USER", "PassWord");
        System.out.println("Session a = " + a);
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("Logon.out"));
        out.writeObject(a);
        out.close();

        a = null;
        TimeUnit.SECONDS.sleep(5);

        ObjectInput in = new ObjectInputStream(new FileInputStream("Logon.out"));
        System.out.println();
        System.out.println("Restoring object. Time: " + new Date());
        a = (Logon)in.readObject();
        System.out.println("Session a = " + a);
    }
}
