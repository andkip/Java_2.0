package Task5_7_8.src.main.java;

public class Calculator {
    private double one;
    private double two;
    private String sign;

    public Calculator(double one, double two, String sign) {
        this.one = one;
        this.two = two;
        this.sign = sign;
    }

    public double getOne() {
        return one;
    }

    public double getTwo() {
        return two;
    }

    public String sign() {
        return sign;
    }

    public void Calculator() throws DivisionZeroException {
        switch (sign) {
            case "+":
                System.out.printf("Результат: %.4f\n", Operations.plus(one, two));
                break;
            case "-":
                System.out.printf("Результат: %.4f\n", Operations.minus(one, two));
                break;
            case "*":
                System.out.printf("Результат: %.4f\n", Operations.multiply(one, two));
                break;
            case "/":
                if (two == 0)
                 { throw new DivisionZeroException("Деление на ноль запрещено");}
                else
                    System.out.printf("Результат: %.4f\n", Operations.divide(one, two));
                break;
            default:
                System.out.println("Некорректный знак операции");
                break;
        }
    }
}
