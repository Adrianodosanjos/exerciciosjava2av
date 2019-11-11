package com.company;

import java.util.Scanner;

public class Q1Lista5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int vetor[] = new int[10];
        int i;

        for(i=0;i<=10;i++) {
            System.out.println("Entre com um número");
            vetor[i] = sc.nextInt();

        }
        System.out.println(vetor);
    }
}