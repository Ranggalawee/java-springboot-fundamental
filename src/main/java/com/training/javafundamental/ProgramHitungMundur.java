package com.training.javafundamental;

import java.util.Scanner;

public class ProgramHitungMundur {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // STUDI KASUS 4
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        while (angka != 0) {
            System.out.println(angka);
            angka--;
        }
    }

}
