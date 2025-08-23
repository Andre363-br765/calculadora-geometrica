package com.calculadora2.controle;

import com.calculadora2.io.Leitor2;
import com.calculadora2.io.Saida2;
import com.calculadora.operacoes.perimetro.*;

import java.util.Scanner;

public class GerenciadorPerimetro {

    public static void executar(Scanner sc) {
        while (true) {
            System.out.println("\n=== Menu de Perímetros ===");
            System.out.println("1) Quadrado");
            System.out.println("2) Retângulo");
            System.out.println("3) Círculo");
            System.out.println("0) Voltar");

            int opcao = Leitor2.lerOpcao(sc, 0, 3);
            if (opcao == 0) break;

            switch (opcao) {
                case 1 -> {
                    double lado = Leitor2.lerDoublePositivo(sc, "Lado (cm): ");
                    double resultado = PerimetroQuadrado.calcular(lado);
                    Saida2.mostrarPerimetro("quadrado", resultado);
                }
                case 2 -> {
                    double largura = Leitor2.lerDoublePositivo(sc, "Largura (cm): ");
                    double altura = Leitor2.lerDoublePositivo(sc, "Altura (cm): ");
                    double resultado = PerimetroRetangulo.calcular(largura, altura);
                    Saida2.mostrarPerimetro("retângulo", resultado);
                }
                case 3 -> {
                    double raio = Leitor2.lerDoublePositivo(sc, "Raio (cm): ");
                    double resultado = PerimetroCirculo.calcular(raio);
                    Saida2.mostrarPerimetro("círculo", resultado);
                }
            }
        }
    }
}
