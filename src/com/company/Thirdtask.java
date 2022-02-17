package com.company;

import java.util.Scanner;

public class Thirdtask {
    public static void main(String[]args) {
        System.out.print("Вкажіть число для округлення: ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        int b = (int) a;
        double c = (a - b);
        double x = c + 0.5;
        int r = (int) a + (int) x;
        System.out.println(r);

    }
}
