import java.util.*;

class Solution {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int r = a;
            for (int j = 0; j < n; j++) {
                int k = (int) Math.pow(2, j) * b;
                r = r + k;
                System.out.print(r + " ");
            }
            System.out.println();
        }
        in.close();
    }
}