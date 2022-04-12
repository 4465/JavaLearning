package com.basicExersice.serializable;

import java.io.*;

class User implements Serializable{
    private static final long serialVersionUID= 4979517523497765L;

    private String name;
    private transient int age;

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

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class SerializableDemo {
    public static void main(String[] args) {
        User user = new User();
        user.setName("cosen");
        user.setAge(15);
        System.out.println(user);

        try (FileOutputStream fos = new FileOutputStream("tempFile"); ObjectOutputStream pps = new ObjectOutputStream(fos)){
            pps.writeObject(user);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        File file = new File("tempFile");
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))){
            User newUser = (User)ois.readObject();
            System.out.println(user);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
