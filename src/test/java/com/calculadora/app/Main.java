package com.calculadora.app;

import com.calculadora.util.Leitor;
import com.calculadora.controle.GerenciadorArea;
import com.calculadora.controle.GerenciadorPerimetro;
import com.calculadora.controle.GerenciadorVolume;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            Menu.exibir();
            int opcao = Leitor.lerOpcao(sc, 0, 13);

            if (opcao == 0) {
                System.out.println("Programa encerrado ✅");
                break;
            }

            if (opcao >= 1 && opcao <= 6) {
                GerenciadorArea.executar(opcao, sc);
            } else if (opcao >= 7 && opcao <= 9) {
                GerenciadorPerimetro.executar(opcao, sc);
            } else {
                GerenciadorVolume.executar(opcao, sc);
            }
        }

        sc.close();
    }
}
