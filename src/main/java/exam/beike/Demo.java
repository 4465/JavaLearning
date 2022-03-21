package exam.beike;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[3];
        for (int i = 0; i < T; i++) {
            String s = sc.nextLine().trim();

            for (int j = 0; j < 3; j++) {
                arr[j] = sc.nextInt();
            }
            System.out.println(s);
            System.out.println(Arrays.toString(arr));
        }


        while (sc.hasNext()){

        }
    }
}
