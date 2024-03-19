/*Escreva um programa em java que receba um n´umero. O programa deve
encerrar quando o usu´ario informar -1. Caso contr´ario o programa dever´a
pedir novamente um n´umero */

import java.util.Scanner;

public class estruturaderepeticao03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero = 0;
        do {
            System.out.println("Digite um número, caso deseje encerrar digite -1: ");
             numero = leitor.nextInt();
        } while (numero != -1);
    }
}
