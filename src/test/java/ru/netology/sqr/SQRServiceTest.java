package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class SQRServiceTest {
    @Test
    void shouldCalculateForExceedingMinimumMeaning() {
        SQRService service = new SQRService();
        int expected = 0;
        int minNumber = 20;
        int maxNumber = 80;
        int actual = service.calсulateSQR(minNumber, maxNumber);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculate() {
        SQRService service = new SQRService();
        int expected = 10;
        int minNumber = 150;
        int maxNumber = 500;
        int actual = service.calсulateSQR(minNumber, maxNumber);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForExceedingMaximumMeaning() {
        SQRService service = new SQRService();
        int expected = 90;
        int minNumber = 100;
        int maxNumber = 10000;
        int actual = service.calсulateSQR(minNumber, maxNumber);

        assertEquals(expected, actual);
    }
}
