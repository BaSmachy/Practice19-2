package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Laptop mac = new Laptop();
        mac.brend = "MacBook";
        mac.year_of_issue = 2017;
        mac.color = "White";
        mac.memory = 512;
        mac.power();
        mac.turnOff();


        Laptop mac1= new Laptop();
        mac1.brend = "MacBook Pro";
        mac1.year_of_issue = 2021;
        mac1.color = "Black";
        mac1.memory = 1;
        mac1.power1();
        mac1.turnoff2();

        System.out.println("2nd exercise\т");

        PeakSoft peak = new PeakSoft();
        String [] rooms = {"FACEBOOK", "APPLE","GOOGLE","SPACEX"};
        peak.rooms = rooms;
        peak.showRooms();


        System.out.println("hello world");

  }
}
