package com.norbertcserpnyak16;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        System.out.print("Adjon meg egy értékét: ");
        int a = new Scanner(System.in).nextInt();
        System.out.print("Adjon meg mégegy értékét: ");
        int b = new Scanner(System.in).nextInt();

        int osszeadas = a + b;
        int kivonas = a - b;
        int szorzas= a * b;
        int osztas = a / b;

        System.out.println("Összeadás eredménye: " + osszeadas);
        System.out.println("Kivonás eredménye: " + kivonas);
        System.out.println("Szorzás eredménye: " + szorzas);
        System.out.println("Osztás eredménye: " + osztas);

    }
}