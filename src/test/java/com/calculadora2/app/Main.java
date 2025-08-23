package com.calculadora2.app;

import com.calculadora2.controle.*;
import com.calculadora2.io.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            mostrarMenuPrincipal();
            int opcao = Leitor2.lerOpcao(sc, 0, 3);

            switch (opcao) {
                case 1 -> GerenciadorArea.executar(sc);
                case 2 -> GerenciadorPerimetro.executar(sc);
                case 3 -> GerenciadorVolume.executar(sc);
                case 0 -> {
                    Saida2.mostrarMensagemEncerramento();
                    sc.close();
                    return;
                }
            }
        }
    }

    private static void mostrarMenuPrincipal() {
        System.out.println("\n=== Calculadora Geométrica ===");
        System.out.println("1) Área");
        System.out.println("2) Perímetro");
        System.out.println("3) Volume");
        System.out.println("0) Sair");
    }
}
