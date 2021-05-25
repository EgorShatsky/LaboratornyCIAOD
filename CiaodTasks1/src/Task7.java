public class Task7 {
    public static void main(String[] args) {
        String string1="babad";
        subStr(string1);

    }
    static void printStr(String string1, int l, int h) {
        System.out.println(string1.substring(l, h + 1));
    }
    static int subStr(String string1) {
        int n = string1.length();
        boolean table[][] = new boolean[n][n];
        int mLength = 1;
        for (int i = 0; i < n; ++i)
            table[i][i] = true;
        int strt = 0;
        for (int i = 0; i < n - 1; ++i) {
            if (string1.charAt(i) == string1.charAt(i + 1)) {
                table[i][i + 1] = true;
                strt = i;
                mLength = 2;
            }
        }
        for (int k = 3; k <= n; ++k) {
            for (int i = 0; i < n - k + 1; ++i) {
                int j = i + k - 1;
                if (table[i + 1][j - 1] && string1.charAt(i) == string1.charAt(j)) {
                    table[i][j] = true;
                    if (k > mLength) {
                        strt = i;
                        mLength = k;
                    }
                }
            }
        }
        System.out.print("Наибольшая строка полиндром в исходной строке: ");
        printStr(string1, strt, strt + mLength - 1);
        return mLength;
    }
}
