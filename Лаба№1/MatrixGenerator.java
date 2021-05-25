import java.util.Arrays;
import java.util.Scanner;

public class MatrixGenerator {
    public static void main(String[] args) {
        int mas[][]=matrixGenerator();
        System.out.println(Arrays.deepToString(mas));
        System.out.println(Arrays.deepToString(selectionSort(mas)));
        System.out.println(Arrays.deepToString(insertionSort(mas)));
        System.out.println(Arrays.deepToString(bubbleSort(mas)));
        System.out.println(Arrays.deepToString(shellSort(mas)));
    }
    public static int[][] matrixGenerator(){
        Scanner in = new Scanner(System.in);

        System.out.print("Введите количество строк матрицы (n): ");
        int n = in.nextInt();
        System.out.print("Введите количество столбцов матрицы (m): ");
        int m = in.nextInt();
        System.out.print("Введите минимальное значение генерируемого числа (min_limit): ");
        int min_limit = in.nextInt();
        System.out.print("Введите максимальное значение генерируемого числа (max_limit): ");
        int max_limit = in.nextInt();

        in.close();

        int[][] a = new int[n][m]; //Создание массива a размером n*m

        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                a[i][j] = min_limit + (int) (Math.random() * max_limit); // Cгенерируем число от min_limit до max_limit

            }
        }
        return a;
    }


    public static int[][] selectionSort(int mas[][]){ //Сортировка выбором
        for (int i=0;i< mas.length;i++){ // проходим по строкам
            for (int step=0;step<mas[0].length;step++){// номер текущего шага, mas[0].length - кол-во столбцов
                int pos=step;// присваиваем номер текущего шага
                int tmp=mas[i][pos];// присваиваем элемент массива на текущем шаге
                for (int j=step+1;j<mas[0].length;j++){// цикл поиска минимального элемента в строке
                    if (mas[i][j]<tmp){
                        pos=j; // pos присваивается интдекс минималнього элемента
                        tmp=mas[i][j]; // переприсваиваем минимальный элемент
                    }
                }
                mas[i][pos]=mas[i][step]; // минимальному элементу присваиваем текущий
                mas[i][step]=tmp; // темкущему элементу присваиваем минимальный
            }
        }
        return mas;
    }

    public static int[][] insertionSort(int mas[][]){ //сортировка вставкой
        for (int i=0;i<mas.length;i++){
            for (int step=1;step<mas[0].length;step++){
                int j=step;
                while(j>0&&mas[i][j-1]>mas[i][j]){
                    int tmp=mas[i][j-1];
                    mas[i][j-1]=mas[i][j];
                    mas[i][j]=tmp;
                    j--;
                }
            }
        }
        return mas;
    }

    public static int[][] bubbleSort(int mas[][]){ // сортировка пузырьком
        for (int i=0;i<mas.length;i++){
            for (int k=0;k<mas.length;k++){
                for (int j=0;j<mas[0].length-1;j++){
                    if (mas[k][j]>mas[k][j+1]){
                        int tmp=mas[k][j];
                        mas[k][j]=mas[k][j+1];
                        mas[k][j+1]=tmp;
                    }
                }
            }
        }
        return mas;
    }

    public static int[][] shellSort(int mas[][]){ //сортировка Шелла
        for (int k=0;k< mas.length;k++){
            int j;
            int step= mas.length/2;
            while (step>0){
                for(int i=0;i< mas[0].length-step;i++){
                    j=i;
                    while ((j>=0)&&(mas[k][j]>mas[k][j+step])){
                        int tmp=mas[k][j];
                        mas[k][j]=mas[k][j+step];
                        mas[k][j+step]=tmp;
                        j=j-step;
                    }
                }
                step=step/2;
            }
        }
        return mas;
    }

}
