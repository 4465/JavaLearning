package com.basicExersice.reflection;


import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

//通过反射获取泛型
public class Test09 {
    public void test01(Map<String,User> map, List<User> list){
        System.out.println("test01");
    }

    public Map<String,Map> test02(){
        System.out.println("test02");
        return null;
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Method method = Test09.class.getMethod("test01", Map.class, List.class);

        Type[] types = method.getGenericParameterTypes();
        for (Type type:types
             ) {
            System.out.println("# " + type);
            if(type instanceof ParameterizedType){
                Type[] actualTypes = ((ParameterizedType) type).getActualTypeArguments();
                for (Type actualType : actualTypes) {
                    System.out.println(actualType);
                }
            }
        }

        method = Test09.class.getMethod("test02");
        Type genericReturnType = method.getGenericReturnType();
        if(genericReturnType instanceof ParameterizedType){
            Type[] actualTypes = ((ParameterizedType) genericReturnType).getActualTypeArguments();
            for (Type actualType : actualTypes) {
                System.out.println(actualType);
            }
        }

    }


}
