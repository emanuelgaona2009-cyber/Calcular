package menu.cal;

import java.util.Scanner;

public class resta {
    
    public void restar(){
        
        Scanner entrada = new Scanner(System.in);
        
        int a, b;
        
        System.out.println("Ingreas valor a: ");
        a = entrada.nextInt();
        
        System.out.println("Ingreas valor b: ");
        b = entrada.nextInt();
        
        int resta = a-b;
                
        System.out.println("El resultado de la resta es: "+resta);

    }
}
