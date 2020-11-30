package suboch;

public class Fridge implements Info {
    public String name;

    public Fridge(String name) {
        this.name = name;
    }


    @Override
    public void showInfo() {
        System.out.println("Name is " + this.name);

    }

    @Override
    public void speakTheName() {
        System.out.println("Называю свое имя при прикосновении");
    }

}
