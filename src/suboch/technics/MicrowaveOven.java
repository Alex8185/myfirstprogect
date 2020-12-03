package suboch.technics;

import suboch.interfaces.Info;

public class MicrowaveOven implements Info {
    public String name;

    public MicrowaveOven(String name) {
        this.name = name;
    }

    @Override
    public void showInfo() {
        System.out.println("Alarm!!! MicrowaveOven");

    }

    public void name() {
        System.out.println("Я микроволновка, я излучаю СВЧ");
    }


}
