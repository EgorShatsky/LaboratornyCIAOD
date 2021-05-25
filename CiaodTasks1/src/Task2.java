public class Task2 {
    public static void main(String[] args) {
        int [] nums={3,30,34,5,9};
        System.out.println(maxNum(nums));
    }
    public static String maxNum(int[] nums){
        String str = "";
        int k;
        for (int i = 0; i < nums.length; i++){
            for (int j = 1; j < nums.length-i; j++) {
                String x = Integer.toString(nums[j-1])+Integer.toString(nums[j]);//Преобразование int в String
                String y = Integer.toString(nums[j])+Integer.toString(nums[j-1]);//Преобразование int в String
                if (x.compareTo(y)<0) { //compareTo сравнивает две строки в лексографическом порядке
                    k=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=k;
                }
            }
        }
        for (int i:nums) {//Это цикл по массиву nums, где на каждой итерации очередной элемент копируется в переменную i
            str+=Integer.toString(i);
        }
        return str;
    }
}
