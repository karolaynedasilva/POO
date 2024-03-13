/*Modele uma classe que represente um c´ırculo. A classe deve ter um
atributo indicando o seu raio e um m´etodo para calcular a sua ´area. Crie o
diagrama de classe da UML e o c´odigo java correspondente. Crie alguns
objetos da classe e calcule a sua ´area. */
package poo;

import java.lang.Math;

public class Circulo {
    double raio;

    public double calcularArea(){
       double area = 3.14 * Math.pow(raio, 2);
       return area;
    }
}