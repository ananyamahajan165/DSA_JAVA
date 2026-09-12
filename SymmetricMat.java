import java.util.*;

public class SymmetricMat{
    static boolean isSymmetric(int mat[][],int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]!=mat[j][i])
                    return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mat[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        if(isSymmetric(mat,n))
            System.out.println("Symmetric");
        else
            System.out.println("Not Symmetric");
    }
}

