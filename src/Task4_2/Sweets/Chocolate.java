package Task4_2.Sweets;

public class Chocolate extends Gift {

    private String flavour;

    public Chocolate (String name, double weight, double price, String flavour) {
        super(name, weight, price);
        this.flavour = flavour;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    @Override
    public String toString() {
        return "Шоколад: [" + super.toString() + ", Вкус: " + flavour + "]";
    }
}