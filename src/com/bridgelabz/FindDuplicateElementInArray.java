package com.bridgelabz;

public class FindDuplicateElementInArray {
    public static void main(String[] args) {
        int[] nums = {12,63,749,983,12,372,749};
        System.out.println("These are the Duplicate Numbers of the given array:");
        for(int i=0;i<7;i++){
            for(int j=i+1;j<7;j++){
                if(nums[i]==nums[j]){
                    System.out.println(nums[i]);
                }
            }
        }
    }
}
