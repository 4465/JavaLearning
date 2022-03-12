package com.basicExersice.javaIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamDemo {


    public void readFile() throws IOException {
        InputStream input = new FileInputStream("src/main/java/com/basicExersice/javaIO/temp/tmp.txt");
        for(;;){
            int n = input.read();
            if(n==-1){
                break;
            }
            System.out.println(n);
        }
        input.close();
    }
}
