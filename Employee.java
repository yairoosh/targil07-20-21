package com.company;

import java.util.ArrayList;

public class Employee {

    String name;
    int salary;
    int seniority;

public Employee(String name, int salary, int seniority){

    this.name = name;
    this.salary = salary;
    this.seniority = seniority;
}

public Double vetek(){

    int sum;
    sum = salary / seniority;
    return (double) sum;
}

public ArrayList<Employee> filter(Employee[] allEmployee){
    ArrayList<Employee> res = new ArrayList<Employee>();

    for (Employee e : allEmployee){
        if (e.salary < 15000 && e.seniority > 120){
            res.add(e);
        }
    }
return res;

}
}
