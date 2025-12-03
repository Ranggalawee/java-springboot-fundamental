package com.training.javafundamental;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramPenentuanKelulusanSiswa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // STUDI KASUS 1
		System.out.print("Masukkan nama siswa: ");
		String namaSiswa = input.nextLine();
		System.out.print("Masukkan nilai ujian siswa: ");
        try {
            int nilaiUjian = input.nextInt();
            String status;

            if (nilaiUjian >= 70 && nilaiUjian <= 100) {
                status = "lulus ujian";
            } else if (nilaiUjian < 70 && nilaiUjian >= 0) {
                status = "tidak lulus ujian";
            } else {
                throw new InputMismatchException("Input tidak valid");
            }

            System.out.println("Siswa dengan nama " + namaSiswa + " " + status);
        } catch (InputMismatchException e) {
            System.out.println("Error: Input harus berupa angka bulat!");
        }

    }
}
