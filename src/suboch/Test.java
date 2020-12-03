package suboch;

public class Test {
    public static void main(String[] args) {
        System.out.println("hkgvjgcjgv");
        Lamp lamp1 = new Lamp(100);
        MicrowaveOven MO = new MicrowaveOven("LG");
        Info lamp2 = new Lamp(200);
        Info TVset = new TVset("Horizont");
        Stand table = new Table();
        Skinali skinali = new Skinali();
        Flying cup1 = new Cup();
        System.out.println("Изменение в develop");

        cup1.flying();
        lamp1.watt();
        lamp1.showInfo();
        lamp2.showInfo();
        TVset.showInfo();
        MO.showInfo();
        Mixer.standing();


    }
}
