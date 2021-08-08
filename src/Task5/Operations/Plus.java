package Task5.Operations;

public class Plus extends Numbers {
    public Plus(double numOne, double numTwo) {
        super(numOne, numTwo);
    }

    @Override
    public double result() {
        return getNumOne() + getNumTwo();
    }
}

