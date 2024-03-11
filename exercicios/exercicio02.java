import java.util.Scanner;

/*Escreva um programa em java que receba um inteiro. Verifique se o valor
´e par ou ´ımpar. Apresente o resultado em tela.
 */

public class exercicio02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero:");
	    int numero = leitor.nextInt();
            if(numero % 2 == 0){
                System.out.println("Par");
            }else{
                System.out.println("Impar");
            }
    }
}
