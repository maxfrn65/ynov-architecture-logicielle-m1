package org.example.creational.tp.prototype;

public class CarModel extends Model3D {

    public CarModel(double height, String color, String texture) {
        super(height, color, texture);
    }

    @Override
    public Model3D clone() {
        return new CarModel(height, color, texture);
    }
}
