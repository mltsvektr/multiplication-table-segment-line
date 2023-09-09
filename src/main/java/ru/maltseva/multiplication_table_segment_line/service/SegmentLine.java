package ru.maltseva.multiplication_table_segment_line.service;

import java.util.Scanner;

public class SegmentLine {
    public static void findLength() {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите х1: ");
        double x1 = console.nextInt();
        System.out.print("Введите у1: ");
        double y1 = console.nextInt();
        System.out.print("Введите х2: ");
        double x2 = console.nextInt();
        System.out.print("Введите у2: ");
        double y2 = console.nextInt();
        System.out.print("Длина отрезка равна: ");
        double result = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        ResultWriter.printResult(result);
    }
}
