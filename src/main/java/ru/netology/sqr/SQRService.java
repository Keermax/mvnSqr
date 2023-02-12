package ru.netology.sqr;

public class SQRService {
    public int calcRoot(int a, int b) {
        int result = 0;
        for (int i = 10; i <= 99; i++){
            if ((i * i >= a) && (i * i <= b)) {
                result = result + 1;
            }
        }
        return result;
    }
}
