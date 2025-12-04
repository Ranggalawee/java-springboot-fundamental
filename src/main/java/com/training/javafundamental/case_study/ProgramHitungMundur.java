package com.training.javafundamental.case_study;

import java.util.Scanner;

public class ProgramHitungMundur {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka = 0;
        boolean validInput = false;

        // STUDI KASUS 4
        while (!validInput) {
            System.out.print("Masukkan angka: ");
            if (input.hasNextDouble()) {
                angka = input.nextInt();
                if (angka >= 1 && angka <= 50) {
                    validInput = true;
                } else {
                    System.out.println("Input harus antara 1 sampai 50!");
                }
            } else {
                System.out.println("Input tidak valid! Harap masukkan angka.");
                input.next();
            }
        }

        while (angka != 0) {
            System.out.println(angka);
            angka--;
        }
    }

}
