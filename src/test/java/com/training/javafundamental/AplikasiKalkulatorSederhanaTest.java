package com.training.javafundamental;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AplikasiKalkulatorSederhanaTest {

    @Test
    public void testAllLogic() {
        // ===== TEST FUNGSI PENJUMLAHAN =====
        System.out.println("Testing Penjumlahan...");
        assertEquals(10.0, penjumlahan(5, 5), 0.01, "5 + 5 should be 10");
        assertEquals(0.0, penjumlahan(0, 0), 0.01, "0 + 0 should be 0");
        assertEquals(100.5, penjumlahan(50.5, 50), 0.01, "50.5 + 50 should be 100.5");
        assertEquals(-5.0, penjumlahan(-10, 5), 0.01, "-10 + 5 should be -5");
        assertEquals(0.0, penjumlahan(-5, 5), 0.01, "-5 + 5 should be 0");
        assertEquals(-15.0, penjumlahan(-10, -5), 0.01, "-10 + (-5) should be -15");
        assertEquals(1000000.0, penjumlahan(999999, 1), 0.01, "999999 + 1 should be 1000000");

        // ===== TEST FUNGSI PENGURANGAN =====
        System.out.println("Testing Pengurangan...");
        assertEquals(0.0, pengurangan(5, 5), 0.01, "5 - 5 should be 0");
        assertEquals(5.0, pengurangan(10, 5), 0.01, "10 - 5 should be 5");
        assertEquals(-5.0, pengurangan(5, 10), 0.01, "5 - 10 should be -5");
        assertEquals(0.5, pengurangan(10.5, 10), 0.01, "10.5 - 10 should be 0.5");
        assertEquals(-15.0, pengurangan(-10, 5), 0.01, "-10 - 5 should be -15");
        assertEquals(-5.0, pengurangan(-10, -5), 0.01, "-10 - (-5) should be -5");
        assertEquals(100.0, pengurangan(0, -100), 0.01, "0 - (-100) should be 100");

        // ===== TEST FUNGSI PERKALIAN =====
        System.out.println("Testing Perkalian...");
        assertEquals(25.0, perkalian(5, 5), 0.01, "5 * 5 should be 25");
        assertEquals(0.0, perkalian(0, 100), 0.01, "0 * 100 should be 0");
        assertEquals(0.0, perkalian(100, 0), 0.01, "100 * 0 should be 0");
        assertEquals(50.0, perkalian(10, 5), 0.01, "10 * 5 should be 50");
        assertEquals(-50.0, perkalian(-10, 5), 0.01, "-10 * 5 should be -50");
        assertEquals(50.0, perkalian(-10, -5), 0.01, "-10 * (-5) should be 50");
        assertEquals(12.5, perkalian(2.5, 5), 0.01, "2.5 * 5 should be 12.5");
        assertEquals(1000000.0, perkalian(1000, 1000), 0.01, "1000 * 1000 should be 1000000");

        // ===== TEST FUNGSI PEMBAGIAN =====
        System.out.println("Testing Pembagian...");
        assertEquals(1.0, pembagian(5, 5), 0.01, "5 / 5 should be 1");
        assertEquals(2.0, pembagian(10, 5), 0.01, "10 / 5 should be 2");
        assertEquals(0.5, pembagian(5, 10), 0.01, "5 / 10 should be 0.5");
        assertEquals(2.5, pembagian(10, 4), 0.01, "10 / 4 should be 2.5");
        assertEquals(-2.0, pembagian(-10, 5), 0.01, "-10 / 5 should be -2");
        assertEquals(2.0, pembagian(-10, -5), 0.01, "-10 / (-5) should be 2");
        assertEquals(0.0, pembagian(0, 10), 0.01, "0 / 10 should be 0");
        assertEquals(100.0, pembagian(1000, 10), 0.01, "1000 / 10 should be 100");

        // ===== TEST PEMBAGIAN DENGAN NOL =====
        System.out.println("Testing Pembagian dengan Nol...");
        assertTrue(Double.isInfinite(pembagian(10, 0)), "10 / 0 should be Infinity");
        assertTrue(Double.isInfinite(pembagian(-10, 0)), "-10 / 0 should be -Infinity");
        assertTrue(Double.isNaN(pembagian(0, 0)), "0 / 0 should be NaN");

        // ===== TEST VALIDASI MENU =====
        System.out.println("Testing Menu Validation...");
        assertTrue(isValidMenu(1), "Menu 1 should be valid");
        assertTrue(isValidMenu(2), "Menu 2 should be valid");
        assertTrue(isValidMenu(3), "Menu 3 should be valid");
        assertTrue(isValidMenu(4), "Menu 4 should be valid");
        assertTrue(isValidMenu(5), "Menu 5 should be valid");
        assertFalse(isValidMenu(0), "Menu 0 should be invalid");
        assertFalse(isValidMenu(6), "Menu 6 should be invalid");
        assertFalse(isValidMenu(-1), "Menu -1 should be invalid");
        assertFalse(isValidMenu(100), "Menu 100 should be invalid");

        // ===== TEST VALIDASI Y/N =====
        System.out.println("Testing Y/N Validation...");
        assertTrue(isValidYesNo("y"), "Lowercase 'y' should be valid");
        assertTrue(isValidYesNo("n"), "Lowercase 'n' should be valid");
        assertTrue(isValidYesNo("Y"), "Uppercase 'Y' should be valid");
        assertTrue(isValidYesNo("N"), "Uppercase 'N' should be valid");
        assertTrue(isValidYesNo("  y  "), "'y' with spaces should be valid");
        assertFalse(isValidYesNo("yes"), "'yes' should be invalid");
        assertFalse(isValidYesNo("no"), "'no' should be invalid");
        assertFalse(isValidYesNo(""), "Empty string should be invalid");
        assertFalse(isValidYesNo("abc"), "Random string should be invalid");

        // ===== TEST EDGE CASES =====
        System.out.println("Testing Edge Cases...");

        // Test dengan angka sangat besar
        assertEquals(2000000.0, penjumlahan(1000000, 1000000), 0.01);
        assertEquals(1000000000000.0, perkalian(1000000, 1000000), 0.01);

        // Test dengan angka sangat kecil
        assertEquals(0.0002, penjumlahan(0.0001, 0.0001), 0.0001);
        assertEquals(0.000001, perkalian(0.001, 0.001), 0.000001);

        // Test presisi desimal
        assertEquals(0.3, penjumlahan(0.1, 0.2), 0.01);
        assertEquals(7.77, perkalian(2.59, 3), 0.01);
        assertEquals(3.33, pembagian(10, 3), 0.01);

        // ===== TEST OPERASI KOMBINASI =====
        System.out.println("Testing Kombinasi Operasi...");

        // Test dengan nilai yang sama
        double testValue = 100.0;
        assertEquals(200.0, penjumlahan(testValue, testValue), 0.01);
        assertEquals(0.0, pengurangan(testValue, testValue), 0.01);
        assertEquals(10000.0, perkalian(testValue, testValue), 0.01);
        assertEquals(1.0, pembagian(testValue, testValue), 0.01);

        // Test operasi beruntun (chain)
        double hasil1 = penjumlahan(10, 5); // 15
        double hasil2 = perkalian(hasil1, 2); // 30
        double hasil3 = pengurangan(hasil2, 10); // 20
        double hasil4 = pembagian(hasil3, 4); // 5
        assertEquals(5.0, hasil4, 0.01, "Chain operations: (10+5)*2-10/4 should be 5");

        // Test komutativitas (a + b = b + a)
        assertEquals(penjumlahan(5, 10), penjumlahan(10, 5), 0.01, "Addition should be commutative");
        assertEquals(perkalian(5, 10), perkalian(10, 5), 0.01, "Multiplication should be commutative");

        // Test identitas
        assertEquals(100.0, penjumlahan(100, 0), 0.01, "Addition identity: n + 0 = n");
        assertEquals(100.0, perkalian(100, 1), 0.01, "Multiplication identity: n * 1 = n");
        assertEquals(100.0, pembagian(100, 1), 0.01, "Division identity: n / 1 = n");

        // ===== TEST OPERASI DENGAN NEGATIF =====
        System.out.println("Testing Operasi dengan Bilangan Negatif...");
        assertEquals(5.0, penjumlahan(10, -5), 0.01, "10 + (-5) = 5");
        assertEquals(15.0, pengurangan(10, -5), 0.01, "10 - (-5) = 15");
        assertEquals(-50.0, perkalian(10, -5), 0.01, "10 * (-5) = -50");
        assertEquals(-2.0, pembagian(10, -5), 0.01, "10 / (-5) = -2");

        // Dua negatif
        assertEquals(-15.0, penjumlahan(-10, -5), 0.01, "(-10) + (-5) = -15");
        assertEquals(-5.0, pengurangan(-10, -5), 0.01, "(-10) - (-5) = -5");
        assertEquals(50.0, perkalian(-10, -5), 0.01, "(-10) * (-5) = 50");
        assertEquals(2.0, pembagian(-10, -5), 0.01, "(-10) / (-5) = 2");

        // ===== TEST VALIDASI RANGE MENU =====
        System.out.println("Testing Menu Range...");
        assertTrue(isOperationMenu(1), "Menu 1 is operation");
        assertTrue(isOperationMenu(2), "Menu 2 is operation");
        assertTrue(isOperationMenu(3), "Menu 3 is operation");
        assertTrue(isOperationMenu(4), "Menu 4 is operation");
        assertFalse(isOperationMenu(5), "Menu 5 is exit, not operation");

        System.out.println("All tests passed! ✓");
    }

    // ===== HELPER METHODS =====

    public static boolean isValidMenu(int menu) {
        return menu >= 1 && menu <= 5;
    }

    public static boolean isOperationMenu(int menu) {
        return menu >= 1 && menu <= 4;
    }

    public static boolean isValidYesNo(String input) {
        String normalized = input.toLowerCase().trim();
        return normalized.equals("y") || normalized.equals("n");
    }

    // ===== FUNGSI KALKULATOR =====

    public static double penjumlahan(double angka1, double angka2) {
        return angka1 + angka2;
    }

    public static double pengurangan(double angka1, double angka2) {
        return angka1 - angka2;
    }

    public static double perkalian(double angka1, double angka2) {
        return angka1 * angka2;
    }

    public static double pembagian(double angka1, double angka2) {
        return angka1 / angka2;
    }
}
