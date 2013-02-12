public class VeggieSandwichBuilder implements SandwichBuilder {
    private Sandwich sandwich;

    public VeggieSandwichBuilder() {
        this.sandwich = new Sandwich();
    }

    @Override
    public void addMeat() {
        sandwich.setMeat(false);
    }

    @Override
    public void addBread() {
        sandwich.setBread("Lettuce Wrap");
    }

    @Override
    public void addToppings() {
        sandwich.setToppings("Lettuce, Peppers, Tomatoes, Onions");
    }

    @Override
    public Sandwich getSandwich() {
        return sandwich;
    }
}
