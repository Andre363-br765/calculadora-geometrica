package com.calculadora2.io;

public class Saida2 {

    // Exibe mensagem de encerramento do programa
    public static void mostrarMensagemEncerramento() {
        System.out.println("Programa encerrado ✅");
    }

    // Exibe uma área com formatação
    public static void mostrarArea(String nomeFigura, double resultado) {
        System.out.printf("Área do %s: %.2f cm²%n", nomeFigura, resultado);
    }

    // Exibe um perímetro com formatação
    public static void mostrarPerimetro(String nomeFigura, double resultado) {
        System.out.printf("Perímetro do %s: %.2f cm%n", nomeFigura, resultado);
    }

    // Exibe um volume com formatação
    public static void mostrarVolume(String nomeFigura, double resultado) {
        System.out.printf("Volume do %s: %.2f cm³%n", nomeFigura, resultado);
    }

    // Mensagem genérica de informação
    public static void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
