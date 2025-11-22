package com.training.javafundamental;

import java.util.Scanner;

public class ProgramCetakDeretBilanganGenap {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // STUDI KASUS 3
		System.out.print("Masukkan angka: ");
		int angka = input.nextInt();

		if (angka % 2 == 0) {
			for (int i = 2; i <= angka; i+=2){
				System.out.print(i + " ");
			}
		} else {
			System.out.println("Masukkan angka genap");
		}

    }

}
