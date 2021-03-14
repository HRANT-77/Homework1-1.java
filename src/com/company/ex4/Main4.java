package com.company.ex4;

public class Main4 {
    public static void main(String[] args) {

        LukeSkywalker LukeSkywalker=new LukeSkywalker();
        LukeSkywalker.setNameOfBrother("Han");
        LukeSkywalker.setNameOfFather("Darth Vader");
        LukeSkywalker.setNameOfSister("Leia");
        LukeSkywalker.setNameOfDroid("R2D2");

        LukeSkywalker.relationToLuke("Darth Vader");
        LukeSkywalker.relationToLuke("Han");
        LukeSkywalker.relationToLuke("Leia");
        LukeSkywalker.relationToLuke("R2D2");
        LukeSkywalker.relationToLuke("Poxos");
    }
}
