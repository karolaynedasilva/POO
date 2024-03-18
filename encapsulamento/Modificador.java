package encapsulamento;

public class Modificador {
    private double largura = 10;
    private double altura = 30;

    public double getAltura(){
        return altura;
    }
    public double getLargura(){
        return largura;
    }
    public void setAltura(){
        if(altura <0 )return;
        this.altura = altura;
    }
    public void setLargura(){
        if(largura >=0){
            this.largura = largura;
        }
    }
    public boolean isQuadrado(){
        return altura == largura;
    }

}
