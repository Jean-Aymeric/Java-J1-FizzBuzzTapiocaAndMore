package com.jad.relation;

import java.util.ArrayList;

public class Foo {
    private ArrayList<Bar> bars;
    private Corge corge;
    private Qux qux;

    public Foo(final Corge corge) {
        this.bars = new ArrayList<>();
        this.corge = corge;
    }

    public ArrayList<Bar> getBars() {
        return this.bars;
    }

    public void addBar(final Bar bar) {
        this.bars.add(bar);
    }

    public Corge getCorge() {
        return this.corge;
    }

    public void setCorge(final Corge corge) {
        this.corge = corge;
    }

    public Qux getQux() {
        if (this.qux == null) {
            this.qux = new Qux();
        }
        return this.qux;
    }
}
