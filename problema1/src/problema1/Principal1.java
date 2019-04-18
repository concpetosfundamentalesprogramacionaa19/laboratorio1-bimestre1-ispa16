package problema1;

import java.util.Scanner ;
public class Principal1 {
	public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
		//declaracion  de variables
        double num_horas ;
		double valor_hora ;
		double valor_total ;
		double valor_descuento;
		double valor_total2;
		//entrada de datos
		System.out.println("ingrese el numero de horas ");
		num_horas = entrada.nextDouble();
		System.out.println("ingrese el valor del trabajo por hora ");
		valor_hora = entrada.nextDouble();
		//proceso
		valor_total = num_horas * valor_hora;
		valor_descuento = valor_total * 0.10;
		valor_total2 = valor_total - valor_descuento;

		System.out.printf("el descuento del seguro social es %f\nel valor total a pagar es %f",valor_descuento,valor_total2);
		
		
    }
}