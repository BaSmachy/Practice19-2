package com.company;

public class Laptop {

    String brend;
    String color;
    int memory;
    int year_of_issue;

    public void power(){
        System.out.println("Turned on " +brend+ " " + year_of_issue+" " + color+" " + memory + "gb");

    }
    public void power1 (){
        System.out.println("Turned on " +brend+ " " + year_of_issue+" " + color+" " + memory + "trb");

    }
    public void turnOff(){
        System.out.println("Turned off " +brend+ " " + year_of_issue+" " + color+" " + memory + "gb");

    }
    public  void turnoff2(){
        System.out.println("Turned off " +brend+ " " + year_of_issue+" " + color+" " + memory + "trb");

    }


    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getYear_of_issue() {
        return year_of_issue;
    }

    public void setYear_of_issue(int year_of_issue) {
        this.year_of_issue = year_of_issue;
    }
}
