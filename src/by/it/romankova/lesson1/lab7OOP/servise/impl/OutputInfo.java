package by.it.romankova.lesson1.lab7OOP.servise.impl;

import by.it.romankova.lesson1.lab7OOP.servise.Info;


public class OutputInfo implements Info {

    @Override
    public void showInfo() {

    }
    public static void outputInfo (Info info){
        info.showInfo();
    }
}
