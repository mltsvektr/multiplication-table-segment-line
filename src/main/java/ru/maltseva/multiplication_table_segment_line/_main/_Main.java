package ru.maltseva.multiplication_table_segment_line._main;

import ru.maltseva.multiplication_table_segment_line.service.MultiplicationTable;
import ru.maltseva.multiplication_table_segment_line.service.SegmentLine;

public class _Main {
    public static void main(String[] args) {
        System.out.println("Задание 1. Таблица умножения от 2 до 5:");
        MultiplicationTable.multiplyNumbers();
        System.out.println("Задание 2. Длина отрезка АВ:");
        SegmentLine.findLength();
    }
}
