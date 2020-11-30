package suboch;

public class Test {
    public static void main(String[] args) {

        Fridge fridge1 = new Fridge("Atlant");
        Lamp lamp1 = new Lamp(100);
        MicrowaveOven mo = new MicrowaveOven("LG");
        Info fridge2 = new Fridge("Sony");
        Info lamp2 = new Lamp(200);
        Info tvset = new TVset("Horizont");
        StandingFurniture table = new Table();
        Skinali skinali = new Skinali();
        Flying cup1 = new Cup();
        System.out.println("Изменение в develop");


        Table.standing();
        cup1.flying();
        lamp1.watt();
        fridge1.showInfo();
        lamp1.showInfo();
        mo.showInfo();


    }
}
