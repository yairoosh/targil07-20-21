package com.company;

import javax.xml.crypto.Data;

public class Date {

    int day;
    int month;
    int yaer;

public Data(int day, int month, int yaer){
    this.day = day;
    this.month = month;
    this.yaer = yaer;
}

public Date earlyDate (Date other){

    if (yaer < other.year)
        return this;
    else if (yaer > other.yaer)
        return other;

    if (day < other.day)
        return this;
    else if (day > other.day)
        return other;

    return null;
}

public void printDate(){
    System.out.println(day + "/" + month + "/" + yaer);
}

public boolean isLegal(){
    if (day < 1 || day > 31)
        return false;
    if (month < 1 || month > 12)
        return false;

    if (day == 31) {
        if (month == 4 || month == 6 || month == 9 || month == 11)
            return false;
    }

    if (month == 2) {
        if (day > 28 && day != 29)
            return false;

        if (yaer %4 != 0)
            return false;

        if (yaer %100 ==0 &&yaer %400 !=0)
            return false;
    }
    return true;
}

public boolean isLeapYear(){
    return true;
}

public int dataToNum(){
    return 0;
}
}










