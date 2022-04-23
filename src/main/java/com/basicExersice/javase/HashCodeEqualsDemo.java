package com.basicExersice.javase;


class PC {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return (this.id | this.id);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj.hashCode() == this.hashCode())
            return true;
        else
            return false;
    }
}

public class HashCodeEqualsDemo {
    public static void main(String[] args) {
        PC pc1 = new PC();
        PC pc2 = new PC();

        pc1.setId(123);
        pc1.setName("Lenovo");

        pc2.setId(123);
        pc1.setName("Lenovo");


        System.out.println(pc1.hashCode());
        System.out.println(pc2.hashCode());
        System.out.println(pc1.equals(pc2));
    }
}
