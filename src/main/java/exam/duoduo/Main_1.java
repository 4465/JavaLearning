package exam.duoduo;

import java.util.Arrays;
import java.util.Scanner;

public class Main_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String strInput = sc.nextLine();
            int n = Integer.parseInt(strInput);
            strInput = sc.nextLine().trim();
            String[] suba = strInput.split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(suba[i]);
            }
            Arrays.sort(a);

            strInput = sc.nextLine();

            String[] subb = strInput.split(" ");
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = Integer.parseInt(subb[i]);
            }
            Arrays.sort(b);
            long ans = 0;
            for (int i = 0; i < n; i++) {
                ans += Math.pow(a[i] - b[i], 2);
            }
            System.out.println(ans);
        }
    }
}
