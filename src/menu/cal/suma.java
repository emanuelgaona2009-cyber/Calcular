package menu.cal;

import java.util.Scanner;

public class suma {
    
    
   public void sumar(){
    Scanner entrada = new Scanner(System.in);
        
    int a, b;
    
        System.out.println("Ingreas valor a: ");
        a = entrada.nextInt();
        
        System.out.println("Ingreas valor b: ");
        b = entrada.nextInt();
        
        int suma = a+b;
                
        System.out.println("El resultado de la suma es: "+suma);
        
        
   }
        
}
