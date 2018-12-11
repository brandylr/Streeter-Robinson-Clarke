/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author brobinson
 */
public class Provision implements Serializable {

    private int age;
    private String type;

    public Provision() {

    }

    public Provision(String type, int age) {
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
        return "Provision{" + "age=" + age + '}';

    }

}
