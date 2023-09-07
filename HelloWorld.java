import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el primer número:");
        int num1 = scanner.nextInt();

        System.out.println("Introduce el segundo número:");
        int num2 = scanner.nextInt();

        System.out.println("Introduce la operación que quieres realizar:");
        String operacion = scanner.next();

        int resultado = 0;

        switch (operacion) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                resultado = num1 / num2;
                break;
        }

        System.out.println("El resultado es: " + resultado);
    }
}