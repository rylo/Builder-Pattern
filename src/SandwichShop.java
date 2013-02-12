public class SandwichShop {
    public static void main(String[] args) {

        SandwichBuilder italianSandwich = new ItalianSandwichBuilder();
        Director sandwichArtist = new Director(italianSandwich);
        sandwichArtist.makeSandwich();
        Sandwich firstSandwich = sandwichArtist.getSandwich();
        sandwichArtist.announceSandwich();

        SandwichBuilder veggieSandwich = new VeggieSandwichBuilder();
        Director sandwichArtist2 = new Director(veggieSandwich);
        sandwichArtist2.makeSandwich();
        Sandwich firstSandwich2 = sandwichArtist.getSandwich();
        sandwichArtist2.announceSandwich();

    }

}