package com.hsp.edu.homework;

import java.io.*;
import java.util.Properties;

public class Homework03 {
    public static void main(String[] args) throws IOException {
        String filePath = "java\\dog.properties";
        Properties properties = new Properties();
        properties.load(new FileReader(filePath));
        String name = properties.get("name") + "";
        int age = Integer.parseInt(properties.get("age") + "");
        String color = properties.get("color") + "";

        Dog dog = new Dog(name, age, color);
        System.out.println("====dog对象信息====");
        System.out.println(dog);

        String serFilePath = "e:\\dog.dat";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(serFilePath));
        oos.writeObject(dog);

        oos.close();
        System.out.println("dog对象，序列化完成。。。");

    }
}
class Dog implements Serializable {
    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
