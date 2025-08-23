package com.calculadora2.util;

public class Geometria {

    // --- Áreas ---
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

    // --- Perímetros ---
    public static double perimetroQuadrado(double lado) {
        return 4 * lado;
    }

    public static double perimetroRetangulo(double largura, double altura) {
        return 2 * (largura + altura);
    }

    public static double perimetroCirculo(double raio) {
        return 2 * Math.PI * raio;
    }

    // --- Volumes ---
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
}
