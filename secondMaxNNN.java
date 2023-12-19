public static int findSecondLargest(int[][][] arr) {
    int N = arr.length;
    int max = Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;

    // Проходим по всем элементам диагоналей и находим максимальное и второе максимальное значения
    for (int i = 0; i < N; i++) {
        int val1 = arr[i][i][i]; // главная диагональ
        int val2 = arr[i][i][N-i-1]; // побочная диагональ
        int val3 = arr[i][N-i-1][i]; // диагональ xz
        int val4 = arr[N-i-1][i][i]; // диагональ yz

        if (val1 > max) {
            secondMax = max;
            max = val1;
        } else if (val1 > secondMax && val1 != max) {
            secondMax = val1;
        }

        if (val2 > max) {
            secondMax = max;
            max = val2;
        } else if (val2 > secondMax && val2 != max) {
            secondMax = val2;
        }

        if (val3 > max) {
            secondMax = max;
            max = val3;
        } else if (val3 > secondMax && val3 != max) {
            secondMax = val3;
        }

        if (val4 > max) {
            secondMax = max;
            max = val4;
        } else if (val4 > secondMax && val4 != max) {
            secondMax = val4;
        }
    }
    
    return secondMax;
}