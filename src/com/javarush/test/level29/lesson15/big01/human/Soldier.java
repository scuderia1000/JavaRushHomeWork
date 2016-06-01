package com.javarush.test.level29.lesson15.big01.human;

/**
 * Created by Valek on 24.05.16.
 */
public class Soldier extends Human {
    public Soldier(String name, int age) {
        super(name, age);
    }

    public void live() {
            fight();
    }

    public void fight() {
    }

}
