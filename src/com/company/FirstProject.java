package com.company;
import java.util.Scanner;

public class FirstProject {
    public static void main(String[]args){
        System.out.println("Ведіть число:");
        Scanner scanner_1 = new Scanner(System.in);
        int a_1 = scanner_1.nextInt();
        System.out.println("Ведіть ще одне число");
        Scanner scanner_2 = new Scanner(System.in);
        int a_2 = scanner_2.nextInt();
        int a = a_1 / a_2;
        int b = a_1 % a_2;
        System.out.println("Результат :" + a);
        System.out.println("Результат:" + b);
    }
}
