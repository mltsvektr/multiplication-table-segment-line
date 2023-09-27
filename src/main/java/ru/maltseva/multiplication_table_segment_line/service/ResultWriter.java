package ru.maltseva.multiplication_table_segment_line.service;

public class ResultWriter {
    public static void printResult(String str) {
        System.out.println(str);
    }

    public static void printResult(double result) {
        System.out.printf("%.3f", result);
    }
}
