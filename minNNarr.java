import java.util.Scanner;
import java.util.Random;

public class minNNarr {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите N: ");
        int N = scanner.nextInt();
        int[][] arr = new int[N][N];
        Random random = new Random();
        for (int i = 0; i < N; i++) 
        {
            for (int j = 0; j < N; j++) 
            {
                arr[i][j] = random.nextInt(100); 
            }
        }
        int min = 0;
        boolean flag = false;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[i][j] + "\t");
                if((j == N - i - 1) && i != j) 
                {
                    if(!flag)
                    {
                        min = arr[i][j];
                        flag = true;
                    } 
                    if (arr[i][j]<min)
                    {
                        min = arr[i][j];
                    }
                }
            }
            System.out.println();
        }
        System.out.println("min=" + min);
    }
}
