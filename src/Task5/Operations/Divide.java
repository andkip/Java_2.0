package Task5.Operations;

public class Divide extends Numbers {
    public Divide(double numOne, double numTwo) {
        super(numOne, numTwo);
    }

    @Override
    public double result() {
        return getNumOne() / getNumTwo();
    }
}

