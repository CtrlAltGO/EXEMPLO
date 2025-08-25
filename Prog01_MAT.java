import java.util.Scanner;

public class Prog01_MAT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Calculadora Simples ===");
        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        System.out.println("Escolha a operação: ");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        int opcao = sc.nextInt();
        double resultado = 0;

        switch (opcao) {
            case 1 -> resultado = num1 + num2;
            case 2 -> resultado = num1 - num2;
            case 3 -> resultado = num1 * num2;
            case 4 -> {
                if (num2 != 0) resultado = num1 / num2;
                else {
                    System.out.println("Erro: divisão por zero!");
                    sc.close();
                    return;
                }
            }
            default -> {
                System.out.println("Opção inválida!");
                sc.close();
                return;
            }
        }

        System.out.println("Resultado: " + resultado);
        sc.close();
    }
}
