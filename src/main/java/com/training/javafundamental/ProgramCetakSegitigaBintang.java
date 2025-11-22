package com.training.javafundamental;

import java.util.Scanner;

public class ProgramCetakSegitigaBintang {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // STUDI KASUS 5
		System.out.print("Masukkan angka: ");
		int angka = input.nextInt();

		for (int i = 1; i <= angka; i++) {
			for (int j = 1; j <= i; j++){
				System.out.print("*");
			}
			System.out.println("");
		}

    }

}
