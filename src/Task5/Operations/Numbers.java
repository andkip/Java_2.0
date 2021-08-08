package Task5.Operations;

public abstract class Numbers {
    private double numOne;
    private double numTwo;

    public Numbers(double numOne, double numTwo) {
        this.numOne = numOne;
        this.numTwo = numTwo;
    }

    public double getNumOne() {
        return numOne;
    }

    public double getNumTwo() {
        return numTwo;
    }

    public abstract double result();
}

