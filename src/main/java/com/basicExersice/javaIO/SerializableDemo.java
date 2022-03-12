package com.basicExersice.javaIO;

import java.io.*;
import java.util.Arrays;

class Employee implements java.io.Serializable
{
    public String name;
    public String address;
    public transient int SSN;
    public int number;
    public void mailCheck()
    {
        System.out.println("Mailing a check to " + name
                + " " + address);
    }
}


public class SerializableDemo {
    public static void main(String[] args) {
        Employee em = new Employee();
        em.name = "Reyan Ali";
        em.address = "Phokka Kuan, Ambehta Peer";
        em.SSN = 11122333;
        em.number = 101;
        try {
            FileOutputStream fileOut = new FileOutputStream("src/main/java/com/basicExersice/javaIO/temp/employee.ser");
            ObjectOutputStream output = new ObjectOutputStream(fileOut);

            output.writeObject(em);
            output.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in /tmp/employee.ser");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Double d=null;
        try
        {
            FileInputStream fileIn = new FileInputStream("src/main/java/com/basicExersice/javaIO/temp/employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            em = (Employee) in.readObject();
            in.close();
            fileIn.close();
        }catch(IOException i)
        {
            i.printStackTrace();
            return;
        }catch(ClassNotFoundException c)
        {
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }
        System.out.println("Deserialized Employee...");
        System.out.println("Name: " + em.name);
        System.out.println("Address: " + em.address);
        System.out.println("SSN: " + em.SSN);
        System.out.println("Number: " + em.number);

    }
}
