import java.util.Scanner;
public class DesviacionEstandar {

 public static void main(String[] args) {
  //definición  de variables 
  double valor [] = new double[10];
  int sumatoria = 0;
  float media = 0;
  double varianza = 0.0;
  double desviacion= 0.0; 
   
  Scanner entrada = new Scanner(System.in);
                
  
  System.out .println("Ingrese el valor de 10 numeros"
                                     +" como muestra");
  
  for (int i = 0; i < 10; i++ ){
   
   System.out.print("Ingrese el valor " + (i + 1) + ":");
   valor[i] = entrada.nextInt();
   
   sumatoria = sumatoria + (int) valor[i];
    
  }
  entrada.close();
  
  media = sumatoria / 10; 
  for(int i = 0 ; i < 10; i++){
   double rango;
   rango = Math.pow(valor[i] - media, 2f);
   varianza = varianza + rango;
  }
  varianza = varianza / 10f;
  desviacion = Math.sqrt(varianza);
  System.out.println("Desvianción Estándar: " + desviacion);
 }

}
