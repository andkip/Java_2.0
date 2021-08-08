package Task5.Operations;

public class Minus extends Numbers {
    public Minus(double numOne, double numTwo) {
        super(numOne, numTwo);
    }

    @Override
    public double result() {
        return getNumOne() - getNumTwo();
    }
}
