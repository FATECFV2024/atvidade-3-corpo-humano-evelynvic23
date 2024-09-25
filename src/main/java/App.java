package main.java;
import java.util.Scanner;

public class App {
        //Comentário

   
    public static void main(String[] args) throws Exception {
        

        CorpoHumano corpo = new CorpoHumano(0, 0, 0, 0);

        corpo.setAltura(10);
        corpo.setMassa(20);

        System.out.println("O IMC é: " + corpo.calcularIMC());


    }
}
