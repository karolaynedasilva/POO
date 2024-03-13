/*Modele uma classe que represente um dado de 6 faces. A classe deve ter
um m´etodo que simule a a¸c˜ao de rolar um dado. Crie o diagrama de classe
da UML e o c´odigo java correspondente. Crie alguns objetos da classe e
execute a a¸c˜ao de rolar o dado */

package poo;

import java.util.Random;

public class Dado {
    int dado = 6;

    public int rolarDado(){
        Random random = new Random();
        return random.nextInt(dado) + 1;
    }
}
