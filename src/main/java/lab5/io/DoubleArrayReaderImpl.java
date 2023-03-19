package lab5.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DoubleArrayReaderImpl implements DoubleArrayReader {
    @Override
    public double[] readOneDimensionalArray(File file) {
        try(Scanner scanner = new Scanner(file)) {
            int N = scanner.nextInt();
            double[] a = new double[N];
            for (int i = 0; i < N; i++) {
                a[i] = scanner.nextDouble();
            }
            return a;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public double[] readOneDimensionalArray(String fileName) {
        return readOneDimensionalArray(new File(fileName));
    }

    @Override
    public double[][] readTwoDimensionalArray(File file) {
        try (Scanner scanner = new Scanner(file)) {
            int N = scanner.nextInt();
            double[][] a = new double[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    a[i][j] = scanner.nextDouble();
                }
            }
            return a;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public double[][] readTwoDimensionalArray(String fileName) {
        return readTwoDimensionalArray(new File(fileName));
    }
}
