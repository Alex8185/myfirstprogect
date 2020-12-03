package suboch.dishes;

import suboch.interfaces.Flying;

public class Cup extends Fly implements Flying {

    public void flying() {
        System.out.println("Я чашка, я взлетела");
    }
}
