package Controller;

import ComplexCalculator.ComplexNumber;
import Service.ComplexNumService;

public class ComplexNumController implements ControllerNum<ComplexNumber> {
    private ComplexNumService complexNumService = new ComplexNumService();
    public ComplexNumber CreateNumber(int a, int b){
        return complexNumService.CreateNumber(a, b);
    }
}
