package com.yaazhtech.railwayManagement.Demo;

public class SecondLargestNo1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a[] = {23,14,56,77,66,67};
        int high = 0;
        int sec = 0;
        for(int i = 0 ; i <a.length; i++){
            if(high < a[i]){
                sec = high;
                high = a[i];
            }
            else if(sec < a[i]){
                sec = a[i];
            }

        }
        System.out.println("the first highest number is " + high);
        System.out.println("the second highest number is " + sec);
    }


}
