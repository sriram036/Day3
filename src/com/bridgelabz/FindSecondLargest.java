package com.bridgelabz;

public class FindSecondLargest {
    public static void main(String[] args) {
        int[] nums = {12,873,39,983,3,372,749};
        int len = 7;
        int temp = 0;
        System.out.println("The Given array is :");
        for(int i=0;i<7;i++){
            System.out.println(nums[i]);
        }
        for(int i=0;i<7;i++){
            for(int j=i+1;j<7;j++){
                if(nums[i]>nums[j]){
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println("The Second Largest Number is :");
        System.out.println(nums[len-2]);
    }
}
