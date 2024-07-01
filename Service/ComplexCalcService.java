package Service;

import ComplexCalculator.ComplexNumber;
import Controller.ControllerService;

public class ComplexCalcService implements ControllerService {

    public ComplexNumber calculation(ComplexNumber value2, ComplexNumber value, char operators) throws IllegalArgumentException
    {
        switch (operators) {
             case '+':
                return new ComplexNumber(value2.a + value.a, value2.b + value.b);
             case '-':
                 return new ComplexNumber(value2.a - value.a, value2.b - value.b);
             case '*':
             {
                float real = value2.a * value.a - value2.b * value.b;
                float imaginary = value2.a * value.b + value2.b * value.a;
                return new ComplexNumber(real, imaginary);
             }
            case '/':
                {
                    if (value.a == 0 && value.b == 0) {
                        throw new IllegalArgumentException("Деление на ноль");
                    }
                    float denominator = value.a * value.a + value.b * value.b;
                    float real = (value2.a * value.a + value2.b * value.b) / denominator;
                    float imaginary = (value2.b * value.a - value2.a * value.b) / denominator;
                    return new ComplexNumber(real, imaginary);
                }
            default: 
                throw new IllegalArgumentException("Неправильный оператор");
        }

    }

}
