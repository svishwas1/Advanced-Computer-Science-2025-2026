public class Monitor {
    private double timeUntilClass; //=34.5;
    private int SectionsOfScreen;  //= 5;
    private char CharacterOnScreen; //= 'S';
    private String ColorOfMonitor; //= "White";
    private String ShapeOfMonitor; //= "Rectangle";
    private String DisplayClub; //= "TaekwonDance";
    private boolean OnWall;
    private int brightness;

    //When you make a NEW object, this code runs
    public Monitor() {
        timeUntilClass = 34.5;
        SectionsOfScreen = 5;
        CharacterOnScreen = 'S';
        ColorOfMonitor = "White";
        ShapeOfMonitor = "Rectangle";
        DisplayClub = "TaekwonDance";
        OnWall = true;
        brightness = 55;
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

    public void setColor(String ColorOffMonitor) {
        ColorOfMonitor = "red";
    }

    public String getShapeofMonitor(String ShapeOfMonitor) {
        return ShapeOfMonitor;
    }

    public boolean OnWall(boolean OnWall) {
        return OnWall;
    }

    public void setCharacterOnScreen(char CharacterOnScreen) {
        CharacterOnScreen = 'V';
    }

    public void changeTime(double timePassed) {
        if (timePassed > timeUntilClass) {
            System.out.println("Too much time has passed");
            timeUntilClass = timeUntilClass - timePassed;
        } else {
            timeUntilClass = timeUntilClass - timePassed;
            System.out.println("Time until class is now" + timeUntilClass);
        }
        if (timeUntilClass <= 0) {
            System.out.println("You are late to class!");
        }
    }

    public double setBrightness(int brightness) {
        Math.sqrt(brightness);
    
    }

    //Display the Date 
    //Break 
    //Turn Off
    //Change time

}