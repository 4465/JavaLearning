package com.basicExersice.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//自定义注解
public class TestAnnotation {
    @MyAnnotation(age=18, name="小鸟")
    public void test(){

    }


    @MyAnnotation2("")
    public void test1(){

    }
}

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation{
    //注解的参数：参数类型+参数名
    String name() default  "";
    int age() default 0;
    int id() default -1;

    String[] schools() default {"西部开源", "清华大学"};
}

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation2{
    String value();
}