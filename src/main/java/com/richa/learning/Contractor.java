package com.richa.learning;

public class Contractor  implements IEmployee{
    public void hire() {
        System.out.println("hiring a contactual employee");
    }

    public void release() {
        System.out.println("terminating a contractual employee");
    }

    public double salary() {
        return 12000;
    }

    public String[] benefits() {
        return new String[]{"baasic pay","t.a"};
    }
}
