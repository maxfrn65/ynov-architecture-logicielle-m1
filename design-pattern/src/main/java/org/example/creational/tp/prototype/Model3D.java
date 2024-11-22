package org.example.creational.tp.prototype;

public abstract class Model3D {
    protected double height;
    protected String color;
    protected String texture;

    public Model3D(double height, String color, String texture) {
        this.height = height;
        this.color = color;
        this.texture = texture;
    }

    public abstract Model3D clone();
}
