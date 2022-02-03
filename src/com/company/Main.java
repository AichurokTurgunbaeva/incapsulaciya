package com.company;

public class Main {

    public static void main(String[] args) {
	Kurs kurs = new Kurs();
    kurs.setAty("Java-Backend");
    kurs.setNomer(5);
    kurs.setMugalimFio("Allanov Muhamed");
    kurs.setData("04.01.2022");
        System.out.println(kurs.getAty()+" " +kurs.getNomer()+" "+kurs.getMugalimFio()+" "+kurs.getData());


    Student student = new Student();
    student.setName("Aichurok");
    student.setSurname("Turgunbaeva");
    student.setBirthDay("29.08.1993");
    student.setJashy(29);
        System.out.println(student.getName()+" "+student.getSurname()+" "+student.getBirthDay()+" "+student.getJashy());
    }
}
