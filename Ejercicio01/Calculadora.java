package Ejercicio01;

class Calculadora {
    private int num1;
    private int num2;
    private String operation;

    public Calculadora(int num1, int num2, String operation) {
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
    }

    public void calculate() {
        int resultado = 0;
        switch (operation) {
            case "+":
                resultado = num1 + num2;
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case "-":
                resultado = num1 - num2;
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case "*":
                resultado = num1 * num2;
                System.out.println("El resultado de la multiplicación es: " + resultado);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("No se puede dividir por cero");
                    return;
                } else {
                    resultado = num1 / num2;
                    System.out.println("El resultado de la división es: " + resultado);
                }
                break;
            default:
                System.out.println("Operación no válida");
                return;
        }

        if (resultado < 0) {
            System.out.println("Cuidado, el resultado es negativo");

        } else if (resultado >= 0 && resultado < 10000) {
            System.out.println("Resultado dentro de los límites");

        } else {
            System.out.println("Error, el resultado es muy grande");
        }
    }
}