package by.suboch;

import suboch.interfaces.Info;

public class Fridge implements Info {
    public int watt;

    public Fridge(int watt) {
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
    public void printName() {
        System.out.println("Я холодильник, во мне лежит труп");

    }

}
