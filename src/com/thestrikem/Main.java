package com.thestrikem;

import java.io.Serializable;

public class Main {

    public static void main(String[] args) throws Exception {
	    User exampleUser = (User) Utils.deSerializableClass("temp_file");
	    System.out.println(exampleUser.name);
    }
}

class User implements Serializable {
    int age;
    String name;
    String description;
    transient Sword sword;
}

class Sword {
    int level;
}
