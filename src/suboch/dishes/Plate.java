package suboch.dishes;

import suboch.dishes.FlyingDishes;
import suboch.interfaces.FlyingObjects;

public class Plate extends FlyingDishes implements FlyingObjects {

    public void flies() {
        System.out.println("Я тарелка, я взлетела");
    }
}
