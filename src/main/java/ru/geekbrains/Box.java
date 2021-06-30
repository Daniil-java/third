package ru.geekbrains;

import java.util.ArrayList;

public class Box<T> {
    private double weight = 0.0f;
    private String type;

    private ArrayList<Object> arrayList = new ArrayList<>();

    public Box(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public String getType() {
        return type;
    }

    public ArrayList<Object> getArrayList() {
        return arrayList;
    }

    void addFruit(Fruit fruit) {
        if (this.type == fruit.getType()) {
            arrayList.add(fruit);
            this.weight = this.weight + fruit.getWeight();
            System.out.println("Вы добавили в коробку: " + this.type);
        } else {
            System.out.println("Найдите другую коробку");
        }
    }

    boolean compare(Box secondBox) {
        if (this.weight == secondBox.getWeight()) {
            System.out.println("Вес коробок - одинаковый");
            return true;
        } else {
            System.out.println("Вес коробок - разный");
            return false;
        }
    }

    void pourIntoBox(Box secondBox) {
        if (this.type == secondBox.getType()) {
            this.arrayList.addAll(secondBox.getArrayList());
            this.weight = this.weight + secondBox.getWeight();
            System.out.println("Вы пересыпали фрукты из одной коробки в другую");
        } else {
            System.out.println("Вы неможете смешивать разные виды фруктов");
        }
    }
}
