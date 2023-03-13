package Arrays;
/*
 * Faça um programa que leia 20 numeros  inteiros aleatorios (entre 0 e 100) armazene-os nume vetor.
 * Ao final mostre os números e seus sucessores.
 */

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAletaorios = new int[20];

        for(int i=0; i<numerosAletaorios.length; i++ ){
            int numero = random.nextInt(100);
            numerosAletaorios[i]= numero;
        }
        System.out.print("Numeros Aletaorios: ");
        for (int numero : numerosAletaorios) {
            System.out.print(numero + " ");
            
        }
        System.out.print("Sucessores dos Numeros Aletaorios: ");
        for (int numero : numerosAletaorios) {
            System.out.print((numero+1)+ " ");
    }
    System.out.print("Antecesssor dos Numeros Aletaorios: ");
    for (int numero : numerosAletaorios) {
        System.out.print((numero-1)+ " ");
}
    }
}
