package com.bridgelabz;

public class FindArrayElementsInOddPosition {
    public static void main(String[] args) {
        String[] cars = {"Suzuki","Toyota","Renault","Audi","Benz","BMW","Hyundai",};
        for (int i=0;i<7;i++){
            if(i%2==1){
                System.out.println(cars[i]);
            }
        }
    }
}
