package com.basicExersice;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    public void modOp(){
        BigDecimal n = new BigDecimal("12.345");
        BigDecimal m = new BigDecimal("0.12");
        BigDecimal[] dr = n.divideAndRemainder(m);
        System.out.println(dr[0]); // 102
        System.out.println(dr[1]); // 0.105

        if (dr[1].signum() == 0) {
            // n是m的整数倍
        }
    }

    public void compare(){
        BigDecimal d1 = new BigDecimal("123.456");
        BigDecimal d2 = new BigDecimal("123.45600");
        System.out.println(d1.equals(d2)); // false,因为scale不同
        System.out.println(d1.equals(d2.stripTrailingZeros())); // true,因为d2去除尾部0后scale变为2
        System.out.println(d1.compareTo(d2)); // 0
    }

    public static void main(String[] args) {
        BigDecimalDemo BD = new BigDecimalDemo();
        BigDecimal bd = new BigDecimal("123.4567");
        System.out.println(bd);

        BigDecimal d1 = new BigDecimal("123.45");
        BigDecimal d2 = new BigDecimal("123.4500");
        BigDecimal d3 = new BigDecimal("1234500");
        System.out.println(d1.scale()); // 2,两位小数
        System.out.println(d2.scale()); // 4
        System.out.println(d3.scale()); // 0

        BigDecimal d4 = new BigDecimal("123.4500");
        BigDecimal d5 = d4.stripTrailingZeros();
        System.out.println(d4.scale()); // 4
        System.out.println(d5.scale()); // 2,因为去掉了00

        BigDecimal d6 = new BigDecimal("1234500");
        BigDecimal d7 = d6.stripTrailingZeros();
        System.out.println(d6.scale()); // 0
        System.out.println(d7.scale()); // -2

        //scale()设置精度
        BigDecimal d8 = new BigDecimal("123.446789");
        BigDecimal d9 = d8.setScale(4, RoundingMode.HALF_UP);
        BigDecimal d10 = d8.setScale(4, RoundingMode.DOWN);
        System.out.println(d9);
        System.out.println(d10);

        //对BigDecimal做加、减、乘时，精度不会丢失，但是做除法时，存在无法除尽的情况，这时，就必须指定精度以及如何进行截断：
        BigDecimal d11 = new BigDecimal("123.456");
        BigDecimal d12 = new BigDecimal("23.456789");
        BigDecimal d13 = d11.divide(d12, 10, RoundingMode.HALF_UP); // 保留10位小数并四舍五入
//        BigDecimal d14 = d11.divide(d12); // 报错：ArithmeticException，因为除不尽
        System.out.println(d13);

        BD.modOp();
        BD.compare();
    }
}
