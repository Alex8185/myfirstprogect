package suboch;

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
        System.out.println("Я микроволновка, я грею сосиски");

    }


}
