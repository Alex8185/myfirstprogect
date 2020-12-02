package suboch;

import suboch.furniture.StandingObject;
import suboch.dishes.Cup;
import suboch.furniture.Skinali;
import suboch.furniture.Table;
import suboch.interfaces.Flying;
import suboch.interfaces.Info;
import suboch.technics.Fridge;
import suboch.technics.Lamp;
import suboch.technics.MicrowaveOven;
import suboch.technics.TVset;

public class Test {
    public static void main(String[] args) {
        System.out.println("hkgvjgcjgv");
        Fridge fridge1 = new Fridge("Atlant");
        Lamp lamp1 = new Lamp(100);
        MicrowaveOven MO = new MicrowaveOven("LG");
        Info fridge2 = new Fridge("Sony");
        Info lamp2 = new Lamp(200);
        Info TVset = new TVset("Horizont");
        StandingObject Table = new Table();
        Skinali skinali = new Skinali();
        Flying cup1 = new Cup();
        System.out.println("Изменение в develop");


        Table.standing();
        cup1.flying();
        lamp1.watt();
        fridge1.showInfo();
        lamp1.showInfo();
        fridge2.showInfo();
        lamp2.showInfo();
        TVset.showInfo();
        TVset.name();
        MO.showInfo();


    }
}
