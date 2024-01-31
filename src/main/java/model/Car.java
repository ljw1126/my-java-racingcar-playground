package model;

import utils.RandomNumberGenerator;

public class Car {

    private static final int FORWARD_NUMBER = 4;
    private String name;
    private int position;

    public Car(String name) {
        this(name, 0);
    }

    public Car(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public void move(int random) {
        if(random >= FORWARD_NUMBER) {
            this.position += 1;
        }
    }

    public int getPosition() {
        return position;
    }
}
