package lanzamiento_moneda;
import java.util.Random;
public class Lanzamiento_moneda {    
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(2);
        System.out.println("El resultado es: " );
        if (i == 0) {
                         System.out.println ("Aguila");
        } 
        else  {
                         System.out.println ("Sol");
        }
 
                 
    }
}
