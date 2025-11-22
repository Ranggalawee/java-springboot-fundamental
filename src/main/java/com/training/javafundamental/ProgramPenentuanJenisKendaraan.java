package com.training.javafundamental;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramPenentuanJenisKendaraan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // STUDI KASUS 2
        System.out.print("Masukkan kode kendaraan: ");
        String kodeKendaraan = input.nextLine();

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
