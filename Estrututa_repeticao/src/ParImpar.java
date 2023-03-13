import java.util.Scanner;

/*
 * Faça um programa  que peça N números inteiros, 
 * calcule e mostre a quantidade de números pares
 * e a quantidade do números impares
 */

public class ParImpar {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);


       int quantNumeros;
       int numero;
       int quantPares=0, quantImpares=0;

       System.out.print("Quantidade de números: ");
       quantNumeros = scan.nextInt();

       int count= 0;
       do{
         System.out.print("Número ");
         numero = scan.nextInt();

         if(numero%2==0) quantPares++;
         else quantImpares++;

         count++;

       }while(count<quantNumeros);
       
       System.out.println("Quantidade de Números Pares: "+ quantPares);
       System.out.println("Quantidade de Números Imapres: "+ quantImpares);


        
    }
    
}
