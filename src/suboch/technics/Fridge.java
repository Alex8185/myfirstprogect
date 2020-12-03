<<<<<<< HEAD:src/by/suboch/Fridge.java
package by.suboch;
=======
package suboch.technics;

import suboch.interfaces.Info;
>>>>>>> master:src/suboch/technics/Fridge.java

public class Fridge implements Info {
    public String name;

    public Fridge(String name) {
        this.name = name;
    }

    public void name() {
        System.out.println("I am fridge, i give cold");

    }

    @Override
    public void showInfo() {
        System.out.println("Name is " + this.name);

    }
}
