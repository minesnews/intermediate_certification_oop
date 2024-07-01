package View;

import java.util.Scanner;

import Controller.ComplexCalcServiceController;
import Controller.ComplexNumController;
import Controller.ControllerNum;
import Controller.ControllerService;
import ComplexCalculator.ComplexNumber;


public class ComplexCalcView {
    public void start(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Первое число: введите действительную часть: ");
        int d1 = scanner.nextInt();
        System.out.println("Первое число: введите мнимую часть (без i): ");
        int m1 = scanner.nextInt();
        System.out.println("Второе число: введите действительную часть: ");
        int d2 = scanner.nextInt();
        System.out.println("Второе число: введите мнимую часть (без i): ");
        int m2 = scanner.nextInt();
        System.out.println("Введите символ операции (+-/*): ");
        char ch = scanner.next().charAt(0);

        ControllerNum<ComplexNumber> controller = new ComplexNumController();
        
        ComplexNumber num1 = controller.CreateNumber(d1,m1);
        ComplexNumber num2 = controller.CreateNumber(d2,m2);
        
        System.out.println(num1.getComplexNumber());
        System.out.println(num2.getComplexNumber());

        ControllerService<ComplexNumber> controllerService = new ComplexCalcServiceController();

        ComplexNumber result = controllerService.calculation(num1, num2, ch);
        System.out.println("Результат: " + result.getComplexNumber());
    }
}
