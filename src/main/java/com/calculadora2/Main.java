package com.calculadora2;

import java.util.Scanner;

public class Main {

    // --- Funções de cálculo (mantidas do seu código original) ---
    public static double areaQuadrado(double lado) {
        return lado * lado;
    }

    public static double areaRetangulo(double largura, double altura) {
        return largura * altura;
    }

    public static double areaTriangulo(double base, double altura) {
        return (base * altura) / 2.0;
    }

    public static double areaCirculo(double raio) {
        return Math.PI * raio * raio;
    }

    public static double areaLosango(double dMaior, double dMenor) {
        return (dMaior * dMenor) / 2.0;
    }

    public static double areaTrapezio(double baseMaior, double baseMenor, double altura) {
        return ((baseMaior + baseMenor) * altura) / 2.0;
    }

    public static double perimetroQuadrado(double lado) {
        return 4 * lado;
    }

    public static double perimetroRetangulo(double largura, double altura) {
        return 2 * (largura + altura);
    }

    public static double perimetroCirculo(double raio) {
        return 2 * Math.PI * raio;
    }

    public static double volumeCubo(double aresta) {
        return Math.pow(aresta, 3);
    }

    public static double volumeParalelepipedo(double largura, double altura, double profundidade) {
        return largura * altura * profundidade;
    }

    public static double volumeCilindro(double raio, double altura) {
        return areaCirculo(raio) * altura;
    }

    public static double volumeEsfera(double raio) {
        return (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
    }

    // --- Funções de leitura ---
    private static int lerOpcao(Scanner sc, int min, int max) {
        while (true) {
            System.out.print("Escolha uma opção: ");
            String entrada = sc.next().trim();
            try {
                int op = Integer.parseInt(entrada);
                if (op >= min && op <= max)
                    return op;
                System.out.printf("Opção deve estar entre %d e %d.%n", min, max);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
            }
        }
    }

    private static double lerDoublePositivo(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            String entrada = sc.next().replace(",", ".").trim();
            try {
                double valor = Double.parseDouble(entrada);
                if (valor > 0)
                    return valor;
                System.out.println("O valor deve ser maior que zero.");
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número.");
            }
        }
    }

    // --- Submenus ---
    private static void menuArea(Scanner sc) {
        System.out.println("\n--- Menu de Áreas ---");
        System.out.println("1) Quadrado");
        System.out.println("2) Retângulo");
        System.out.println("3) Triângulo");
        System.out.println("4) Círculo");
        System.out.println("5) Losango");
        System.out.println("6) Trapézio");
        System.out.println("0) Voltar");

        int opcao = lerOpcao(sc, 0, 6);
        if (opcao == 0)
            return;

        switch (opcao) {
            case 1 -> {
                double lado = lerDoublePositivo(sc, "Lado do quadrado (cm): ");
                System.out.printf("Área do quadrado: %.2f cm²%n", areaQuadrado(lado));
            }
            case 2 -> {
                double largura = lerDoublePositivo(sc, "Largura (cm): ");
                double altura = lerDoublePositivo(sc, "Altura (cm): ");
                System.out.printf("Área do retângulo: %.2f cm²%n", areaRetangulo(largura, altura));
            }
            case 3 -> {
                double base = lerDoublePositivo(sc, "Base (cm): ");
                double altura = lerDoublePositivo(sc, "Altura (cm): ");
                System.out.printf("Área do triângulo: %.2f cm²%n", areaTriangulo(base, altura));
            }
            case 4 -> {
                double raio = lerDoublePositivo(sc, "Raio (cm): ");
                System.out.printf("Área do círculo: %.2f cm²%n", areaCirculo(raio));
            }
            case 5 -> {
                double dMaior = lerDoublePositivo(sc, "Diagonal maior (cm): ");
                double dMenor = lerDoublePositivo(sc, "Diagonal menor (cm): ");
                System.out.printf("Área do losango: %.2f cm²%n", areaLosango(dMaior, dMenor));
            }
            case 6 -> {
                double baseMaior = lerDoublePositivo(sc, "Base maior (cm): ");
                double baseMenor = lerDoublePositivo(sc, "Base menor (cm): ");
                double altura = lerDoublePositivo(sc, "Altura (cm): ");
                System.out.printf("Área do trapézio: %.2f cm²%n", areaTrapezio(baseMaior, baseMenor, altura));
            }
        }
    }

    private static void menuPerimetro(Scanner sc) {
        System.out.println("\n--- Menu de Perímetros ---");
        System.out.println("1) Quadrado");
        System.out.println("2) Retângulo");
        System.out.println("3) Círculo");
        System.out.println("0) Voltar");

        int opcao = lerOpcao(sc, 0, 3);
        if (opcao == 0)
            return;

        switch (opcao) {
            case 1 -> {
                double lado = lerDoublePositivo(sc, "Lado (cm): ");
                System.out.printf("Perímetro do quadrado: %.2f cm%n", perimetroQuadrado(lado));
            }
            case 2 -> {
                double largura = lerDoublePositivo(sc, "Largura (cm): ");
                double altura = lerDoublePositivo(sc, "Altura (cm): ");
                System.out.printf("Perímetro do retângulo: %.2f cm%n", perimetroRetangulo(largura, altura));
            }
            case 3 -> {
                double raio = lerDoublePositivo(sc, "Raio (cm): ");
                System.out.printf("Perímetro do círculo: %.2f cm%n", perimetroCirculo(raio));
            }
        }
    }

    private static void menuVolume(Scanner sc) {
        System.out.println("\n--- Menu de Volumes ---");
        System.out.println("1) Cubo");
        System.out.println("2) Paralelepípedo");
        System.out.println("3) Cilindro");
        System.out.println("4) Esfera");
        System.out.println("0) Voltar");

        int opcao = lerOpcao(sc, 0, 4);
        if (opcao == 0)
            return;

        switch (opcao) {
            case 1 -> {
                double aresta = lerDoublePositivo(sc, "Aresta (cm): ");
                System.out.printf("Volume do cubo: %.2f cm³%n", volumeCubo(aresta));
            }
            case 2 -> {
                double largura = lerDoublePositivo(sc, "Largura (cm): ");
                double altura = lerDoublePositivo(sc, "Altura (cm): ");
                double profundidade = lerDoublePositivo(sc, "Profundidade (cm): ");
                System.out.printf("Volume do paralelepípedo: %.2f cm³%n",
                        volumeParalelepipedo(largura, altura, profundidade));
            }
            case 3 -> {
                double raio = lerDoublePositivo(sc, "Raio (cm): ");
                double altura = lerDoublePositivo(sc, "Altura (cm): ");
                System.out.printf("Volume do cilindro: %.2f cm³%n", volumeCilindro(raio, altura));
            }
            case 4 -> {
                double raio = lerDoublePositivo(sc, "Raio (cm): ");
                System.out.printf("Volume da esfera: %.2f cm³%n", volumeEsfera(raio));
            }
        }
    }

    // --- Programa principal ---
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Calculadora Geométrica ===");
            System.out.println("1) Área");
            System.out.println("2) Perímetro");
            System.out.println("3) Volume");
            System.out.println("0) Sair");

            int opcao = lerOpcao(sc, 0, 3);

            if (opcao == 0) {
                System.out.println("Programa encerrado ✅");
                break;
            }

            switch (opcao) {
                case 1 -> menuArea(sc);
                case 2 -> menuPerimetro(sc);
                case 3 -> menuVolume(sc);
            }
        }

        sc.close();
    }
}
