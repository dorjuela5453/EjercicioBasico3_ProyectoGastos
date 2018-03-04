import java.util.Scanner;


public class Presupuesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner entrada= new Scanner(System.in);
		
		System.out.print("Digite sus Ingresos:");	
		
		
	double Salario= entrada.nextDouble();
	
	System.out.println("Bien Hecho!!");
	
	
	System.out.print("¿Cuantos dias trabajo en el mes?");
	
	Double diaslaborados=entrada.nextDouble();
	
	
	System.out.print("Ingrese gasto de transporte" );
	
	double transporte= entrada.nextDouble();
	
	System.out.print("Ingrese gasto de alimentacion" );
	
	double alimentacion=entrada.nextDouble();
	
		
	System.out.print("Ingrese otros gastos" );
	

	double otros=entrada.nextDouble();
	
	
	double gastosmes=(transporte+alimentacion+otros)*diaslaborados;
	
	double saldo=Salario-gastosmes;
	
	System.out.println(" Su gasto mensual es de:"+gastosmes);
	
	System.out.println(" Su saldo es de:"+ saldo);
	
	
	
	
	
	
	}
	
	}

	   
	   
	   



