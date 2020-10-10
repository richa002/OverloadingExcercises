package com.richa.learning;

public class FullTimeEmployee implements IEmployee {
    public void hire() {
        System.out.println("hiring a full time employee");
    }

    public void release() {
        System.out.println("releasing a full time employee");
    }

    public double salary() {
        return 42000;
    }

    public String[] benefits() {
        return new String[]{"medical", "bonus","increment"};
    }
}
