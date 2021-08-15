package Task5_7_8.src.test.java;

import Task5_7_8.src.main.java.DivisionZeroException;
import org.junit.Test;

import static Task5_7_8.src.main.java.Calculator.*;
import static org.junit.Assert.assertEquals;

public class UnitTest {
    private Object DivisionZeroException;

    @Test
    public void AdditionTest() {
        assertEquals("Некорректное сложение чисел", 34.3, plus(12.8, 21.5), 0);
    }

    @Test
    public void AdditionOfNegativesTest() {
        assertEquals("Некорректное сложение отрицательных чисел", -34.3, plus(-12.8, -21.5), 0);
    }

    @Test
    public void SubtractionTest() {
        assertEquals("Некорректное вычитание чисел", -24.9, minus(-15.6, 9.3), 0);
    }

    @Test
    public void DivisionTest() throws DivisionZeroException {
        assertEquals("Некорректное деление чисел", 100.0, divide(350, 3.5), 0);
    }

    @Test (expected = DivisionZeroException.class)
    public void ZeroDivisionTest() throws DivisionZeroException {
        assertEquals(DivisionZeroException, divide(5.7, 0));
    }

    @Test
    public void DivisionOfZeroTest() throws DivisionZeroException {
        assertEquals("Некорректное деление нуля", 0.0, divide(0, 24.2), 0);
    }

    @Test
    public void MultiplicationTest() {
        assertEquals("Некорректное умножение чисел", 145.08, multiply(15.6, 9.3), 0);
    }

    @Test
    public void ZeroMultiplicationTest() {
        assertEquals("Некорректное умножение на 0", 0.0, multiply(21.4, 0), 0);
    }

    @Test
    public void MultiplicatioOfZeroTest() {
        assertEquals("Некорректное умножение нуля", 0.0, multiply(0, 21.4), 0);
    }
    }


