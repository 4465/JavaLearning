package com.basicExersice.reflection;

import java.lang.annotation.*;
import java.lang.reflect.Field;

public class Test10 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class c1 = Class.forName("com.basicExersice.reflection.Student2");

        //通过反射获取注解
        Annotation[] annotations = c1.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }

        //获得注解的value的值
        TableStu tableStu = (TableStu) c1.getAnnotation(TableStu.class);
        String value = tableStu.value();
        System.out.println(value);

        //获得类指定的注解
        Field name = c1.getDeclaredField("name");
        FieldStu annotation = name.getAnnotation(FieldStu.class);
        System.out.println(annotation.columnName());
        System.out.println(annotation.type());
        System.out.println(annotation.length());

    }
}

@TableStu("db_student")
class Student2{
    @FieldStu(columnName = "db_id", type = "int", length = 10)
    private int id;
    @FieldStu(columnName = "db_id", type = "int", length = 10)
    private int age;
    @FieldStu(columnName = "db_id", type = "varchar", length = 5)
    private String name;

    public Student2() {
    }

    public Student2(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

}


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface TableStu{
    String value();
}


//属性的注解
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface FieldStu{
    String columnName();
    String type();
    int length();
}