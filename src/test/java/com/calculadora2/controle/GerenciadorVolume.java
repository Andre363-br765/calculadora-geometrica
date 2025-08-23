package com.calculadora2.controle;

import com.calculadora2.io.Saida2;
import com.calculadora2.io.Leitor2;
import com.calculadora.operacoes.volume.*;

import java.util.Scanner;

public class GerenciadorVolume {

    public static void executar(Scanner sc) {
        while (true) {
            System.out.println("\n=== Menu de Volumes ===");
            System.out.println("1) Cubo");
            System.out.println("2) Paralelepípedo");
            System.out.println("3) Cilindro");
            System.out.println("4) Esfera");
            System.out.println("0) Voltar");

            int opcao = Leitor2.lerOpcao(sc, 0, 4);
            if (opcao == 0) break;

            switch (opcao) {
                case 1 -> {
                    double aresta = Leitor2.lerDoublePositivo(sc, "Aresta (cm): ");
                    double resultado = VolumeCubo.calcular(aresta);
                    Saida2.mostrarVolume("cubo", resultado);
                }
                case 2 -> {
                    double largura = Leitor2.lerDoublePositivo(sc, "Largura (cm): ");
                    double altura = Leitor2.lerDoublePositivo(sc, "Altura (cm): ");
                    double profundidade = Leitor2.lerDoublePositivo(sc, "Profundidade (cm): ");
                    double resultado = VolumeParalelepipedo.calcular(largura, altura, profundidade);
                    Saida2.mostrarVolume("paralelepípedo", resultado);
                }
                case 3 -> {
                    double raio = Leitor2.lerDoublePositivo(sc, "Raio (cm): ");
                    double altura = Leitor2.lerDoublePositivo(sc, "Altura (cm): ");
                    double resultado = VolumeCilindro.calcular(raio, altura);
                    Saida2.mostrarVolume("cilindro", resultado);
                }
                case 4 -> {
                    double raio = Leitor2.lerDoublePositivo(sc, "Raio (cm): ");
                    double resultado = VolumeEsfera.calcular(raio);
                    Saida2.mostrarVolume("esfera", resultado);
                }
            }
        }
    }
}
