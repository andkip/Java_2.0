package Task5_7_8.src.main.java;

public class Calculator {
    private double one;
    private double two;
    private String sign;
    private double result;

    public static double divide(double x, double y) throws DivisionZeroException {
        if (y == 0) {
            throw new DivisionZeroException("Деление на ноль запрещено");
        } else return x / y;
    }

    public static double minus(double x, double y) {
        return x - y;
    }

    public static double multiply(double x, double y) {
        return x * y;
    }

    public static double plus(double x, double y) {
        return x + y;
    }

    public Calculator(double one, double two, String sign) {
        this.one = one;
        this.two = two;
        this.sign = sign;
    }
    public double getResult() {
        return result;
    }

    public double Calculator() throws DivisionZeroException, IncorrectSignException {
        switch (sign) {
            case "+":
               result = plus(one, two);
                return result;
            case "-":
                result = minus(one, two);
                return result;
            case "*":
                result = multiply(one, two);
                return result;
            case "/":
                result = divide(one, two);
                return result;
            default: {
                throw new IncorrectSignException("Неверный знак операции");
            }
        }
    }
}
