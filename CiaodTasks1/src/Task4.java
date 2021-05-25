import java.util.Arrays;
import java.util.Comparator;
public class Task4 {
    public static void main(String[] args) {
        int[][] points = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        System.out.println(findMinArrowShots(points));
    }

    public static int findMinArrowShots(int[][] points) {

        for (int i=0;i<points.length;i++){
            if (points[i][0]>points[i][1]){
                return 0;
            }
        }

        Arrays.sort(points, Comparator.comparingInt(a -> a[1]));  // Сортируем массив по второму значению
        System.out.println("Массив отсортирован: " + Arrays.deepToString(points));
        int arrow = 1; // Кол-во стрел
        int end = points[0][1]; // Первый шарик
        for (int i = 1; i < points.length; i++) {
            if (end < points[i][0]) { // Если шарик оказался дальше по координате xEnd
                arrow++; // увеличиваем количество стрел
                end = points[i][1]; // Перемещаем конечную точку на этот шар
            }
        }
        return arrow;
    }
}
