package com.company;

public class SumIsTen {
    public static void main(String[] args) {
        int[] arr = {3,6,12,9,10,4};
        int sum = 10;
        for (int i = 0; i< arr.length;i++ ){
            int temp = sum-arr[i];
            for (int j = i+1; j< arr.length; j++){
                if(arr[j] == temp){
                    System.out.println(i + " " + j);
                }
            }

        }
    }
}
