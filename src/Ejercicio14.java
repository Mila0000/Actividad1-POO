import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args){
        float x;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un número para hallar su cuadrado y cubo: ");
        x = entrada.nextFloat();

        System.out.println("El cuadrado de del número que ingresó es: " + Math.pow(x,2) + " y su cubo es: " + Math.pow(x,3));
    }

}