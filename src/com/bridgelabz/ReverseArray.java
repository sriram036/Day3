package com.bridgelabz;

public class ReverseArray {
    public static void main(String[] args) {
        String[] cars = {"Suzuki","Toyota","Renault","Audi","Benz","BMW","Hyundai",};
        System.out.println("The Normal order of array is :");
        for(int i=0;i<7;i++){
            System.out.println(cars[i]);
        }
        System.out.println("The reverse order of array is");
        for(int i=6;i>=0;i--){
            System.out.println(cars[i]);
        }
    }
}
