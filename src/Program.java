import java.util.Scanner;

class DivideByZeroException extends RuntimeException {

    public DivideByZeroException() {
        super("Ділення на нуль недопустиме");
    }

}

public class Program {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введіть перше число");
            float a = scanner.nextFloat();

            System.out.println("Введіть друге число");
            float b = scanner.nextFloat();

            System.out.println("Виберіть операцію: \n +  -  *  /");
            char operation = scanner.next().charAt(0);

            if (operation == '+') {
                float result = a + b;
                System.out.println(a + " + " + b + " = " + result);

            } else if (operation == '-') {
                float result = a - b;
                System.out.println(a + " - " + b + " = " + result);
            } else if (operation == '*') {
                float result = a * b;
                System.out.println(a + " * " + b + " = " + result);
            } else if (operation == '/') {
                if (b == 0) {
                    throw new DivideByZeroException();
                }
                float result = a / b;
                System.out.println(a + " / " + b + " = " + result);
            } else {
                System.out.println("Неправильна операція");
            }
        } catch (DivideByZeroException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Виникла помилка: " + e.getMessage());
        }
    }

}