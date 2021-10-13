package lanzamiento_dado;

import java.util.Random;

public class Lanzamiento_dado {
    public static void main(String[] args) { 
        Random rand = new Random();
        int randn = 1+ rand.nextInt((6-1) + 1);
        
        System.out.println("El resultado del dado es: "+randn);
        } 
        
    }
    

