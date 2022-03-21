package exam.beike;

import java.util.*;
public class Main_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        char[] chs = str.toCharArray();
        Map<Character, Integer>map = new HashMap<>();
        long value = 0;

        for (int i = 0; i < chs.length; i++) {
            if(map.containsKey(chs[i])){
                value++;
                map.remove(chs[i]);
            }else {
                map.put(chs[i], 1);
            }
        }
        value =  map.size();
        System.out.println(value);
    }
}
