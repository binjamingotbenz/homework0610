import java.util.Scanner;

public class zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        System.out.println("Введите оператор 1) +, 2) -, 3) *, 4) / ");
        String operator = scanner.next();

        double result;

        switch (operator) {
            case "1":
                result = num1 + num2;
                System.out.println("Результат: " + result);
                break;
            case "2":
                result = num1 - num2;
                System.out.println("Результат: " + result);
                break;
            case "3":
                result = num1 * num2;
                System.out.println("Результат: " + result);
                break;
            case "4":
                if (num2 == 0) {
                    System.out.println("Ошибка: делить на ноль нельзя");
                } else {
                    result = num1 / num2;
                    System.out.println("Результат: " + result);
                }
                break;
            default:
                System.out.println("Такого оператора не найдено");
        }
    }
}
