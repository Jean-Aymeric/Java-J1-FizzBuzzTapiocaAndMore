package com.jad;

public class Item {
    private static final int CONSTANT_BIDULE = 15;
    private static int nbObjects = 0;
    private final String name;
    private final CardColor cardColor;

    public Item() {
        this("unnamed");
    }

    public Item(final String name) {
        this(name, CardColor.getRandom());
    }

    public Item(final String name, final CardColor cardColor) {
        this.name = name;
        this.cardColor = cardColor;
        Item.nbObjects++;
    }

    public static int getNbObjects() {
        return Item.nbObjects;
    }

    @Override
    public String toString() {
        return this.getName() + " " + this.getNameCardColor();
    }

    public String getName() {
        return this.name;
    }

    public String getNameCardColor() {
        return this.cardColor.getName();
    }
}
