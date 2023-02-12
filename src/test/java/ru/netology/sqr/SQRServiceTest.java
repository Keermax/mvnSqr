package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/info.csv")
    public void testSqrt(int expected, int a, int b) {
        SQRService service = new SQRService();

        int actual = service.calcRoot(a, b);

        Assertions.assertEquals(expected, actual);
    }
}
