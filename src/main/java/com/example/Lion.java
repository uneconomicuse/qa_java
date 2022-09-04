package com.example;

import java.util.List;

public class Lion extends Animal implements FelineInterface, Predator {
    boolean hasMane;

    public Lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    @Override
    public int getKittens() {
        return getKittens(1);
    }

    @Override
    public int getKittens(int kittensCount) {
        return kittensCount;
    }

    @Override
    public List<String> eatMeat() throws Exception {
        return getFood("Хищник");
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

}
