package ru.geekbrains;

import java.util.ArrayList;
import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {

//        //********************************************
//        String[] arr = {"1", "2", "3", "4", "5", "6"};
//        swap(arr, 2, 5);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//        //********************************************
//
//
//        //********************************************
//        System.out.println(creatArrayList(arr));
//        //********************************************


        Box oranges = new Box("Orange");
        Box apples = new Box("Apple");

        Apple apple = new Apple();
        Orange orange = new Orange();

        oranges.addFruit(apple);
        oranges.addFruit(orange);

        apples.addFruit(apple);
        System.out.println(oranges.getWeight() + "   " + apples.getWeight());

        oranges.compare(apples);
    }

    public static <T>void swap(T[] array, int first, int second) {  //метод, который меняет два элемента массива местами
        T temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    public static <T>ArrayList creatArrayList(T[] array) {
        ArrayList<T> arrayList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            arrayList.add(array[i]);
        }
        return arrayList;
    }
}
