import java.util.Scanner;
public class kod2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double number1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double number2 = scanner.nextDouble();

        System.out.print("Введите оператор (+, -, *, /): ");
        String operator = scanner.next();

        double result;

        switch (operator) { //оператор, который позволяет выбирать один из нескольких вариантов выполнения кода на основе значения выражения
            case "+":
                result = number1 + number2;
                System.out.println("Результат: " + result);
                break;
            case "-":
                result = number1 - number2;
                System.out.println("Результат: " + result);
                break;
            case "*":
                result = number1 * number2;
                System.out.println("Результат: " + result);
                break;
            case "/":
                if (number2 == 0) {
                    System.out.println("Ошибка: деление на ноль");
                } else {
                    result = number1 / number2;
                    System.out.println("Результат: " + result);
                }
                break;
            default:
                System.out.println("Некорректный оператор");
        }
    }
}

