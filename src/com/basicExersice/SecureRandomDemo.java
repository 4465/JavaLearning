package com.basicExersice;

import java.security.SecureRandom;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class SecureRandomDemo {
    public static void main(String[] args) {
        SecureRandom r =new SecureRandom();
        System.out.println(r.nextInt(100));
        SecureRandom sr = null;
        try {
            sr = SecureRandom.getInstanceStrong(); // 获取高强度安全随机数生成器
        } catch (NoSuchAlgorithmException e) {
            sr = new SecureRandom(); // 获取普通的安全随机数生成器
        }
        byte[] buffer = new byte[16];
        sr.nextBytes(buffer); // 用安全随机数填充buffer
        System.out.println(Arrays.toString(buffer));
    }
}
