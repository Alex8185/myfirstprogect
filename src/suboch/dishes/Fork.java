package suboch.dishes;

import suboch.interfaces.Flying;

public class Fork extends Fly implements Flying {

    public void flying() {
        System.out.println("Я вилка, я взлетела");
    }
}
