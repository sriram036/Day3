package com.bridgelabz;

public class FindArrayElementsInEvenPosition {
    public static void main(String[] args) {
        String[] cars = {"Suzuki","Toyota","Renault","Audi","Benz","BMW","Hyundai",};
        for(int i=0;i<7;i++){
            if(i !=0 && i%2==0){
                System.out.println(cars[i]);
            }
        }
    }
}
