package org.example.creational.tp.prototype;

public class HouseModel extends Model3D{
    public HouseModel(double height, String color, String texture) {
        super(height, color, texture);
    }

    public Model3D clone() {
        return new HouseModel(height, color, texture);
    }
}
