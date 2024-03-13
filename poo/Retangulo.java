package poo;

public class Retangulo{
    double altura;
    double largura;

    public double obterArea(){
        return altura * largura;
    }
    public void imprimirDetalhes(){
        System.out.println("Altura: "+altura);
        System.out.println("Largura: "+largura);
        System.out.println("Area: "+obterArea());
    }
}