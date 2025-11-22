package com.training.javafundamental;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgramHitungdanKlasifikasiNilaiMahasiswa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//      STUDI KASUS 6
		ArrayList<Double> nilaiList = new ArrayList<>();
		System.out.print("Berapa banyak mata pelajaran? ");
		int jumlahNilai = input.nextInt();

		while (jumlahNilai != 0) {
			System.out.print("Masukkan nilai siswa: ");
			double nilaiSiswa = input.nextDouble();
			nilaiList.add(nilaiSiswa);
			jumlahNilai--;
		}
        double rataRata = hitungRataRata(nilaiList);

        String status;

		if (rataRata >= 70) {
			status = "lulus";
		} else if (rataRata < 50) {
			status = "tidak lulus";
		} else {
			status = "remedial";
		}

		System.out.println("Siswa dinyatakan " + status + " dengan nilai rata-rata " + rataRata);

    }

    public static double hitungRataRata(ArrayList<Double> list) {
        double sum = 0;

        for (double nilai : list) {
            sum += nilai;
        }

        return sum / list.size();
    }

}
