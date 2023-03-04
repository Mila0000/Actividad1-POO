import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        int edad_juan;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la edad de Juan: ");
        edad_juan = entrada.nextInt();

        System.out.println("La edad de Juan es: " + edad_juan + " años\nLa edad de Alberto es: " + ((2*edad_juan)/3) + " años\nLa edad de Ana es: " + ((4*edad_juan)/3) + " años\nLa edad de la mamá es: " + (((2*edad_juan)/3+((4*edad_juan)/3)+edad_juan))+ " años");

    }

}