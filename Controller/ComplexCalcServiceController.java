package Controller;

import ComplexCalculator.ComplexNumber;
import Service.ComplexCalcService;

    public class ComplexCalcServiceController implements ControllerService<ComplexNumber>{
        private ComplexCalcService complexCalcService = new ComplexCalcService();
        public ComplexNumber calculation(ComplexNumber value2, ComplexNumber value, char operators){
            return complexCalcService.calculation(value2, value, operators);
        }
}
