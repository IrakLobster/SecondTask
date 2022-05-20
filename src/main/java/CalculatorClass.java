import java.util.Scanner;

public class CalculatorClass {

    public void getResult(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Список доступных операций: \n1) Сложение \n2) Вычитание \n3) Деление \n4) Умножение");
        System.out.print("Введите номер операции: ");
        int numberOfOperation = scanner.nextInt();

        System.out.print("Введите первое число: ");
        double firstNumber = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double secondNumber = scanner.nextDouble();

        scanner.close();

        double result = 0;

        switch (numberOfOperation){
            case 1: result = firstNumber + secondNumber; break;
            case 2: result = firstNumber - secondNumber; break;
            case 3: result = firstNumber / secondNumber; break;
            case 4: result = firstNumber * secondNumber; break;
        }

        System.out.printf("Результат: %.4f", result);
    }
}
