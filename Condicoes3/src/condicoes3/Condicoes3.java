
package condicoes3;

import java.util.Scanner;

public class Condicoes3 {

    
    public static void main(String[] args) {
       
        Scanner leia = new Scanner (System.in);
       System.out.println ("Informe um número");
       
       int numero = leia.nextInt();
       
       if (numero % 2 == 0) {
           System.out.println ("Número par");
       } else {
           System.out.println("Número impar");
       }
    }
    
}
