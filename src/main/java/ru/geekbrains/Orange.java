package ru.geekbrains;

public class Orange extends Fruit{
    private double weight = 1.5f;
    private String type = "Orange";

    public String getType() {
        return type;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    public Orange() {
    }
}
