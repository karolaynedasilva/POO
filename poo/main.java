package poo;

public class main {
    public static void main(String[] args) {
        System.out.println("Retangulo r");
        //Instanciando a classe
        // new - cria um objeto e reserva um espaço na memória
        Retangulo r = new Retangulo();

        r.altura = 10;
        r.largura = 15;
        r.imprimirDetalhes();

        Pessoa pessoa = new Pessoa();
        
        pessoa.nome = "Karolayne";
        pessoa.sobrenome = "da Silva Alexandre";
        System.out.println(pessoa.nomeCompleto());

        Lampada lampada = new Lampada();
        lampada.ligarLampada();
        lampada.desligarLampada();


    }
}
