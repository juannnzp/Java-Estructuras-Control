import java.util.Scanner;

/**
 * Mayor y menor.
 * @author Juan Pablo Zavala Pacheco
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Número 1: "); double n=entrada.nextDouble(), mayor=n, menor=n;
        for(int i=2;i<=10;i++){ System.out.print("Número "+i+": "); n=entrada.nextDouble(); if(n>mayor) mayor=n; if(n<menor) menor=n; }
        System.out.println("Mayor: "+mayor); System.out.println("Menor: "+menor);
        entrada.close();
    }
}
