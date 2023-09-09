package ru.maltseva.multiplication_table_segment_line.service;

public class ResultWriter {
    public static void printResult(int a, int b, int result) {
        String output = a + "x" + b + "=" + result;
        if (output.length() == 5) {
            System.out.print(output + "   ");
        } else if (output.length() == 6) {
            System.out.print(output + "  ");
        } else {
            System.out.print(output + " ");
        }
    }
    public static void printResult(double result) {
        System.out.printf("%.3f", result);
    }
}
