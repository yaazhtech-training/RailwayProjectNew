package com.yaazhtech.railwayManagement.Demo;

public class ReverseString {
    public static void main(String[] args){
        String value1 = "GOOD MORNING";
        String reverse = "";

        for(int i = value1.length()-1;i >= 0;i--) {
            reverse = reverse + value1.charAt(i);

        }
        System.out.println(value1);
        System.out.println(reverse);
    }
}
