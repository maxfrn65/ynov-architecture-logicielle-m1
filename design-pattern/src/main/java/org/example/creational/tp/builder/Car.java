package org.example.creational.tp.builder;

import java.util.ArrayList;
import java.util.List;

public class Car {

    /*----------Attributes----------*/
    private String model;
    private String engine;
    private String color;
    private int seatNumber;
    private String[] extras;

    /*----------Main constructor----------*/
    public Car() {
    }

    public Car(CarBuilder builder) {
        this.model = builder.model;
        this.engine = builder.engine;
        this.color = builder.color;
        this.seatNumber = builder.seatNumber;
        this.extras = builder.extras;
    }

    /*----------Builder----------*/
    public static class CarBuilder {
        private String model;
        private String engine;
        private String color;
        private int seatNumber;
        private String[] extras;

        public CarBuilder(String model, String engine, int seatNumber) {
            this.model = model;
            this.engine = engine;
            this.seatNumber = seatNumber;
        }

        public CarBuilder color(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder extras(List extras) {
            for (String item : List extras)
            this.extras = extras;
            return this;
        }

        public Car build() throws Exception {
            if (this.model.equalsIgnoreCase("sport") && this.engine.equalsIgnoreCase("électrique")) {
                throw new Exception("A sport model cannot have an electric engine.");
            }
        }
    }

    /*----------Getters & setters----------*/
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String[] getExtras() {
        return extras;
    }

    public void setExtras(String[] extras) {
        this.extras = extras;
    }
}
