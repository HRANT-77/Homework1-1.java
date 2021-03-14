package com.company.ex4;

public class LukeSkywalker {
    private String nameOfFather;
    private String nameOfSister;
    private String nameOfBrother;
    private String nameOfDroid;

    public void setNameOfBrother(String nameOfBrother) {
        this.nameOfBrother = nameOfBrother;
    }

    public void setNameOfFather(String nameOfFather) {
        this.nameOfFather = nameOfFather;
    }

    public void setNameOfSister(String nameOfSister) {
        this.nameOfSister = nameOfSister;
    }

    public void setNameOfDroid(String nameOfDroid) {
        this.nameOfDroid = nameOfDroid;
    }
    public void relationToLuke(String name){
        if(name==nameOfFather){
            System.out.println("Luke, I am your father.");
        }
        else if(name==nameOfBrother){
            System.out.println("Luke, I am your brother in law.");
        }
        else if(name==nameOfSister){
            System.out.println("Luke, I am your sister.");
        }
        else if(name==nameOfDroid){
            System.out.println("Luke, I am your droid.");
        }
        else{
            System.out.println("Luke, I am not from your family");
        }
    }
}
