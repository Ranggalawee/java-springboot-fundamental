package com.training.javafundamental;

import java.util.Scanner;

public class ProgramCetakSegitigaBintang {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka = 0;
        boolean validInput = false;

        // STUDI KASUS 5
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

		for (int i = 1; i <= angka; i++) {
			for (int j = 1; j <= i; j++){
				System.out.print("*");
			}
			System.out.println("");
		}

    }

}
