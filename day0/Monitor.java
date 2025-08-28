public class Monitor {
    private double timeUntilClass; //=34.5;
    private int SectionsOfScreen;  //= 5;
    private char CharacterOnScreen; //= 'S';
    private String ColorOfMonitor; //= "White";
    private String ShapeOfMonitor; //= "Rectangle";
    private String DisplayClub; //= "TaekwonDance";
    private boolean OnWall;

    //When you make a NEW object, this code runs
    public Monitor() {
        timeUntilClass = 34.5;
        SectionsOfScreen = 5;
        CharacterOnScreen = 'S';
        ColorOfMonitor = "White";
        ShapeOfMonitor = "Rectangle";
        DisplayClub = "TaekwonDance";
        OnWall = true;
    }

    //public __WhatComesOut__ name of function__(_inputs_){}

    public void change_display() {
        ColorOfMonitor = "Red";
        System.out.println("Color of the Monitor Changed to " + ColorOfMonitor);

    }

    public void Break() {
        System.out.println("Monitor is Broken!😔");

    }

    public void turn_off() {
        System.out.println("Monitoring Powering Off...");

    }

    public void change_time() {
        timeUntilClass = 12.2;
        System.out.println("Class is Starting Soon!");
        System.out.println(timeUntilClass);
    }

    public void takeOffWall() {
        OnWall = false;
        System.out.println("Is clock on wall? " + OnWall);
    }


    //Display the Date 
    //Break 
    //Turn Off
    //Change time

}