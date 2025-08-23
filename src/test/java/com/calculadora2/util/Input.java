package com.calculadora2.util;

import java.util.Scanner;

public class Input {

    public static int lerOpcao(Scanner sc, int min, int max) {
        while (true) {
            System.out.print("Escolha uma opção: ");
            String entrada = sc.next().trim();
            try {
                int op = Integer.parseInt(entrada);
                if (op >= min && op <= max) return op;
                System.out.printf("Opção deve estar entre %d e %d.%n", min, max);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
            }
        }
    }

    public static double lerDoublePositivo(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String entrada = sc.next().replace(",", ".").trim();
            try {
                double valor = Double.parseDouble(entrada);
                if (valor > 0) return valor;
                System.out.println("O valor deve ser maior que zero.");
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número.");
            }
        }
    }
}
