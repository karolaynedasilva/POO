import java.util.Scanner;

/*Escreva um programa em java que receba dois textos. Verifique se os dois
textos são iguais e apresente o resultado em tela. Observe e analise os
resultados.
 */
public class exercicio04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Escreva uma frase: ");
        String texto1 = leitor.nextLine();
        System.out.println("Digite outra frase: ");
        String texto2 = leitor.nextLine();
        if(texto1.equalsIgnoreCase(texto2)){
            System.out.println("As frases são idênticas");
        }else{
            System.out.println("As frases são diferentes");
        }
    }
}
