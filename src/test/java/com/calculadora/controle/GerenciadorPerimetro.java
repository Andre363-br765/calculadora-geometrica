package com.calculadora.controle;

import com.calculadora.util.Leitor;
import com.calculadora.operacoes.perimetro.*;
import java.util.Scanner;

public class GerenciadorPerimetro {
    public static void executar(int opcao, Scanner sc) {
        switch (opcao) {
            case 7 -> {
                double lado = Leitor.lerDoublePositivo(sc, "Lado (cm): ");
                System.out.printf("Perímetro do quadrado: %.2f cm%n", PerimetroQuadrado.calcular(lado));
            }
            case 8 -> {
                double largura = Leitor.lerDoublePositivo(sc, "Largura (cm): ");
                double altura = Leitor.lerDoublePositivo(sc, "Altura (cm): ");
                System.out.printf("Perímetro do retângulo: %.2f cm%n", PerimetroRetangulo.calcular(largura, altura));
            }
            case 9 -> {
                double raio = Leitor.lerDoublePositivo(sc, "Raio (cm): ");
                System.out.printf("Perímetro do círculo: %.2f cm%n", PerimetroCirculo.calcular(raio));
            }
        }
    }
}
