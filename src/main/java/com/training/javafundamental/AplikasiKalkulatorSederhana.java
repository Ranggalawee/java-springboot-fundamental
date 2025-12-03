package com.training.javafundamental;

import java.util.Scanner;

public class AplikasiKalkulatorSederhana {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double angka1 = 0;
        double angka2 = 0;
        boolean validInput = false;
        int choice = 0;

        //STUDI KASUS 8
        String decision = "";
        do {
            validInput = false;
            decision = "";
            System.out.flush();
            System.out.println("Program kalkulator");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Keluar");
            while (!validInput) {
                System.out.print("Pilih menu: ");
                if (input.hasNextInt()) {
                    choice = input.nextInt();
                    if (choice >= 1 && choice <= 5) {
                        validInput = true;
                    } else {
                        System.out.println("Input harus antara 1 sampai 5!");
                    }
                } else {
                    System.out.println("Input tidak valid! Harap masukkan angka.");
                    input.next();
                }
            }
            validInput = false;

            if (choice == 5) {
                System.out.println("Program selesai");
                System.exit(0);
            }

            while (!validInput) {
                System.out.print("Masukkan angka pertama: ");
                if (input.hasNextDouble()) {
                    angka1 = input.nextDouble();
                    validInput = true;
                } else {
                    System.out.println("Input tidak valid! Harap masukkan angka.");
                    input.next();
                }
            }
            validInput = false;

            while (!validInput) {
                System.out.print("Masukkan angka kedua: ");
                if (input.hasNextDouble()) {
                    angka2 = input.nextDouble();
                    validInput = true;
                } else {
                    System.out.println("Input tidak valid! Harap masukkan angka.");
                    input.next();
                }
            }

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
            }
            input.nextLine();

            while (!decision.equals("y") && !decision.equals("n")) {
                System.out.print("Kembali ke menu? (y/n): ");
                decision = input.nextLine().toLowerCase().trim();

                if (!decision.equals("y") && !decision.equals("n")) {
                    System.out.println("Input tidak valid! Masukkan 'y' atau 'n'.");
                }
            }

        } while (decision.equalsIgnoreCase("y"));

        System.out.println("Program selesai");
        input.close();
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
