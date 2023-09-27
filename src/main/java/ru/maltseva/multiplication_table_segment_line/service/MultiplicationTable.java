package ru.maltseva.multiplication_table_segment_line.service;

public class MultiplicationTable {
    public static void multiplyNumbers() {
        int result;
        StringBuilder resultString = new StringBuilder();
        for (int a = 1; a <= 10; a++) {
            for (int b = 2; b <= 5; b++) {
                result = a * b;
                String tempStr = a + "x" + b + "=" + result;
                resultString.insert(resultString.length(), tempStr);
                if (tempStr.length() == 5) {
                    resultString.insert(resultString.length(), "   ");
                } else if (tempStr.length() == 6) {
                    resultString.insert(resultString.length(), "  ");
                } else {
                    resultString.insert(resultString.length(), " ");
                }
            }
            resultString.insert(resultString.length(), "\n");
        }
        ResultWriter.printResult(resultString.toString());
    }
}
