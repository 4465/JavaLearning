package com.basicExersice;


import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

class Person2 {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private int age;

}

public class javaBeanDemo {
    public static void main(String[] args) {
        BeanInfo info = null;
        try {
            info = Introspector.getBeanInfo(Person2.class);
        } catch (IntrospectionException e) {
            e.printStackTrace();
        }
        for (PropertyDescriptor pd : info.getPropertyDescriptors()) {
            System.out.println(pd.getName());
            System.out.println("  " + pd.getReadMethod());
            System.out.println("  " + pd.getWriteMethod());
        }
    }
}
