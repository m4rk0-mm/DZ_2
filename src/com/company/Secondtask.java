package com.company;

import java.util.Scanner;

public class Secondtask {
    public static void main(String[]args){
        System.out.println("Ведіть двозначне  число:");
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = a / 10;
        int c = a % 10;

        System.out.println(b + c);
    }
}
