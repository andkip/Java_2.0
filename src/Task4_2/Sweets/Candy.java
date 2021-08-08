package Task4_2.Sweets;

public class Candy extends Gift{

    private String filling;

    public Candy(String name, double weight, double price, String filling) {
        super(name, weight, price);
        this.filling = filling;
    }

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    @Override
    public String toString() {
        return "Конфеты: [" + super.toString() + ", Начинка: " + filling + "]";
    }
}