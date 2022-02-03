package com.company;

public class Student {
    private String name;
    private String surname;
    private String birthDay;
    private int jashy;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public int getJashy() {
        return jashy;
    }

    public void setJashy(int jashy) {
        if(jashy>0) {
            System.out.println("Studenttin jashy ters emes");
        }
        this.jashy = jashy;
    }
}
