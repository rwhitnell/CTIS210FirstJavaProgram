package edu.guilford;

import java.util.Random;

public class Die {
    private int faces;
    private int value;
    private Random rand = new Random();

    public Die(int faces) {
        this.faces = faces;
        this.value = 1;
    }

    public void roll() {
        value = rand.nextInt(1, faces + 1);
    }

    public int getValue() {
        return value;
    }

    public int getFaces() {
        return faces;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

}
