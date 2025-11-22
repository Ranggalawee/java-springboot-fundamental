package com.training.javafundamental;

import java.util.Scanner;

public class AplikasiKonversiSuhu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // STUDI KASUS 9
        String decision;
        do {
            System.out.flush();
            System.out.println("Program konversi suhu");
            System.out.println("1. Celcius ke Fahrenheit");
            System.out.println("2. Fahrenheit ke Celcius");
            System.out.println("3. Celcius ke Kelvin");
            System.out.println("4. Kelvin ke Celcius");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int menu = input.nextInt();
            System.out.print("Masukkan angka: ");
            double angka = input.nextDouble();
            System.out.print("Hasil konversi: ");

            switch (menu) {
                case 1:
                    System.out.println(celciusToFahrenheit(angka) + "° Fahrenheit");
                    break;
                case 2:
                    System.out.println(fahrenheitToCelcius(angka) + "°  Celcius");
                    break;
                case 3:
                    System.out.println(celciusToKelvin(angka) + "° Kelvin");
                    break;
                case 4:
                    System.out.println(kelvinToCelcius(angka) + "° Celcius");
                    break;
                case 5:
                    System.out.println("Program selesai");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opsi tidak valid");
            }
            input.nextLine();
            System.out.print("Apakah akan melakukan konversi lagi? (y/n): ");
            decision = input.nextLine();

        } while (decision.equalsIgnoreCase("y"));

        System.out.println("Program selesai");
        input.close();
    }

    public static double celciusToFahrenheit(double angka) {
        return (angka * 9/5) + 32;
    }

    public static double fahrenheitToCelcius(double angka) {
        return (angka - 32) * 5/9;
    }

    public static double celciusToKelvin(double angka) {
        return angka + 273.15;
    }

    public static double kelvinToCelcius(double angka) {
        return angka - 273.15;
    }

}
