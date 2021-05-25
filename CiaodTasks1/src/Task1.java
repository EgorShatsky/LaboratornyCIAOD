public class Task1 {
    public static void main(String[] args) {
        int[] mas = {1, 2, 1};
        System.out.println("Треугольник с максимальным периметром - " + maxP(mas));
    }
    public static int maxP(int[]mas){
        for(int i = mas.length-1 ; i > 0 ; i--){// сортируем массив для того, чтобы найти 3 максимальных стороны
            for(int j = 0 ; j < i ; j++) {
                if (mas[j] > mas[j + 1]) {
                    int tmp = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = tmp;
                }
            }
        }
        for (int i=0;i<mas.length/2;i++){//переворачиваю массив, чтобы максимальные элементы шли с самого начала
            int tmp=mas[i];
            mas[i]=mas[mas.length-i-1];
            mas[mas.length-i-1]=tmp;
        }
        int P=0;
        for (int i=0;i<mas.length-2;i++){// Основной блок для поиска максимального периметра тругольника
            int a=mas[i];
            int b=mas[i+1];
            int c=mas[i+2];
            if ((a<b+c)&(b<a+c)&(c<a+b)){
                P=a+b+c;
            }
            if (P>0){// Если найден первый периметр, то цикл прерывается
                break;
            }
        }
        return P;
    }
}




