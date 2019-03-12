package com.design.pattern.singleton.seriable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SeriableSingletonTest {

    public static void main(String[] args) {
        SeriableSingleton seriableSingleton1 = null;
        SeriableSingleton seriableSingleton2 = SeriableSingleton.getInstance();
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("SeriableSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(seriableSingleton2);
            oos.flush();
            oos.close();
            FileInputStream fis = new FileInputStream("SeriableSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            seriableSingleton1 = (SeriableSingleton)ois.readObject();
            ois.close();
            System.out.println(seriableSingleton1);
            System.out.println(seriableSingleton2);
            System.out.println(seriableSingleton1 == seriableSingleton2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
