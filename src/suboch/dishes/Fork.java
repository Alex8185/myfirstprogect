package suboch.dishes;

import suboch.dishes.FlyingDishes;
import suboch.interfaces.FlyingObjects;

public class Fork extends FlyingDishes implements FlyingObjects {
    public void flies() {
        System.out.println("Я вилка, я взлетела");
    }
}
