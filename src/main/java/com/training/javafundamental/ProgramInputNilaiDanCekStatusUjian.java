package com.training.javafundamental;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgramInputNilaiDanCekStatusUjian {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //STUDI KASUS 7
        ProgramInputNilaiDanCekStatusUjian app = new ProgramInputNilaiDanCekStatusUjian();
        app.inputNilai();

    }

    public static double hitungRataRata(ArrayList<Double> list) {
        double sum = 0;

        for (double nilai : list) {
            sum += nilai;
        }

        return sum / list.size();
    }

    public void inputNilai() {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> nilaiList = new ArrayList<>();
        boolean validInput = false;
        int inputNilai = 0;
        double nilaiSiswa = 0;
        int counter = 1;

        while (!validInput) {
            System.out.print("Berapa banyak mata pelajaran? ");
            if (input.hasNextInt()) {
                inputNilai = input.nextInt();
                if (inputNilai > 0 && inputNilai <= 10) {
                    validInput = true;
                } else {
                    System.out.println("Input harus antara 1 sampai 10!");
                }
            } else {
                System.out.println("Input tidak valid! Harap masukkan angka.");
                input.next();
            }
        }
        validInput = false;
        inputNilai++;

        while (counter != inputNilai) {
            while (!validInput) {
                System.out.print("Masukkan nilai mata pelajaran ke-" + counter + ": ");
                if (input.hasNextDouble()) {
                    nilaiSiswa = input.nextDouble();
                    if (nilaiSiswa > 0 && nilaiSiswa <= 100) {
                        validInput = true;
                    } else {
                        System.out.println("Input harus antara 1 sampai 100!");
                    }
                } else {
                    System.out.println("Input tidak valid! Harap masukkan angka.");
                    input.next();
                }
            }
            validInput = false;
            nilaiList.add(nilaiSiswa);
            counter++;
        }

        double rataRata = hitungRataRata(nilaiList);
        String status;

        if (rataRata >= 70) {
            status = "Selamat, Anda lulus!";
        } else if (rataRata >= 50 && rataRata < 70) {
            status = "Anda harus remedial.";
        } else {
            status = "Anda tidak lulus.";
        }

        System.out.println(status + " Nilai Anda " + rataRata);
    }
}
