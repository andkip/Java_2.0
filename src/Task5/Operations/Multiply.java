package Task5.Operations;

public class Multiply extends Numbers {
    public Multiply(double numOne, double numTwo) {
        super(numOne, numTwo);
    }

    @Override
    public double result() {
        return getNumOne() * getNumTwo();
    }
}

