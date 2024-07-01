package Service;

import ComplexCalculator.ComplexNumber;
import Controller.ControllerNum;

public class ComplexNumService implements ControllerNum{
    public ComplexNumber CreateNumber(int a, int b){
        ComplexNumber number = new ComplexNumber(a,b);
        return number;
    }
}
