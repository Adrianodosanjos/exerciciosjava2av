package com.company;

import java.util.Scanner;

public class Q2Lista7 {
    public static String calcSemana(int codigoSemana) {
        switch(codigoSemana){
            case 1:
                return "Domingo";
            case 2:
                return "Segunda-Feira";
            case 3:
                return "Terça-Feira";
            case 4:
                return "Quarta-Feira";
            case 5:
                return "Quinta-Feira";
            case 6:
                return "Sexta-Feira";
            case 7:
                return "Sábado";

            default:
                return "";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Dados
        System.out.println("Informe o 'código' da semana: ");
        int codigoSemana = sc.nextInt();
        //Verificador do dia
        String semana = calcSemana(codigoSemana);
       //Saída de dados
        System.out.println("O dia da semana é " + semana);
    }
}