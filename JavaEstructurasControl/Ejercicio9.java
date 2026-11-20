import java.util.Scanner;

/**
 * Tabla de multiplicar.
 * @author Juan Pablo Zavala Pacheco
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Número: "); int n=entrada.nextInt();
        for(int i=1;i<=12;i++){ System.out.println(n+" x "+i+" = "+(n*i)); }
        entrada.close();
    }
}
