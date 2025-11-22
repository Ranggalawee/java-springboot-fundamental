package com.training.javafundamental;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgramInputNilaidanCekStatusUjian {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //STUDI KASUS 7
        ProgramInputNilaidanCekStatusUjian app = new ProgramInputNilaidanCekStatusUjian();
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
        System.out.print("Berapa banyak mata pelajaran? ");
        int inputNilai = input.nextInt();
        inputNilai--;

        while (inputNilai != -1) {
            System.out.print("Masukkan nilai siswa: ");
            double nilaiSiswa = input.nextDouble();
            nilaiList.add(nilaiSiswa);
            inputNilai--;
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
