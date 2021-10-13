
package clases;

import java.util.Scanner;


public class principal {
    public static void main(String[]org)
    {
        Scanner l=new Scanner(System.in);
        System.out.println("ingrese la semilla 1");
        int x1=l.nextInt();
        System.out.println("ingrese la semilla 2");
        int x2=l.nextInt();
        System.out.println("cuantas Iteraciones quiere");
        int n=l.nextInt();
        operaciones mo=new operaciones(x1,x2,n);
       mo.imprimir();
    }
}
