<<<<<<< HEAD:src/by/suboch/Lamp.java
package by.suboch;
=======
package suboch.technics;

import suboch.interfaces.Info;
>>>>>>> master:src/suboch/technics/Lamp.java

public class Lamp implements Info {
    public int watt;

    public Lamp(int watt) {
        this.watt = watt;
    }

    public void watt() {
        System.out.println("My power " + watt + " W");
    }

    @Override
    public void showInfo() {
        System.out.println(watt);

    }

    @Override
    public void name() {
        System.out.println("Я лампа, я свечу");
    }
}
