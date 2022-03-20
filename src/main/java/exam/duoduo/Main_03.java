package exam.duoduo;

import java.util.Arrays;
import java.util.Scanner;

public class Main_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.nextLine();
        char[] chars_B = sc.nextLine().toCharArray();
        char[] chars_A = new char[chars_B.length];
        for (int i = 0; i < chars_B.length; i++) {
            chars_A[i] = '*';
        }
//        System.out.println(chars_A);
//        System.out.println(chars_B);
        for(int i=0;i<chars_B.length;i++) {
            if (chars_B[i] == '0') {
                if (i - k >= 0) {
                    chars_A[i - k] = '0';
                }
                if (i + k < chars_B.length) {
                    chars_A[i + k] = '0';
                }
            } else if (i - k < 0 && i + k < chars_B.length) {
                chars_A[i + k] = '1';
            } else if (i + k >= chars_B.length && i - k >= 0) {
                chars_A[i - k] = '1';
            }
        }
        for(int i =0;i<chars_A.length;i++){
            if(chars_A[i] == '*' && i+2*k<chars_A.length && chars_A[i+2*k] == '*'){
                chars_A[i] = '0';
                chars_A[i+2*k] = '1';
            }
            else if(chars_A[i] == '*'){
                chars_A[i] = '1';
            }
        }
        for (int i = 0; i < chars_A.length; i++) {
            System.out.println(chars_A[i]);
        }
    }
}
