package com.jad;

import java.util.Random;

public enum CardColor {
    SPADE("Pique"),
    HEART("Coeur"),
    DIAMOND("Carreau"),
    CLUB("Trèfle");

    private final String name;

    CardColor(final String name) {
        this.name = name;
    }

    public static CardColor getRandom() {
        return CardColor.values()[new Random().nextInt(CardColor.values().length)];
    }

    public String getName() {
        return this.name;
    }
}
