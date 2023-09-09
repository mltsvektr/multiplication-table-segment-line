package ru.maltseva.multiplication_table_segment_line.service;

public class MultiplicationTable {
    public static void multiplyNumbers() {
        int result;
        for (int a = 1; a <= 10; a++) {
            for (int b = 2; b <= 5; b++) {
                result = a * b;
                ResultWriter.printResult(b, a, result);
            }
            System.out.println();
        }
    }
}
