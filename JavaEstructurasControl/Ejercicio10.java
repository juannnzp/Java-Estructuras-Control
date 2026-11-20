import java.util.Scanner;

/**
 * Suma y promedio.
 * @author Juan Pablo Zavala Pacheco
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int suma=0;
        for(int i=1;i<=10;i++){ System.out.print("Número "+i+": "); suma+=entrada.nextInt(); }
        System.out.println("Suma: "+suma); System.out.println("Promedio: "+(suma/10.0));
        entrada.close();
    }
}
