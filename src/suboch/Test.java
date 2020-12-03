package suboch;

import suboch.furniture.Mixer;
import suboch.interfaces.Info;
import suboch.technics.Lamp;
import suboch.technics.MicrowaveOven;

public class Test {
    public static void main(String[] args) {
        System.out.println("hkgvjgcjgv");
        Lamp lamp1 = new Lamp(100);
        MicrowaveOven MO = new MicrowaveOven("LG");
        Info lamp2 = (Info) new Lamp(200);
        System.out.println("Изменение в develop");


        lamp1.watt();
        lamp1.showInfo();
        lamp2.showInfo();
        MO.showInfo();
        Mixer.standing();


    }
}
