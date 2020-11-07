package ru.geekbrains.homework.lesson5;

public class Person {
    private String fio;
    private String position;
    private String email;
    private String tel;
    private double salary;
    private int age;
    private String snils;
    private String show;


    public Person(String fio, String position, String email, String tel, double salary, int age, String snils){
        this.fio = fio; // get/set
        this.position = position;// get/set
        this.email = email;// get/set
        this.tel = tel;// get/set
        this.salary = salary;// get/set
        this.age = age;// get
        this.snils = snils;// get
    }

    public Person() {

    }

    public void Show(){
        System.out.println(fio + ", " + position + ", " + email + ", " + tel + ", " + salary + ", " + age + ", " + snils);
    }

    public int getAge() {
        return age;
    }

    public String getFio() {
        return fio;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getTel() {
        return tel;
    }

    public double getSalary() {
        return salary;
    }

    public String getSnils() {
        return snils;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
