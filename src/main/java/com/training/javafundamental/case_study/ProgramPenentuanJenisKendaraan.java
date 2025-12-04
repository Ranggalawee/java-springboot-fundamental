package com.training.javafundamental.case_study;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramPenentuanJenisKendaraan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Boolean validInput = false;
        String kodeKendaraan = "";

        // STUDI KASUS 2
        while (!validInput) {
            System.out.print("Masukkan kode kendaraan: ");
            kodeKendaraan = input.nextLine().toUpperCase().trim();
            if (kodeKendaraan.length() == 1 && kodeKendaraan.matches("[A-Z]")) {
                validInput = true;
            } else {
                System.out.println("Input harus 1 huruf kapital (A-Z)!");
            }
        }


        // hapus
        if (kodeKendaraan.matches("0-9")) {
            throw new InputMismatchException("Input merupakan angka");
        }

        String kendaraan = switch (kodeKendaraan) {
            case "M" -> "kendaraan motor";
            case "C" -> "kendaraan mobil";
            case "B" -> "kendaraan bus";
            case "T" -> "kendaraan truk";
            default -> "kode tidak dikenal";
        };

        System.out.println("Kode kendaraan tersebut adalah " + kendaraan);

    }
}
