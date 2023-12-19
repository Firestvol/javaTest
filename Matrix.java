import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int N; // размерность матрицы
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите N: ");
        N = scanner.nextInt();
        // создаем и заполняем матрицу
        int[][] matrix = new int[N][N];

        int mid = N / 2; // индекс середины матрицы
        
        int value = N / 2 - 1; // начальное значение
        int count = 1; // счетчик для последовательно уменьшающихся значений

        
        
        // заполняем значениями
        for (int i = 0; i < mid; i++) {
            for (int j = i; j < N - i; j++) {
                matrix[i][j] = value;
                matrix[j][i] = value;
                matrix[N - i - 1][j] = value;
                matrix[j][N - i - 1] = value;
            }
            count++;
            value = N / 2  - count;
        }

// заполняем центр матрицы нулями
        for (int i = mid - 1; i <= mid; i++) {
            for (int j = mid - 1; j <= mid; j++) {
                matrix[i][j] = 0;
            }
        }

        // выводим матрицу
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}