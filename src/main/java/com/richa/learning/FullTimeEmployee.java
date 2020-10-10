package com.richa.learning;

public class FullTimeEmployee  implements IEmployee,IEnjoy {
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

    @Override
    public void enjoy() {
        System.out.println("I am enjoying");
    }
}
