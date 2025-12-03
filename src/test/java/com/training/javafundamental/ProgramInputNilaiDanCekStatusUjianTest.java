package com.training.javafundamental;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ProgramInputNilaiDanCekStatusUjianTest {

    @Test
    public void testAllLogic() {
        // ===== TEST HITUNG RATA-RATA =====
        System.out.println("Testing Hitung Rata-Rata...");

        // Test dengan nilai normal
        ArrayList<Double> nilai1 = new ArrayList<>(Arrays.asList(80.0, 90.0, 70.0));
        assertEquals(80.0, hitungRataRata(nilai1), 0.01, "Rata-rata (80,90,70) should be 80");

        ArrayList<Double> nilai2 = new ArrayList<>(Arrays.asList(100.0, 100.0, 100.0));
        assertEquals(100.0, hitungRataRata(nilai2), 0.01, "Rata-rata (100,100,100) should be 100");

        ArrayList<Double> nilai3 = new ArrayList<>(Arrays.asList(50.0, 60.0, 70.0, 80.0));
        assertEquals(65.0, hitungRataRata(nilai3), 0.01, "Rata-rata (50,60,70,80) should be 65");

        ArrayList<Double> nilai4 = new ArrayList<>(Arrays.asList(75.0));
        assertEquals(75.0, hitungRataRata(nilai4), 0.01, "Rata-rata dengan 1 nilai (75) should be 75");

        ArrayList<Double> nilai5 = new ArrayList<>(Arrays.asList(0.0, 0.0, 0.0));
        assertEquals(0.0, hitungRataRata(nilai5), 0.01, "Rata-rata (0,0,0) should be 0");

        ArrayList<Double> nilai6 = new ArrayList<>(Arrays.asList(85.5, 90.5, 95.0));
        assertEquals(90.33, hitungRataRata(nilai6), 0.01, "Rata-rata dengan desimal");

        ArrayList<Double> nilai7 = new ArrayList<>(Arrays.asList(10.0, 20.0, 30.0, 40.0, 50.0));
        assertEquals(30.0, hitungRataRata(nilai7), 0.01, "Rata-rata (10,20,30,40,50) should be 30");

        // Test dengan banyak nilai (10 mata pelajaran)
        ArrayList<Double> nilai8 = new ArrayList<>(Arrays.asList(
                70.0, 75.0, 80.0, 85.0, 90.0, 65.0, 70.0, 75.0, 80.0, 85.0
        ));
        assertEquals(77.5, hitungRataRata(nilai8), 0.01, "Rata-rata 10 nilai");

        // ===== TEST STATUS KELULUSAN =====
        System.out.println("Testing Status Kelulusan...");

        // Test LULUS (>= 70)
        assertEquals("Selamat, Anda lulus!", getStatus(70.0), "Nilai 70 should LULUS");
        assertEquals("Selamat, Anda lulus!", getStatus(85.5), "Nilai 85.5 should LULUS");
        assertEquals("Selamat, Anda lulus!", getStatus(100.0), "Nilai 100 should LULUS");
        assertEquals("Selamat, Anda lulus!", getStatus(95.0), "Nilai 95 should LULUS");
        assertEquals("Selamat, Anda lulus!", getStatus(70.01), "Nilai 70.01 should LULUS");

        // Test REMEDIAL (50 - 69.99)
        assertEquals("Anda harus remedial.", getStatus(50.0), "Nilai 50 should REMEDIAL");
        assertEquals("Anda harus remedial.", getStatus(69.99), "Nilai 69.99 should REMEDIAL");
        assertEquals("Anda harus remedial.", getStatus(60.0), "Nilai 60 should REMEDIAL");
        assertEquals("Anda harus remedial.", getStatus(65.5), "Nilai 65.5 should REMEDIAL");
        assertEquals("Anda harus remedial.", getStatus(50.01), "Nilai 50.01 should REMEDIAL");

        // Test TIDAK LULUS (< 50)
        assertEquals("Anda tidak lulus.", getStatus(49.99), "Nilai 49.99 should TIDAK LULUS");
        assertEquals("Anda tidak lulus.", getStatus(30.0), "Nilai 30 should TIDAK LULUS");
        assertEquals("Anda tidak lulus.", getStatus(0.0), "Nilai 0 should TIDAK LULUS");
        assertEquals("Anda tidak lulus.", getStatus(25.5), "Nilai 25.5 should TIDAK LULUS");
        assertEquals("Anda tidak lulus.", getStatus(10.0), "Nilai 10 should TIDAK LULUS");

        // Test boundary values
        assertEquals("Selamat, Anda lulus!", getStatus(70.0), "Boundary: 70 should LULUS");
        assertEquals("Anda harus remedial.", getStatus(69.9), "Boundary: 69.9 should REMEDIAL");
        assertEquals("Anda harus remedial.", getStatus(50.0), "Boundary: 50 should REMEDIAL");
        assertEquals("Anda tidak lulus.", getStatus(49.9), "Boundary: 49.9 should TIDAK LULUS");

        // ===== TEST VALIDASI INPUT MATA PELAJARAN =====
        System.out.println("Testing Validasi Input Mata Pelajaran...");

        assertTrue(isValidJumlahMapel(1), "1 mata pelajaran should be valid");
        assertTrue(isValidJumlahMapel(5), "5 mata pelajaran should be valid");
        assertTrue(isValidJumlahMapel(10), "10 mata pelajaran should be valid");
        assertTrue(isValidJumlahMapel(7), "7 mata pelajaran should be valid");

        assertFalse(isValidJumlahMapel(0), "0 mata pelajaran should be invalid");
        assertFalse(isValidJumlahMapel(-1), "-1 mata pelajaran should be invalid");
        assertFalse(isValidJumlahMapel(11), "11 mata pelajaran should be invalid");
        assertFalse(isValidJumlahMapel(100), "100 mata pelajaran should be invalid");
        assertFalse(isValidJumlahMapel(-5), "-5 mata pelajaran should be invalid");

        // ===== TEST VALIDASI NILAI SISWA =====
        System.out.println("Testing Validasi Nilai Siswa...");

        assertTrue(isValidNilaiSiswa(1.0), "Nilai 1 should be valid");
        assertTrue(isValidNilaiSiswa(50.0), "Nilai 50 should be valid");
        assertTrue(isValidNilaiSiswa(100.0), "Nilai 100 should be valid");
        assertTrue(isValidNilaiSiswa(75.5), "Nilai 75.5 should be valid");
        assertTrue(isValidNilaiSiswa(99.99), "Nilai 99.99 should be valid");

        assertFalse(isValidNilaiSiswa(0.0), "Nilai 0 should be invalid");
        assertFalse(isValidNilaiSiswa(-10.0), "Nilai -10 should be invalid");
        assertFalse(isValidNilaiSiswa(101.0), "Nilai 101 should be invalid");
        assertFalse(isValidNilaiSiswa(150.0), "Nilai 150 should be invalid");
        assertFalse(isValidNilaiSiswa(-5.5), "Nilai -5.5 should be invalid");
        assertFalse(isValidNilaiSiswa(100.1), "Nilai 100.1 should be invalid");

        // Test boundary values untuk nilai
        assertTrue(isValidNilaiSiswa(1.0), "Boundary: 1 should be valid");
        assertFalse(isValidNilaiSiswa(0.99), "Boundary: 0.99 should be invalid");
        assertTrue(isValidNilaiSiswa(100.0), "Boundary: 100 should be valid");
        assertFalse(isValidNilaiSiswa(100.01), "Boundary: 100.01 should be invalid");

        // ===== TEST EDGE CASES =====
        System.out.println("Testing Edge Cases...");

        // Test dengan nilai minimum yang valid
        ArrayList<Double> nilaiMin = new ArrayList<>(Arrays.asList(1.0, 1.0, 1.0));
        assertEquals(1.0, hitungRataRata(nilaiMin), 0.01, "Rata-rata nilai minimum");
        assertEquals("Anda tidak lulus.", getStatus(hitungRataRata(nilaiMin)), "Status untuk nilai minimum");

        // Test dengan nilai maksimum
        ArrayList<Double> nilaiMax = new ArrayList<>(Arrays.asList(100.0, 100.0, 100.0));
        assertEquals(100.0, hitungRataRata(nilaiMax), 0.01, "Rata-rata nilai maksimum");
        assertEquals("Selamat, Anda lulus!", getStatus(hitungRataRata(nilaiMax)), "Status untuk nilai maksimum");

        // Test dengan nilai campuran (lulus dan tidak lulus)
        ArrayList<Double> nilaiCampur1 = new ArrayList<>(Arrays.asList(100.0, 50.0, 60.0));
        assertEquals(70.0, hitungRataRata(nilaiCampur1), 0.01, "Rata-rata nilai campuran (lulus)");
        assertEquals("Selamat, Anda lulus!", getStatus(hitungRataRata(nilaiCampur1)), "Status lulus dengan nilai campuran");

        ArrayList<Double> nilaiCampur2 = new ArrayList<>(Arrays.asList(80.0, 40.0, 50.0));
        assertEquals(56.67, hitungRataRata(nilaiCampur2), 0.01, "Rata-rata nilai campuran (remedial)");
        assertEquals("Anda harus remedial.", getStatus(hitungRataRata(nilaiCampur2)), "Status remedial dengan nilai campuran");

        ArrayList<Double> nilaiCampur3 = new ArrayList<>(Arrays.asList(60.0, 30.0, 20.0));
        assertEquals(36.67, hitungRataRata(nilaiCampur3), 0.01, "Rata-rata nilai campuran (tidak lulus)");
        assertEquals("Anda tidak lulus.", getStatus(hitungRataRata(nilaiCampur3)), "Status tidak lulus dengan nilai campuran");

        // Test dengan 1 mata pelajaran saja
        ArrayList<Double> satu1 = new ArrayList<>(Arrays.asList(75.0));
        assertEquals("Selamat, Anda lulus!", getStatus(hitungRataRata(satu1)), "1 mapel nilai 75");

        ArrayList<Double> satu2 = new ArrayList<>(Arrays.asList(60.0));
        assertEquals("Anda harus remedial.", getStatus(hitungRataRata(satu2)), "1 mapel nilai 60");

        ArrayList<Double> satu3 = new ArrayList<>(Arrays.asList(40.0));
        assertEquals("Anda tidak lulus.", getStatus(hitungRataRata(satu3)), "1 mapel nilai 40");

        // Test dengan 10 mata pelajaran (maksimum)
        ArrayList<Double> sepuluh = new ArrayList<>(Arrays.asList(
                70.0, 70.0, 70.0, 70.0, 70.0, 70.0, 70.0, 70.0, 70.0, 70.0
        ));
        assertEquals(70.0, hitungRataRata(sepuluh), 0.01, "10 mapel semua nilai 70");
        assertEquals("Selamat, Anda lulus!", getStatus(hitungRataRata(sepuluh)), "Status 10 mapel nilai 70");

        // ===== TEST PRESISI DESIMAL =====
        System.out.println("Testing Presisi Desimal...");

        ArrayList<Double> desimal1 = new ArrayList<>(Arrays.asList(85.5, 90.3, 78.7));
        assertEquals(84.83, hitungRataRata(desimal1), 0.01, "Rata-rata dengan desimal");

        ArrayList<Double> desimal2 = new ArrayList<>(Arrays.asList(69.9, 69.9, 69.9));
        assertEquals(69.9, hitungRataRata(desimal2), 0.01, "Rata-rata 69.9 (remedial)");
        assertEquals("Anda harus remedial.", getStatus(hitungRataRata(desimal2)), "Status 69.9");

        ArrayList<Double> desimal3 = new ArrayList<>(Arrays.asList(70.1, 70.1, 70.1));
        assertEquals(70.1, hitungRataRata(desimal3), 0.01, "Rata-rata 70.1 (lulus)");
        assertEquals("Selamat, Anda lulus!", getStatus(hitungRataRata(desimal3)), "Status 70.1");

        // ===== TEST SKENARIO REAL =====
        System.out.println("Testing Skenario Real...");

        // Siswa dengan nilai bagus
        ArrayList<Double> siswaBagus = new ArrayList<>(Arrays.asList(85.0, 90.0, 88.0, 92.0, 87.0));
        double rataBagus = hitungRataRata(siswaBagus);
        assertEquals(88.4, rataBagus, 0.01, "Rata-rata siswa bagus");
        assertEquals("Selamat, Anda lulus!", getStatus(rataBagus), "Status siswa bagus");

        // Siswa dengan nilai sedang (remedial)
        ArrayList<Double> siswaSedang = new ArrayList<>(Arrays.asList(60.0, 65.0, 55.0, 62.0, 58.0));
        double rataSedang = hitungRataRata(siswaSedang);
        assertEquals(60.0, rataSedang, 0.01, "Rata-rata siswa sedang");
        assertEquals("Anda harus remedial.", getStatus(rataSedang), "Status siswa sedang");

        // Siswa dengan nilai kurang
        ArrayList<Double> siswaKurang = new ArrayList<>(Arrays.asList(30.0, 40.0, 35.0, 45.0, 25.0));
        double rataKurang = hitungRataRata(siswaKurang);
        assertEquals(35.0, rataKurang, 0.01, "Rata-rata siswa kurang");
        assertEquals("Anda tidak lulus.", getStatus(rataKurang), "Status siswa kurang");

        // Siswa dengan nilai fluktuatif tapi lulus
        ArrayList<Double> siswaFluktuatif = new ArrayList<>(Arrays.asList(100.0, 60.0, 80.0, 50.0, 90.0));
        double rataFluktuatif = hitungRataRata(siswaFluktuatif);
        assertEquals(76.0, rataFluktuatif, 0.01, "Rata-rata siswa fluktuatif");
        assertEquals("Selamat, Anda lulus!", getStatus(rataFluktuatif), "Status siswa fluktuatif");

        System.out.println("All tests passed! ✓");
    }

    // ===== HELPER METHODS =====

    public static double hitungRataRata(ArrayList<Double> list) {
        double sum = 0;
        for (double nilai : list) {
            sum += nilai;
        }
        return Math.round((sum / list.size()) * 100.0) / 100.0;
    }

    public static String getStatus(double rataRata) {
        if (rataRata >= 70) {
            return "Selamat, Anda lulus!";
        } else if (rataRata >= 50 && rataRata < 70) {
            return "Anda harus remedial.";
        } else {
            return "Anda tidak lulus.";
        }
    }

    public static boolean isValidJumlahMapel(int jumlah) {
        return jumlah > 0 && jumlah <= 10;
    }

    public static boolean isValidNilaiSiswa(double nilai) {
        return nilai > 0 && nilai <= 100;
    }
}
