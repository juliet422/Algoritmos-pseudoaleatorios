package simulacion;
import java.util.Scanner;
public class Algo_cuadrados {
    public static void main(String[] args) {
       Scanner datos=new Scanner(System.in);
       int semillaInicial, tamsemillainicial,repit, semElevada, tam_sem_elevado;
        System.out.println("Ingrese el valor de la semilla x0: ");
        semillaInicial=datos.nextInt();
        System.out.println("Ingrese numero de repeticiones Ri: ");
        repit=datos.nextInt();
        //verificar el tamaño de la semilla
        tamsemillainicial=String.valueOf(semillaInicial).length();
        String semNueva, semillaElevada;
        if(tamsemillainicial>3){
            //System.out.println("Funciones para calcular");
            //procemientos para calcular el calculo de la semilla y repeticiones
            for(int i=0; i<repit; i++){
                semElevada=(int) Math.pow(semillaInicial, 2);//elevar semilla al cuadrado
                semillaElevada=Integer.toString(semElevada);              
                tam_sem_elevado=semillaElevada.length();
                int primervalor=(tam_sem_elevado-tamsemillainicial)/2;               
                semNueva=semillaElevada.substring(primervalor,primervalor+tamsemillainicial);
                System.out.printf("\n" + "Y"+i + "="+semNueva+ "x"+(i+1)+"="+semNueva+"R"+(i+1)+"=0."+semNueva);
                //asignar la nueva semilla
                semillaInicial=Integer.parseInt(semNueva);
            }
            System.out.println("");
        }else{
            System.out.println("Ingrese una semilla mayor a 3 digitos");
        }
}}
