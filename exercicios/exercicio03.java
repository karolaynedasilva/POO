import java.util.Scanner;

/*Escreva um programa em java que receba dois inteiros. Realize a divis˜ao
entre os n´umeros e apresente o resultado em tela. Observe o que acontece
quando se divide um n´umero por zero */
public class exercicio03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número:");
        int num1 = leitor.nextInt();
        System.out.println("Digite outro número:");
        int num2 = leitor.nextInt();
        float divisao = num1 / num2;
        System.out.println("O resultado da divisão é:"+divisao);

    }
}
