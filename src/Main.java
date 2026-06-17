import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bem Vindo A Calculadora!");

        System.out.print("Digite o primeiro numero: ");

        double num1 = input.nextDouble();

        System.out.print("Digite a operacao: ");

        char operacao = input.next().charAt(0);

        System.out.print("Digite o segundo numero: ");

        double num2 = input.nextDouble();

        double resultado = 0;
        boolean operacaoValida = true;

        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.print("Digite uma operacao valida! ");
                    operacaoValida = false;
                }
                break;
            default:
                System.out.println("Operacao invalida");
                operacaoValida = false;
        }
        if (operacaoValida) {
            System.out.printf("Resultado: %.2f %c %.2f = %.2f\n", num1, operacao, num2, resultado);
        }

    }
}