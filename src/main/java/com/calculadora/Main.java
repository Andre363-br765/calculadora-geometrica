package com.calculadora;

import java.util.Scanner;

public class Main {
    // ---- Cálculos de área ----
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

    public static double areaLosango(double diagonalMaior, double diagonalMenor) {
        return (diagonalMaior * diagonalMenor) / 2.0;
    }

    public static double areaTrapezio(double baseMaior, double baseMenor, double altura) {
        return ((baseMaior + baseMenor) * altura) / 2.0;
    }

    // ---- Perímetros ----
    public static double perimetroQuadrado(double lado) {
        return 4 * lado;
    }

    public static double perimetroRetangulo(double largura, double altura) {
        return 2 * (largura + altura);
    }

    public static double perimetroCirculo(double raio) {
        return 2 * Math.PI * raio;
    }

    // ---- Volumes de sólidos ----
    public static double volumeCubo(double aresta) {
        return Math.pow(aresta, 3);
    }

    public static double volumeParalelepipedo(double largura, double altura, double profundidade) {
        return largura * altura * profundidade;
    }

    public static double volumeCilindro(double raio, double altura) {
        return areaCirculo(raio) * altura; // reutiliza a área do círculo
    }

    public static double volumeEsfera(double raio) {
        return (4.0/3.0) * Math.PI * Math.pow(raio, 3);
    }

    // ---- Utilitários de leitura (com validação) ----
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

    // ---- Programa principal ----
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Calculadora Geométrica ===");
            System.out.println("1) Área do quadrado");
            System.out.println("2) Área do retângulo");
            System.out.println("3) Área do triângulo");
            System.out.println("4) Área do círculo");
            System.out.println("5) Área do losango");
            System.out.println("6) Área do trapézio");
            System.out.println("7) Perímetro do quadrado");
            System.out.println("8) Perímetro do retângulo");
            System.out.println("9) Perímetro do círculo");
            System.out.println("10) Volume do cubo");
            System.out.println("11) Volume do paralelepípedo");
            System.out.println("12) Volume do cilindro");
            System.out.println("13) Volume da esfera");
            System.out.println("0) Sair");

            int opcao = lerOpcao(sc, 0, 13);

            if (opcao == 0) {
                System.out.println("Programa encerrado ✅");
                break;
            }

            switch (opcao) {
                case 1 -> {
                    double lado = lerDoublePositivo(sc, "Lado do quadrado (cm): ");
                    System.out.printf("Área do quadrado: %.2f cm²%n", areaQuadrado(lado));
                }
                case 2 -> {
                    double largura = lerDoublePositivo(sc, "Largura do retângulo (cm): ");
                    double altura = lerDoublePositivo(sc, "Altura do retângulo (cm): ");
                    System.out.printf("Área do retângulo: %.2f cm²%n", areaRetangulo(largura, altura));
                }
                case 3 -> {
                    double base = lerDoublePositivo(sc, "Base do triângulo (cm): ");
                    double altura = lerDoublePositivo(sc, "Altura do triângulo (cm): ");
                    System.out.printf("Área do triângulo: %.2f cm²%n", areaTriangulo(base, altura));
                }
                case 4 -> {
                    double raio = lerDoublePositivo(sc, "Raio do círculo (cm): ");
                    System.out.printf("Área do círculo: %.2f cm²%n", areaCirculo(raio));
                }
                case 5 -> {
                    double dMaior = lerDoublePositivo(sc, "Diagonal maior do losango (cm): ");
                    double dMenor = lerDoublePositivo(sc, "Diagonal menor do losango (cm): ");
                    System.out.printf("Área do losango: %.2f cm²%n", areaLosango(dMaior, dMenor));
                }
                case 6 -> {
                    double baseMaior = lerDoublePositivo(sc, "Base maior do trapézio (cm): ");
                    double baseMenor = lerDoublePositivo(sc, "Base menor do trapézio (cm): ");
                    double altura = lerDoublePositivo(sc, "Altura do trapézio (cm): ");
                    System.out.printf("Área do trapézio: %.2f cm²%n", areaTrapezio(baseMaior, baseMenor, altura));
                }
                case 7 -> {
                    double lado = lerDoublePositivo(sc, "Lado do quadrado (cm): ");
                    System.out.printf("Perímetro do quadrado: %.2f cm%n", perimetroQuadrado(lado));
                }
                case 8 -> {
                    double largura = lerDoublePositivo(sc, "Largura do retângulo (cm): ");
                    double altura = lerDoublePositivo(sc, "Altura do retângulo (cm): ");
                    System.out.printf("Perímetro do retângulo: %.2f cm%n", perimetroRetangulo(largura, altura));
                }
                case 9 -> {
                    double raio = lerDoublePositivo(sc, "Raio do círculo (cm): ");
                    System.out.printf("Perímetro do círculo: %.2f cm%n", perimetroCirculo(raio));
                }
                case 10 -> {
                    double aresta = lerDoublePositivo(sc, "Aresta do cubo (cm): ");
                    System.out.printf("Volume do cubo: %.2f cm³%n", volumeCubo(aresta));
                }
                case 11 -> {
                    double largura = lerDoublePositivo(sc, "Largura (cm): ");
                    double altura = lerDoublePositivo(sc, "Altura (cm): ");
                    double profundidade = lerDoublePositivo(sc, "Profundidade (cm): ");
                    System.out.printf("Volume do paralelepípedo: %.2f cm³%n", volumeParalelepipedo(largura, altura, profundidade));
                }
                case 12 -> {
                    double raio = lerDoublePositivo(sc, "Raio do cilindro (cm): ");
                    double altura = lerDoublePositivo(sc, "Altura do cilindro (cm): ");
                    System.out.printf("Volume do cilindro: %.2f cm³%n", volumeCilindro(raio, altura));
                }
                case 13 -> {
                    double raio = lerDoublePositivo(sc, "Raio da esfera (cm): ");
                    System.out.printf("Volume da esfera: %.2f cm³%n", volumeEsfera(raio));
                }
            }
        }

        sc.close();
    }
}