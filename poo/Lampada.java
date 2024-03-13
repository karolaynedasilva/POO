/*Modele uma classe que represente uma lˆampada. A classe deve ter um
atributo indicando se a lˆampada est´a ligada ou desligada e m´etodos para
poder ligar ou desligar. Crie o diagrama de classe da UML e o c´odigo java
correspondente. Crie alguns objetos da classe e execute a a¸c˜ao de
ligar/desligar.*/

package poo;

public class Lampada {
    boolean ligada;
    boolean desligada;

    public Lampada(){
        this.ligada = false; 
    }
    public void ligarLampada(){
        this.ligada = true;
        System.out.println("Lâmpada está ligada");
    }
    public void desligarLampada(){
        System.out.println("Lâmpada desligada!");
    }
}
