package com.training.javafundamental;

import java.util.Scanner;

public class AplikasiKalkulatorSederhana {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //STUDI KASUS 8
        String decision;
        do {
            System.out.flush();
            System.out.println("Program kalkulator");
            System.out.print("Masukkan angka 1: ");
            double angka1 = input.nextDouble();
            System.out.print("Masukkan angka 2: ");
            double angka2 = input.nextDouble();
            System.out.println("Pilihan operasi");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Keluar");
            System.out.print("Masukkan operasi: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Hasil penjumlahan: " + penjumlahan(angka1, angka2));
                    break;
                case 2:
                    System.out.println("Hasil pengurangan: " + pengurangan(angka1, angka2));
                    break;
                case 3:
                    System.out.println("Hasil perkalian: " + perkalian(angka1, angka2));
                    break;
                case 4:
                    System.out.println("Hasil pembagian: " + pembagian(angka1, angka2));
                    break;
                case 5:
                    System.out.println("Program selesai");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opsi tidak valid");
            }
            input.nextLine();
            System.out.print("Apakah akan menghitung lagi? ");
            decision = input.nextLine();

        } while (decision.equalsIgnoreCase("y"));

        System.out.println("Program selesai");

    }

    public static double penjumlahan(double angka1, double angka2) {
        return angka1 + angka2;
    }

    public static double pengurangan(double angka1, double angka2) {
        return angka1 - angka2;
    }

    public static double perkalian(double angka1, double angka2) {
        return angka1 * angka2;
    }

    public static double pembagian(double angka1, double angka2) {
        return angka1 / angka2;
    }

}
