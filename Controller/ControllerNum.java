package Controller;

import ComplexCalculator.ComplexNumber;

public interface ControllerNum<T extends ComplexNumber> {
    public T CreateNumber(int a, int b);
}
