package com.yaazhtech.railwayManagement.Demo;
import java.util.Scanner;

public class fibonacci2 {
    private static Scanner sc;

    public static void main(String[] args) {
        int Number, i = 0, First_Value = 0, Second_Value = 1, Next;
        sc = new Scanner(System.in);
        System.out.println("Please Enter any integer Value: ");
        Number = sc.nextInt();
        while (i < Number) {
            if (i <= 1) {
                Next = i;
            } else {
                Next = First_Value + Second_Value;
                First_Value = Second_Value;
                Second_Value = Next;
            }
            System.out.println(Next);
            i++;
        }
    }

}