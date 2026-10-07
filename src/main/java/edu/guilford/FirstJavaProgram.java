package edu.guilford;

import java.util.Arrays;

public class FirstJavaProgram {

    public static void main(String[] args) {
        System.out.println("Here's a dice rolling program.");

        Die[] dice = new Die[5];
        for (int i = 0; i < dice.length; i++) {
            dice[i] = new Die(6);
            dice[i].roll();
        }

        System.out.println("The values of the dice are: " + Arrays.toString(dice));
    }
}
