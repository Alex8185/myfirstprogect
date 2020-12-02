<<<<<<< HEAD:src/by/suboch/MicrowaveOven.java
package by.suboch;
=======
package suboch.technics;

import suboch.interfaces.Info;
>>>>>>> master:src/suboch/technics/MicrowaveOven.java

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
