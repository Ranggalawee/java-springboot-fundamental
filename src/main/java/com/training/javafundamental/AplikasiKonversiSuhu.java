package com.training.javafundamental;

import java.util.Scanner;

public class AplikasiKonversiSuhu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu = 0;
        boolean validInput = false;
        double angka = 0;

        // STUDI KASUS 9
        String decision = "";
        do {
            validInput = false;
            decision = "";
            System.out.flush();
            System.out.println("Program konversi suhu");
            System.out.println("1. Celcius ke Fahrenheit");
            System.out.println("2. Fahrenheit ke Celcius");
            System.out.println("3. Celcius ke Kelvin");
            System.out.println("4. Kelvin ke Celcius");
            System.out.println("5. Keluar");
            while (!validInput) {
                System.out.print("Pilih menu: ");
                if (input.hasNextInt()) {
                    menu = input.nextInt();
                    if (menu >= 1 && menu <= 5) {
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

            while (!validInput) {
                System.out.print("Masukkan angka: ");

                if (input.hasNextDouble()) {
                    angka = input.nextDouble();
                    validInput = true;
                } else {
                    System.out.println("Input tidak valid! Harap masukkan angka.");
                    input.next();
                }
            }
            System.out.print("Hasil konversi: ");

            switch (menu) {
                case 1:
                    System.out.println(celciusToFahrenheit(angka) + "° Fahrenheit");
                    break;
                case 2:
                    System.out.println(fahrenheitToCelcius(angka) + "° Celcius");
                    break;
                case 3:
                    System.out.println(celciusToKelvin(angka) + "° Kelvin");
                    break;
                case 4:
                    System.out.println(kelvinToCelcius(angka) + "° Celcius");
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

    public static double celciusToFahrenheit(double angka) {
        double result = (angka * 9/5) + 32;
        return Double.parseDouble(String.format("%.2f", result));
    }

    public static double fahrenheitToCelcius(double angka) {
        double result = (angka - 32) * 5/9;
        return Double.parseDouble(String.format("%.2f", result));
    }

    public static double celciusToKelvin(double angka) {
        double result = angka + 273.15;
        return Double.parseDouble(String.format("%.2f", result));
    }

    public static double kelvinToCelcius(double angka) {
        double result = angka - 273.15;
        return Double.parseDouble(String.format("%.2f", result));
    }

}
