package com.company;

        import java.util.Scanner;

public class Q3Lista7 {
    public static String verificaParImpar(int numero) {
        if (numero%2 > 0){
            return "ímpar";
        }else{
            return "par";
        }
    }
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número");
        int numero = sc.nextInt();
        String resultado = verificaParImpar(numero);
        System.out.println("O número " + numero + " é " + resultado);
    }
}
