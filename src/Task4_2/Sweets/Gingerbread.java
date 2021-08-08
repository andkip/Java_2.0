package Task4_2.Sweets;

public class Gingerbread extends Gift {

    private boolean glaze;

    public Gingerbread (String name, double weight, double price, boolean glaze) {
        super(name, weight, price);
        this.glaze = glaze;
    }

    public boolean getGlaze() {
        return glaze;
    }

    public void setGlaze(boolean flavour) {
        this.glaze = glaze;
    }

    @Override
    public String toString() {
        return "Пряник: [" + super.toString() + ", Есть ли глазурь: " + glaze + "]";
    }
}