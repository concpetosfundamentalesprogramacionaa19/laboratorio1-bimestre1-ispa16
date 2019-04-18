package problema3;
import java.util.Scanner ;
public class Principal3 {
    public static void main(String[] args) {
    	//declaracion de variables
    	Scanner entrada = new Scanner(System.in);
    	String nota_1,nota_2,nota_3 ;
    	double promedio,nota1,nota2,nota3;
    	
    	//ingreso de datos por teclado
    	System.out.println("ingrese la primera nota ");
    	nota_1 = entrada.nextLine();
    	System.out.println("ingrese la segunda nota ");
    	nota_2 = entrada.nextLine();
    	System.out.println("ingrese la tercera nota ");
    	nota_3 = entrada.nextLine();
    	
    	//cambio a double
    	
    	nota1 = Double.parseDouble(nota_1);
    	nota2 = Double.parseDouble(nota_2);
    	nota3 = Double.parseDouble(nota_3);
    	
    	//proceso
    	
    	promedio = (nota1+nota2+nota3)/3;
    	
    	String pasa = promedio>=14 ? "pasa el año" : "no pasa el año";
    	System.out.printf("con el promedio %.2f usted %s",promedio,pasa);
    
    
    }
    
    
}
