package com.basicExersice.javaIO;


import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * File对象
 */
public class FileDemo {
    public static void main(String[] args) throws IOException {
        File f= new File("src/main/java/com/basicExersice/BigDecimalDemo.java");
        System.out.println(f.getClass().getName());
        System.out.println(f);
        //返回构造方法传入的路径
        System.out.println(f.getPath());
        //返回绝对路径
        System.out.println(f.getAbsolutePath());
        //和绝对路径类似，返回的是规范路径
        System.out.println(f.getCanonicalPath());
        //表示当前平台的系统分隔符
        System.out.println(File.separator);
        System.out.println("=================================");

        File f1 = new File("src/test");
        File f2 = new File("src/test/java");
        File f3 = new File("pom.xml");
        System.out.println(f1.isFile());
        System.out.println(f1.isDirectory());
        System.out.println(f2.isFile());
        System.out.println(f2.isDirectory());
        System.out.println(f3.isFile());
        System.out.println(f3.isDirectory());
        System.out.println("=================================");


        //创建文件
        File f4 = new  File("src/main/java/com/basicExersice/javaIO/temp/tmp.txt"); // 提供临时文件的前缀和后缀
        f4.createNewFile();
//        f4.deleteOnExit(); // JVM退出时自动删除
        System.out.println(f4.isFile());
        System.out.println(f4.getAbsolutePath());
        System.out.println("=================================");


        //遍历文件和目录
        /**
         * boolean mkdir()：创建当前File对象表示的目录；
         * boolean mkdirs()：创建当前File对象表示的目录，并在必要时将不存在的父目录也创建出来；
         * boolean delete()：删除当前File对象表示的目录，当前目录必须为空才能删除成功。
         */
        File f5 = new File("src/main/java/com/basicExersice/jdbcExercise");
        File[] fs1 = f5.listFiles(); // 列出所有文件和子目录
        printFiles(fs1);
        System.out.println("######################");
        File[] fs2 = f5.listFiles(new FilenameFilter() { // 仅列出.exe文件
            public boolean accept(File dir, String name) {
                return name.endsWith(".java"); // 返回true表示接受该文件
            }
        });
        printFiles(fs2);

        System.out.println("==================================");
        Path p1 = Paths.get(".", "javaIO"); // 构造一个Path对象
        System.out.println(p1);
        Path p2 = p1.toAbsolutePath(); // 转换为绝对路径
        System.out.println(p2);
        Path p3 = p2.normalize(); // 转换为规范路径
        System.out.println(p3);
        File f6 = p3.toFile(); // 转换为File对象
        System.out.println(f6);
        for (Path p : Paths.get("..").toAbsolutePath()) { // 可以直接遍历Path
            System.out.println("  " + p);
        }

    }

    static void printFiles(File[] files) {
        System.out.println("==========");
        if (files != null) {
            for (File f : files) {
                System.out.println(f);
            }
        }
        System.out.println("==========");
    }
}
