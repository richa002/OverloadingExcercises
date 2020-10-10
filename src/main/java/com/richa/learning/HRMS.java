package com.richa.learning;

public class HRMS {
    public void hireprocess(IEmployee employee){
        employee.hire();
    }
    public void releaseprocess(IEmployee employee){
        employee.release();
    }
    public void calsalary(IEmployee employee){
        System.out.println( employee.salary());
    }
    public void printbenefits(IEmployee employee){
        System.out.println(employee.benefits());
    }

    public static void main(String[] args) {
        HRMS hrms=new HRMS();
        IEmployee obj=new FullTimeEmployee();
        hrms.hireprocess(obj);

        obj=new Contractor();
        hrms.hireprocess(obj);

    }
}
