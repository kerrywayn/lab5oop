package main;

import lab5.io.DoubleArrayReader;
import lab5.io.DoubleArrayReaderImpl;
import lab5.logic.ArrayCalculator;
import lab5.logic.ArrayProcessor;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {
        DoubleArrayReader reader = new DoubleArrayReaderImpl();
        double[] doubles = reader.readOneDimensionalArray("lab51.txt");
        ArrayProcessor processor = new ArrayCalculator();
        double calculate = processor.calculate(doubles);
        System.out.println("Добуток елементів масивів = " + calculate);
        double[][] array = reader.readTwoDimensionalArray("lab52.txt");
        double res = processor.calculate(array);
        System.out.println("Максимум заштрихованої частини = " + res);

    }
}
