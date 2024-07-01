package Controller;

import ComplexCalculator.ComplexNumber;

public interface ControllerService<T extends ComplexNumber> {
    public T calculation(ComplexNumber value2, ComplexNumber value, char operators);
}
