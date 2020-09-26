package com.imc;

import java.util.Random;

public class Computer {

    // to generate Computer's Random Input
    public int getInput() {
        Random random = new Random();
        return random.nextInt(3)+1;
    }
}
