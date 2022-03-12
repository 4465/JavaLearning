package com.basicExersice.javaIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;

public class ReaderDemo {
    public static void main(String[] args) throws IOException {
        //创建一个Reader对象
        Reader reader = new FileReader("src/main/java/com/basicExersice/javaIO/temp/tmp.txt", StandardCharsets.UTF_8);
        for(;;){
            int n = reader.read();
            if(n==-1){
                break;
            }
            System.out.println((char)n );
        }
        reader.close();
    }
}
