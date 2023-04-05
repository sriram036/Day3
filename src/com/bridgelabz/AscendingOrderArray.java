package com.bridgelabz;

public class AscendingOrderArray {
    public static void main(String[] args) {
        int[] nums = {12,3,39,983,3,372,749};
        int len = 7;
        int temp = 0;
        System.out.println("The given array is :");
        for(int i=0;i<7;i++){
            System.out.println(nums[i]);
        }
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(nums[i]>nums[j]){
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println("The Ascending order of given array is :");
        for(int i=0;i<7;i++){
            System.out.println(nums[i]);
        }
    }
}
