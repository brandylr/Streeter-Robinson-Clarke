package model;

import java.io.Serializable;

/**
 *
 * @author brobinson
 */
public class Animal implements Serializable {

    private int age;

    public Animal() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" + "age=" + age + '}';
    }

}
