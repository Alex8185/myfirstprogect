package suboch;

public class TVset implements Info {
    public String name;

    public TVset(String name) {
        this.name = name;
    }


    @Override
    public void showInfo() {

    }

    @Override
    public void name() {
        System.out.println("Name is " + this.name);

    }
}
