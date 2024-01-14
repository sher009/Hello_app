import java.util.Scanner;

public class Program {

        public static void main(String[]args){
                 Scanner scanner = new Scanner(System.in);

                    System.out.println("Введіть перше число");
                    float a = scanner.nextFloat();

                    System.out.println("Введіть друге число");
                    float b = scanner.nextFloat();

                    System.out.println("Виберіть операцію: \n +  -  *  /");
                    char operation = scanner.next().charAt(0);


                 if (operation == '+'){
                         float result = a + b;
                         System.out.println( a + " + " + b + " = " + result);

                  } else if (operation == '-') {
                         float result = a - b;
                         System.out.println( a + " - " + b + " = " + result);
                 } else if (operation == '*' ) {
                         float result = a * b;
                     System.out.println(a + " * " + b + " = " + result);
                 } else if (operation == '/' ) {
                     float result = a / b;
                        if (b == 0){
                         System.out.println("Ділення на 0 неможливе");
                     }
                     System.out.println(a + " / " + b + " = " + result);
        



                 }
        }

}
