package com.hf.designPatter.factory.simpleFactory;

public abstract class Pizza {
    protected String description;

    public void prepare() {
        System.out.println("prepare " + description);
    }

    public void bake() {
        System.out.println("bake " + description);
    }

    public void cut() {
        System.out.println("cut " + description);
    }

    public void box() {
        System.out.println("box " + description);
    }
}
