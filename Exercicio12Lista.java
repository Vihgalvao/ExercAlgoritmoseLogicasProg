
package algoritmoifandelse;

import java.util.Scanner;


public class Exercicio12Lista {
    
    public static void main(String[] args) {
        double l,r, n1, n2;
        Scanner console = new Scanner(System.in);
        System.out.print("Insira o valor L: ");
        l = console.nextDouble();
        System.out.print("Insira o valor de R: ");
        r = console.nextDouble();
        
        n1 = 3.14*Math.pow(r,2);
        n2 = Math.pow(l,2);
        //System.out.println(n1  + " " +   n2);
        if(n1 > n2) {
            System.out.print(" A maior area é a do circulo: " + n1);
        } else { 
            System.out.print("A maior area é a do quadrado: " + n2);
        }
              
    }
}
