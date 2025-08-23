package com.calculadora.controle;

import com.calculadora.util.Leitor;
import com.calculadora.operacoes.volume.*;
import java.util.Scanner;

public class GerenciadorVolume {
    public static void executar(int opcao, Scanner sc) {
        switch (opcao) {
            case 10 -> {
                double aresta = Leitor.lerDoublePositivo(sc, "Aresta (cm): ");
                System.out.printf("Volume do cubo: %.2f cm³%n", VolumeCubo.calcular(aresta));
            }
            case 11 -> {
                double largura = Leitor.lerDoublePositivo(sc, "Largura (cm): ");
                double altura = Leitor.lerDoublePositivo(sc, "Altura (cm): ");
                double profundidade = Leitor.lerDoublePositivo(sc, "Profundidade (cm): ");
                System.out.printf("Volume do paralelepípedo: %.2f cm³%n", VolumeParalelepipedo.calcular(largura, altura, profundidade));
            }
            case 12 -> {
                double raio = Leitor.lerDoublePositivo(sc, "Raio (cm): ");
                double altura = Leitor.lerDoublePositivo(sc, "Altura (cm): ");
                System.out.printf("Volume do cilindro: %.2f cm³%n", VolumeCilindro.calcular(raio, altura));
            }
            case 13 -> {
                double raio = Leitor.lerDoublePositivo(sc, "Raio (cm): ");
                System.out.printf("Volume da esfera: %.2f cm³%n", VolumeEsfera.calcular(raio));
            }
        }
    }
}
