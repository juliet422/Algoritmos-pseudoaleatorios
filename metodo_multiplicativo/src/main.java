// Nota, este algoritmo trabaja con numeros mayores a 3 digitos tanto para la semilla como para la constante multiplicativa
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int semilla, constante, repeticiones;
        
        System.out.print("Digite una semilla: ");
        semilla = entrada.nextInt();
        
        System.out.print("Digite una constante multiplicativa: ");
        constante = entrada.nextInt();
        
        System.out.print("Digite el numero de iteraciones que desea realizar: ");
        repeticiones = entrada.nextInt();

        int valor_medio[] = new int[4], val_medio;
        for (int i = 0; i < repeticiones; i++) {
            valor_medio = multiplicativo(semilla, constante);
            val_medio = nueva_semilla(valor_medio);
            System.out.printf("Y%d (%d) (%d) = %d; X%d = %d; r%d = 0.%d\n", i , constante, semilla, constante * semilla, 
                    i + 1, val_medio, i + 1, val_medio);
            semilla = val_medio;
        }
    }    
    public static int nueva_semilla(int[] arr) {
        String unionString = "";
        int union = 0; 
        for(int i = 0; i < arr.length; i++) {
            unionString += arr[i];
        }
        union = Integer.parseInt(unionString);
        return union; 
    }
    
    public static int[] multiplicativo(int semilla, int constante){
        int tam_sec = 0, secuencia, temp, temp2, digito, index = 0, inicio, fin, cont = 0;
        secuencia = semilla * constante;
        temp = temp2 = secuencia;
        
        // Ciclo para calcular el numero de digitos de la semilla
        while(temp > 0) {
            tam_sec++;
            temp /= 10;
        }
        
        // El primer arreglo es para separar los digitos de la semilla y el segundo es para almacenar los 4 digitos del centro
        int digit_sec[] = new int[tam_sec], valor_medio[] = new int[4];
        
        while(temp2 > 0) {
            digito = temp2 % 10;
            digit_sec[index] = digito;
            index++;
            temp2 /= 10;
        }
        
        inicio = (tam_sec - 4) / 2;
        fin = (tam_sec - inicio) - 1;
        
        for (int i = digit_sec.length; i > 1; i--) {
            if (i >= inicio && i <= fin) {
                valor_medio[cont] = digit_sec[i];
                cont++;
            }
        }
        return valor_medio;
    }
}