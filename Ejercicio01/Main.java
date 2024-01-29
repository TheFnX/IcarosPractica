package Ejercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int count = 0;

        while (count < 5) {
            System.out.print("Ingrese el primer número: ");
            int num1 = input.nextInt();

            System.out.print("Ingrese el segundo número: ");
            int num2 = input.nextInt();

            System.out.print("Ingrese la operación matemática (suma, resta, multiplicacion o division): ");
            String operation = input.next();

            Calculadora calculator = new Calculadora(num1, num2, operation);
            calculator.calculate();
            count++;
        }
    }
}