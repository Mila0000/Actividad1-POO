public class Ejercicio12 {

    public static void main(String[] args) {
        double horas, pago, retencion, salario_bruto, retencion_fuente,salario_neto;

        horas = 48;
        retencion = 0.125;
        pago = 5000;

        salario_bruto = horas*pago;
        retencion_fuente= salario_bruto*retencion;
        salario_neto = salario_bruto - retencion_fuente;

        System.out.println("El salario bruto del profesor es: " + salario_bruto + "\nLa retención en la fuente: " + retencion_fuente + "\nSalario neto: " + salario_neto );
    }

}