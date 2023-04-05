package com.bridgelabz;

public class FindLargestElement {
    public static void main(String[] args) {
        int[] nums = {12,63,39,983,3,372,749};
        int largest = 0;
        for (int i=0;i<7;i++){
            if (largest<nums[i]){
                largest = nums[i];
            }
        }
        System.out.println("The Largest Number is "+largest);
    }
}
