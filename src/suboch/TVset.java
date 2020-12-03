package suboch;

public class TVset implements Info {
    public String name;

    public TVset(String name) {
        this.name = name;
    }


    @Override
    public void showInfo() {
        System.out.println("I am TV set");

    }

    @Override
    public void printName() {

    }

}
