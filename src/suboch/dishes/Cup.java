package suboch.dishes;

import suboch.dishes.FlyingDishes;
import suboch.interfaces.FlyingObjects;

public class Cup extends FlyingDishes implements FlyingObjects {
    public void flies() {
        System.out.println("Я чашка, я взлетела");
    }
}
