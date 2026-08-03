import java.util.*;
public class DiagonalSum {
    static void diagonalSum(int mat[][], int n) {
        int primary = 0;
        int secondary = 0;
        for (int i = 0; i < n; i++) {
            primary += mat[i][i];
            secondary += mat[i][n - i - 1];
        }
        System.out.println("Primary = " + primary);
        System.out.println("Secondary = " + secondary);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mat[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        diagonalSum(mat, n);
    }
}

