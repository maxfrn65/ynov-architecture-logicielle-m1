package org.example.creational.tp.prototype;

public class PlaneModel extends Model3D {
    public PlaneModel(double height, String color, String texture) {
        super(height, color, texture);
    }

    @Override
    public Model3D clone() {
        return new PlaneModel(height, color, texture);
    }
}
