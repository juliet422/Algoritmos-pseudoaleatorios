
package congruencial_multiplicativo;

import java.util.Scanner;

public class Congruencial_multiplicativo {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);        
int semilla, cmultiplicativa,modulo; 
int i, numero;  
double numero2;  

System.out.print("Escriba una semilla: ");
semilla = entrada.nextInt();
System.out.print("Escriba una constante multiplicativa: ");
cmultiplicativa= entrada.nextInt();
System.out.print("Escriba el módulo: ");
modulo = entrada.nextInt();

for (i=1; i<=20; i++){
   numero = (cmultiplicativa*semilla) % modulo;   
   numero2 = (double)numero / (double)(modulo-1);
   System.out.printf("%d. %d (%.4f)\n", i ,numero ,numero2 ); 
   semilla = numero;  
}

    }
    
}
