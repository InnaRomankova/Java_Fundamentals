package by.it.romankova.lesson1.lab7OOP;


import by.it.romankova.lesson1.lab7OOP.servise.Info;

public class Task_7_1 {
    public static void main(String[] args) {
        Fridges fridges = new Fridges("LAGAN", "Fridge/freezer", "Freestanding");
        outputInfo(fridges);
        Ovens ovens = new Ovens("MATTRADITION","Forsed air oven, black", 1);
        outputInfo(ovens);
        WashingMachihes washingMachihes= new WashingMachihes("TVATTAD", "Integrated " +
                "washing machine", "Built-in");
        outputInfo(washingMachihes);

    }
    public static void outputInfo (Info info){
        info.showInfo();
    }

}
