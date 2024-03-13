import java.util.Scanner;

/*Escreva um programa em java que receba um inteiro. Realize a soma do
n´umero 1 at´e o valor informado pelo usu´ario. Apresente o resultado em
tela.
 */
public class estruturaderepeticao02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = leitor.nextInt();
        int soma = 0;
        for(int i=1; i<=num; i++){
            soma += i;
        }
        System.out.println("Total = "+soma);
    }
}
