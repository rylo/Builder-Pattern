public class Sandwich {
    private boolean meat;
    private String bread;
    private String toppings;

    public Sandwich() {
    }

    public void setMeat(boolean meatBoolean){
        meat = meatBoolean;
    }

    public boolean getMeat() {
        return meat;
    }

    public void setBread(String breadType) {
        bread = breadType;
    }

    public String getBread() {
        return bread;
    }

    public void setToppings(String toppingsList) {
        toppings = toppingsList;
    }

    public String getToppings() {
        return toppings;
    }
}
