package suboch;

import by.suboch.*;
import suboch.interfaces.Flying;

public class Test {
    public static void main(String[] args) {
        System.out.println("hkgvjgcjgv");
        Lamp lamp1 = new Lamp(100);
        MicrowaveOven MO = new MicrowaveOven("LG");
        Info lamp2 = (Info) new Lamp(200);
        Info TVset = (Info) new TVset("Horizont");
        Stand table = new Table();
        Skinali skinali = new Skinali();
        Flying cup1 = (Flying) new Cup();
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
