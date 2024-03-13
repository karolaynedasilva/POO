/*Escreva um programa em java que realize a soma dos n´umeros entre 1 e
1000. Utilize uma estrutura de repeti¸c˜ao e apresente o resultado em tela. */
public class estruturarepeticao01 {
    public static void main(String[] args) {
        int soma = 0;
        for (int i =1; i < 1001; i++){
            soma +=i;
        }
        System.out.println("A soma dos números de 1 a 1000 é: "+ soma);
    }
}
