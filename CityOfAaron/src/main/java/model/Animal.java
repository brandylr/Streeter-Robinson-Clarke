package model;

import java.io.Serializable;

/**
 *
 * @author brobinson
 */
public class Animal implements Serializable {

    private int age;
    private String type;

    public Animal() {
    }

    public Animal(String type, int age) {
        setType(type);
        setAge(age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Animal{" + "age=" + age + '}';
    }

}
