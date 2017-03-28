
package algoritmoifandelse;

import java.util.Scanner;


public class Exercicio11Lista {
    public static void main(String[] args) {
        int a;
        Scanner console = new Scanner(System.in);
        System.out.println("Digite o valor: ");
        a = console.nextInt();
        
        if(a >0) {
            System.out.println("Você inseriu um valor positivo.");
        } else {
            System.out.println("Voce inseriu um valor negativo.");
        }
        
    }
    
}
