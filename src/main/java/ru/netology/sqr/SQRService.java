package ru.netology.sqr;

public class SQRService {
    public int calсulateSQR(int minNumber, int maxNumber) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if ((i * i >= minNumber) && (i * i <= maxNumber)) {
                count++;
            }
        }

        return count;
    }
}

