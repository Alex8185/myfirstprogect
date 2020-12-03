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

    @Override
    public void printName() {

    }

}
