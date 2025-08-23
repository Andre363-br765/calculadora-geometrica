package com.calculadora.controle;

import com.calculadora.util.Leitor;
import com.calculadora.operacoes.area.*;
import java.util.Scanner;

public class GerenciadorArea {
    public static void executar(int opcao, Scanner sc) {
        switch (opcao) {
            case 1 -> {
                double lado = Leitor.lerDoublePositivo(sc, "Lado do quadrado (cm): ");
                System.out.printf("Área do quadrado: %.2f cm²%n", AreaQuadrado.calcular(lado));
            }
            case 2 -> {
                double largura = Leitor.lerDoublePositivo(sc, "Largura (cm): ");
                double altura = Leitor.lerDoublePositivo(sc, "Altura (cm): ");
                System.out.printf("Área do retângulo: %.2f cm²%n", AreaRetangulo.calcular(largura, altura));
            }
            case 3 -> {
                double base = Leitor.lerDoublePositivo(sc, "Base (cm): ");
                double altura = Leitor.lerDoublePositivo(sc, "Altura (cm): ");
                System.out.printf("Área do triângulo: %.2f cm²%n", AreaTriangulo.calcular(base, altura));
            }
            case 4 -> {
                double raio = Leitor.lerDoublePositivo(sc, "Raio (cm): ");
                System.out.printf("Área do círculo: %.2f cm²%n", AreaCirculo.calcular(raio));
            }
            case 5 -> {
                double dMaior = Leitor.lerDoublePositivo(sc, "Diagonal maior (cm): ");
                double dMenor = Leitor.lerDoublePositivo(sc, "Diagonal menor (cm): ");
                System.out.printf("Área do losango: %.2f cm²%n", AreaLosango.calcular(dMaior, dMenor));
            }
            case 6 -> {
                double baseMaior = Leitor.lerDoublePositivo(sc, "Base maior (cm): ");
                double baseMenor = Leitor.lerDoublePositivo(sc, "Base menor (cm): ");
                double altura = Leitor.lerDoublePositivo(sc, "Altura (cm): ");
                System.out.printf("Área do trapézio: %.2f cm²%n", AreaTrapezio.calcular(baseMaior, baseMenor, altura));
            }
        }
    }
}
