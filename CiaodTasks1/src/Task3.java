import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        //int n=5;//кол-во строк
        //int m=4;//кол-во строк
        int [][]mat={{11, 25, 66, 1, 69, 7}, {23, 55, 17, 45, 15, 52}, {75, 31, 36,
                44, 58, 8}, {22, 27, 33, 25, 68, 4}, {84, 28, 14, 11, 5, 50}};// двумерный массив
        ;

        int n=mat.length;//кол-во строк
        int m=mat[0].length;//кол-во строк

        for (int i=0;i < mat.length;i++,System.out.println()) {// вывод исходной матрицы
            System.out.print("\n");
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + "\t");
            }
        }

        Task3 f = new Task3();
        int[][] rez = f.Mat(mat,n,m);
        System.out.println("===========================================================================");
        for (int i=0;i<mat.length;i++){
            System.out.print("\n");
            for (int j=0;j<mat[0].length;j++){
                System.out.print(rez[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static int[][] Mat(int[][] mat,int n,int m){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sort(mat,i,j);
            }
        }
        return mat;
    }

    public static void sort(int [][] mat, int i, int j){
        if (i==0 || j==0){} else{
            if(mat[i][j]<mat[i-1][j-1]){
                int k = mat[i][j];
                mat[i][j]=mat[i-1][j-1];
                mat[i-1][j-1]=k;
            }
            sort(mat,i-1,j-1);
        }
    }
}
