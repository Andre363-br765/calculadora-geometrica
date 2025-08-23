package com.calculadora2.controle;

import com.calculadora2.io.Leitor2;
import com.calculadora2.io.Saida2;
import com.calculadora.operacoes.area.*;

import java.util.Scanner;

public class GerenciadorArea {

    public static void executar(Scanner sc) {
        while (true) {
            System.out.println("\n=== Menu de Áreas ===");
            System.out.println("1) Quadrado");
            System.out.println("2) Retângulo");
            System.out.println("3) Triângulo");
            System.out.println("4) Círculo");
            System.out.println("5) Losango");
            System.out.println("6) Trapézio");
            System.out.println("0) Voltar");

            int opcao = Leitor2.lerOpcao(sc, 0, 6);
            if (opcao == 0) break;

            switch (opcao) {
                case 1 -> {
                    double lado = Leitor2.lerDoublePositivo(sc, "Lado do quadrado (cm): ");
                    double resultado = AreaQuadrado.calcular(lado);
                    Saida2.mostrarArea("quadrado", resultado);
                }
                case 2 -> {
                    double largura = Leitor2.lerDoublePositivo(sc, "Largura (cm): ");
                    double altura = Leitor2.lerDoublePositivo(sc, "Altura (cm): ");
                    double resultado = AreaRetangulo.calcular(largura, altura);
                    Saida2.mostrarArea("retângulo", resultado);
                }
                case 3 -> {
                    double base = Leitor2.lerDoublePositivo(sc, "Base (cm): ");
                    double altura = Leitor2.lerDoublePositivo(sc, "Altura (cm): ");
                    double resultado = AreaTriangulo.calcular(base, altura);
                    Saida2.mostrarArea("triângulo", resultado);
                }
                case 4 -> {
                    double raio = Leitor2.lerDoublePositivo(sc, "Raio (cm): ");
                    double resultado = AreaCirculo.calcular(raio);
                    Saida2.mostrarArea("círculo", resultado);
                }
                case 5 -> {
                    double dMaior = Leitor2.lerDoublePositivo(sc, "Diagonal maior (cm): ");
                    double dMenor = Leitor2.lerDoublePositivo(sc, "Diagonal menor (cm): ");
                    double resultado = AreaLosango.calcular(dMaior, dMenor);
                    Saida2.mostrarArea("losango", resultado);
                }
                case 6 -> {
                    double baseMaior = Leitor2.lerDoublePositivo(sc, "Base maior (cm): ");
                    double baseMenor = Leitor2.lerDoublePositivo(sc, "Base menor (cm): ");
                    double altura = Leitor2.lerDoublePositivo(sc, "Altura (cm): ");
                    double resultado = AreaTrapezio.calcular(baseMaior, baseMenor, altura);
                    Saida2.mostrarArea("trapézio", resultado);
                }
            }
        }
    }
}
