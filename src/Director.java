public class Director {
    private SandwichBuilder sandwichBuilder;

    public Director(SandwichBuilder sandwichBuilder) {
        this.sandwichBuilder = sandwichBuilder;
    }

    public Sandwich getSandwich() {
        return this.sandwichBuilder.getSandwich();
    }

    public void makeSandwich() {
        this.sandwichBuilder.addMeat();
        this.sandwichBuilder.addBread();
        this.sandwichBuilder.addToppings();
    }

    public void announceSandwich() {
        Sandwich sandwich = this.sandwichBuilder.getSandwich();
        System.out.println("Sandwich Complete!");
        System.out.println("Bread: " + sandwich.getBread() );
        System.out.println("Meat?: " + sandwich.getMeat() );
        System.out.println("Toppings: " + sandwich.getToppings() );
        System.out.println("");
    }
}
