import java.util.Scanner;

public class kod1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String name = scanner.nextLine();

        System.out.print("Введите возраст: ");
        int age = scanner.nextInt(); //nextInt() для целочисленного значения

        System.out.print("Введите вес: ");
        double weight = scanner.nextDouble(); //nextDouble()  для считывания числа с плавающей точкой

        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Вес: " + weight);
    }
}