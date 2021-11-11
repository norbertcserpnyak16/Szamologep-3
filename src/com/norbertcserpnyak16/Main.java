package com.norbertcserpnyak16;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Adjon meg egy értékét: ");
        int a = new Scanner(System.in).nextInt();
        System.out.print("Adjon meg mégegy értékét: ");
        int b = new Scanner(System.in).nextInt();

        int i = a + b;
        int i1 = a - b;
        int i2 = a * b;
        int i3 = a / b;
        System.out.println("Összeadás: " + i);
        System.out.println("Kivonás: " + i1);
        System.out.println("Szorzás: " + i2);
        System.out.println("Osztás: " + i3);

    }
}