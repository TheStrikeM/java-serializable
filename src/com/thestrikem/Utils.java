package com.thestrikem;

import java.io.*;

public class Utils {
    public static void serializableClass(Object object, String name) throws Exception {
        FileOutputStream fileOutputStream = new FileOutputStream(name);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(object);
        objectOutputStream.close();
    }

    public static Object unSerializableClass(String name) throws Exception {
        FileInputStream fileInputStream = new FileInputStream(name);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Object newObject = objectInputStream.readObject();
        return newObject;
    }
}
