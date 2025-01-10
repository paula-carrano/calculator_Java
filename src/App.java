package src;

import java.util.Scanner;
import src.operaciones.*;
import src.utils.Colores;

public class App {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido!");
        System.out.println("Introducí el primer número");
        double number1 = scanner.nextDouble();

        System.out.println("Introducí el operador [+, -, * , /]:");
        char operador = scanner.next().charAt(0);

        System.out.println("Introducí el segundo número");
        double number2 = scanner.nextDouble();

        switch (operador) {
            case '+':
                calculadora.setOperacion(new Suma());
                break;
            case '-':
                calculadora.setOperacion(new Resta());
                break;
            case '*':
                calculadora.setOperacion(new Multiplicacion());
                break;
            case '/':
                calculadora.setOperacion(new Division());
                break;
            default:
                System.out.println(Colores.ROJO + "Operador no válido.");
                scanner.close();
                return;
        }
        try {
            double resultado = calculadora.ejecutarOperacion(number1, number2);
            System.out.println("El resultado es: " + Colores.AZUL + resultado);
        } catch (ArithmeticException e) {
            System.out.println(Colores.ROJO + "Error: " + e.getMessage());
        }

        scanner.close();
    }
}
