package main.java;
import java.util.Scanner;

public class App {
        //Comentário

//- Na classe Corpo_Humano inclua a linha c1.massa = "2"; logo depois de instanciar o objeto c1. Qual foi a ocorrência? Qual a conclusão sobre o que aconteceu?

// Não consigo acessar

// - Na classe Corpo_Humano altere a linha private float Massa para public float Massa; Qual foi a ocorrência? Qual a conclusão sobre o que aconteceu?

// Daria erro

// - Na classe Corpo_Humano altere a linha public setVolume (float volume) para private setVolume (float volume).Qual foi a ocorrência? Qual a conclusão sobre o que aconteceu?

// Não conseguiria acessar
   
    public static void main(String[] args) throws Exception {
        

        CorpoHumano corpo = new CorpoHumano(0, 0, 0, 0);

        corpo.setAltura(10);
        corpo.setMassa(20);

        System.out.println("O IMC é: " + corpo.calcularIMC());


    }
}
