package com.mycompany.recuperacao.kleiton6;

import java.util.Scanner;

public class RECUPERACAOKLEITON6 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        double numero; double media;
        
        System.out.println("Digite um numero: ");
        numero = scanner.nextDouble();
        
        media = (numero + numero) / numero;
        
        System.out.println("A media foi de " + media);
        
        
        scanner.close();
    }
}
