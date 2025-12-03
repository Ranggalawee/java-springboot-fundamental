package com.training.javafundamental;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AplikasiKonversiSuhuTest {

    @Test
    public void testAllLogic() {
        // ===== TEST FUNGSI KONVERSI =====
        System.out.println("Testing Celcius to Fahrenheit...");
        assertEquals(32.0, celciusToFahrenheit(0), 0.01, "0°C should be 32°F");
        assertEquals(212.0, celciusToFahrenheit(100), 0.01, "100°C should be 212°F");
        assertEquals(98.6, celciusToFahrenheit(37), 0.01, "37°C should be 98.6°F");
        assertEquals(-40.0, celciusToFahrenheit(-40), 0.01, "-40°C should be -40°F");

        System.out.println("Testing Fahrenheit to Celcius...");
        assertEquals(0.0, fahrenheitToCelcius(32), 0.01, "32°F should be 0°C");
        assertEquals(100.0, fahrenheitToCelcius(212), 0.01, "212°F should be 100°C");
        assertEquals(37.0, fahrenheitToCelcius(98.6), 0.01, "98.6°F should be 37°C");
        assertEquals(-40.0, fahrenheitToCelcius(-40), 0.01, "-40°F should be -40°C");

        System.out.println("Testing Celcius to Kelvin...");
        assertEquals(273.15, celciusToKelvin(0), 0.01, "0°C should be 273.15K");
        assertEquals(373.15, celciusToKelvin(100), 0.01, "100°C should be 373.15K");
        assertEquals(298.15, celciusToKelvin(25), 0.01, "25°C should be 298.15K");
        assertEquals(0.0, celciusToKelvin(-273.15), 0.01, "-273.15°C should be 0K (absolute zero)");

        System.out.println("Testing Kelvin to Celcius...");
        assertEquals(0.0, kelvinToCelcius(273.15), 0.01, "273.15K should be 0°C");
        assertEquals(100.0, kelvinToCelcius(373.15), 0.01, "373.15K should be 100°C");
        assertEquals(25.0, kelvinToCelcius(298.15), 0.01, "298.15K should be 25°C");
        assertEquals(-273.15, kelvinToCelcius(0), 0.01, "0K should be -273.15°C");

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

        // ===== TEST EDGE CASES =====
        System.out.println("Testing Edge Cases...");

        // Test nilai negatif
        assertEquals(-459.67, celciusToFahrenheit(-273.15), 0.01, "Absolute zero in Fahrenheit");

        // Test nilai sangat besar
        assertEquals(1832.0, celciusToFahrenheit(1000), 0.01, "1000°C should be 1832°F");
        assertEquals(1273.15, celciusToKelvin(1000), 0.01, "1000°C should be 1273.15K");

        // Test presisi desimal
        double result1 = celciusToFahrenheit(37.7777);
        assertTrue(result1 > 99.99 && result1 < 100.01, "37.7777°C should be approximately 100°F");

        double result2 = fahrenheitToCelcius(98.6);
        assertTrue(result2 > 36.99 && result2 < 37.01, "98.6°F should be approximately 37°C");

        // Test konversi bolak-balik (round trip)
        double original = 25.5;
        double converted = celciusToFahrenheit(original);
        double backToOriginal = fahrenheitToCelcius(converted);
        assertEquals(original, backToOriginal, 0.01, "Round trip conversion should return to original value");

        // Test konversi Celcius-Kelvin bolak-balik
        double temp = 100.0;
        double toKelvin = celciusToKelvin(temp);
        double backToCelcius = kelvinToCelcius(toKelvin);
        assertEquals(temp, backToCelcius, 0.01, "Celcius-Kelvin round trip should be accurate");

        // ===== TEST VALIDASI STRING Y/N =====
        System.out.println("Testing Y/N Validation...");
        assertTrue(isValidYesNo("y"), "Lowercase 'y' should be valid");
        assertTrue(isValidYesNo("n"), "Lowercase 'n' should be valid");
        assertTrue(isValidYesNo("Y"), "Uppercase 'Y' should be valid (after toLowerCase)");
        assertTrue(isValidYesNo("N"), "Uppercase 'N' should be valid (after toLowerCase)");
        assertFalse(isValidYesNo("yes"), "'yes' should be invalid");
        assertFalse(isValidYesNo("no"), "'no' should be invalid");
        assertFalse(isValidYesNo("maybe"), "'maybe' should be invalid");
        assertFalse(isValidYesNo(""), "Empty string should be invalid");
        assertFalse(isValidYesNo("abc"), "Random string should be invalid");

        // ===== TEST KOMBINASI =====
        System.out.println("Testing Combinations...");

        // Test semua menu dengan input yang sama
        double testValue = 100.0;
        assertEquals(212.0, celciusToFahrenheit(testValue), 0.01);
        assertEquals(37.78, fahrenheitToCelcius(testValue), 0.01);
        assertEquals(373.15, celciusToKelvin(testValue), 0.01);
        assertEquals(-173.15, kelvinToCelcius(testValue), 0.01);

        // Test semua fungsi dengan 0
        assertEquals(32.0, celciusToFahrenheit(0), 0.01);
        assertEquals(-17.78, fahrenheitToCelcius(0), 0.01);
        assertEquals(273.15, celciusToKelvin(0), 0.01);
        assertEquals(-273.15, kelvinToCelcius(0), 0.01);

        System.out.println("All tests passed! ✓");
    }

    // ===== HELPER METHODS =====

    public static boolean isValidMenu(int menu) {
        return menu >= 1 && menu <= 5;
    }

    public static boolean isValidYesNo(String input) {
        String normalized = input.toLowerCase().trim();
        return normalized.equals("y") || normalized.equals("n");
    }

    // ===== FUNGSI KONVERSI =====

    public static double celciusToFahrenheit(double angka) {
        double result = (angka * 9.0/5.0) + 32;
        return Math.round(result * 100.0) / 100.0;
    }

    public static double fahrenheitToCelcius(double angka) {
        double result = (angka - 32) * 5.0/9.0;
        return Math.round(result * 100.0) / 100.0;
    }

    public static double celciusToKelvin(double angka) {
        double result = angka + 273.15;
        return Math.round(result * 100.0) / 100.0;
    }

    public static double kelvinToCelcius(double angka) {
        double result = angka - 273.15;
        return Math.round(result * 100.0) / 100.0;
    }
}
