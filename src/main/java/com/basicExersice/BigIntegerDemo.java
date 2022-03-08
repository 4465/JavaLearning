package com.basicExersice;

import java.math.BigInteger;

public class BigIntegerDemo {
    public static void main(String[] args) {
        BigInteger bi = new BigInteger("1234567890");
        System.out.println(bi.pow(5));

        BigInteger i1 = new BigInteger("1235678901");
        BigInteger i2 = new BigInteger("1235678901558648799");
        BigInteger sum = i1.add(i2);
        System.out.println(sum);

        BigInteger i = new BigInteger("12345678900011118899794497546487484949647978554841");
        System.out.println(i.longValue());
//        System.out.println(i.longValueExact());

        BigInteger n = new BigInteger("999999").pow(99);
        float f = n.floatValue();
        System.out.println(f);
    }
}
