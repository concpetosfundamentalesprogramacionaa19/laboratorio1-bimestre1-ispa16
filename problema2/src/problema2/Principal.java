package problema2;

import java.util.Scanner ;
public class Principal {
	public static void main(String[] args) {
		//declaracion de variables
		String var_x ;
		String var_y ;
		String var_z ;
		double m ;
		
		//entrada de datos
       Scanner entrada  = new Scanner(System.in);
		System.out.println("Ingrese la variable  x");
		var_x = entrada.nextLine();
		System.out.println("Ingrese la variable  y");
		var_y = entrada.nextLine();
		System.out.println("Ingrese la variable  z");
		var_z = entrada.nextLine();
		
		//transformar a double
		
		double var_x2 = Double.parseDouble(var_x);
		double var_y2 = Double.parseDouble(var_y);
		double var_z2 = Double.parseDouble(var_z);
		//operacion
		
		m = (var_x2+(var_y2/var_z2))/(var_x2-(var_y2/var_z2));
		//presentacion de resultados
		System.out.printf("El valor de m, en base a las variables:\n x = %.2f\n\t y = %.2f\n\t\t z = %.2f\n"
				+ "da como resultado:\n\t\t\tm = %.2f",var_x2,var_y2,var_z2,m);
		
		
		
		
		
    }
}