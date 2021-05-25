import java.util.HashSet;
import java.util.Set;

public class Task8 {
    public static void main(String[] args) {
        String text ="abcabcabc";
        System.out.println(Substrings(text));
    }

    public static int Substrings(String text) {
        if (text == null || text.length() == 0) return 0;
        Set<String> stringSet = new HashSet<>();//Set хранит только уникальные значения, класс hashset реализует класс Set

        for (int right = 1; right <= text.length(); ++right)
        {
            for (int left = 0; left < right; ++left)
            {
                if (right - left <= 1) continue;
                String str = text.substring(left, right);
                if (isString(str)) {
                    stringSet.add(str);
                }
            }
        }

        return stringSet.size();
    }

    private static boolean isString(String str)
    {
        if (str.length() % 2 != 0) return false;

        if (str.substring(0, str.length()/2).equals(str.substring(str.length()/2, str.length())))
            return true;
        return false;
    }
}
