package com.bridgelabz;

public class FindSmallestElement {
    public static void main(String[] args) {
        int[] nums = {12,63,39,983,3,372,749};
        int smallest = 99999;
        for(int i=0;i<7;i++){
            if(smallest>nums[i]){
                smallest = nums[i];
            }
        }
        System.out.println("The Smallest Number is "+smallest);
    }
}
