package suboch.dishes;

import suboch.interfaces.Flying;

public class Plate extends Fly implements Flying {

    public void flying() {
        System.out.println("Я тарелка, я взлетела");
    }
}