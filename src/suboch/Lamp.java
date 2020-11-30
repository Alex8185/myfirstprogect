package suboch;

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
    public void speakTheName() {
        System.out.println("Называю свое имя при прикосновении");
    }

}
