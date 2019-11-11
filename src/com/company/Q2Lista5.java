package com.company;

import java.util.Scanner;

public class Q2Lista5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[3];
        int maior = 0;
        for(int i=0;i<vetor.length;i++){
            System.out.println("Informe o valor do vetor: ");
            vetor[i] = sc.nextInt();

            if(maior < vetor[i]){
                maior = vetor[i];
            }
        }
        System.out.println("O maior numero foi de: "+maior);
    }
}