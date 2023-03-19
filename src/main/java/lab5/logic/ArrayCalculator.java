package lab5.logic;

public class ArrayCalculator implements ArrayProcessor {
    @Override
    public double calculate(double[] array) {
        double result = 1;
        for (double v : array) {
            result *= v;
        }
        return result;
    }

    @Override
    public double calculate(double[][] array) {
        double max = array[array.length - 1][array.length - 1];
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length-1-i; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    @Override
    public void processArray(double[] array) {

    }

    @Override
    public void processArray(double[][] array) {

    }
}
