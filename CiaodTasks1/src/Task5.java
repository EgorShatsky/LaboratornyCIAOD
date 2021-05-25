import java.util.Arrays;
public class Task5 {
    public static void main(String[] args) {
       int []piles= {9,8,7,6,5,1,2,3,4};
       System.out.println(Arrays.toString(piles));
       System.out.println(maxCoins(piles));

    }
    public static int maxCoins(int[] piles){
        Arrays.sort(piles);//сортировка массива в порядке возрастания
        int sum = 0;// моя сумма монет
        int i =piles.length - 2;// индекс стопки монет, максимальной после того как взяла Алиса
        int j = 0;
        while(j++ < piles.length / 3){
            sum += piles[i];
            i -=2;
        }
        return sum;
    }
}
