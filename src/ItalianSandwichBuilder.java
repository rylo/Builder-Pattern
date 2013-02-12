public class ItalianSandwichBuilder implements SandwichBuilder {
    private Sandwich sandwich;

    public ItalianSandwichBuilder() {
        this.sandwich = new Sandwich();
    }

    @Override
    public void addMeat() {
        sandwich.setMeat(true);
    }

    @Override
    public void addBread() {
        sandwich.setBread("Italian Bread");
    }

    @Override
    public void addToppings() {
        sandwich.setToppings("Giardiniera, Lettuce, Oil, Vinegar, Italian Seasoning");
    }

    @Override
    public Sandwich getSandwich() {
        return sandwich;
    }
}
