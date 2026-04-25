package app;

import modelo.Caminhao;
import modelo.Moto;
import modelo.Pacote;
import modelo.Rota;

public class Principal {

    public static void main(String[] args) {

        System.out.println("===========================================");
        System.out.println("   SISTEMA DE ENTREGAS — DEMO             ");
        System.out.println("===========================================\n");

        // ── Entrega 1: pacote pesado via Caminhão ──
        Pacote pacote1 = new Pacote("BR999", 10.5);
        Caminhao caminhao = new Caminhao("ABC1D234", 5000.0, 4);

        Rota rota1 = new Rota(pacote1, caminhao);
        rota1.iniciar();
        rota1.finalizar();

        // ── Entrega 2: pacote pequeno via Moto com baú ──
        Pacote pacote2 = new Pacote("SP042", 2.3);
        Moto moto = new Moto("XYZ5E678", 50.0, true);

        Rota rota2 = new Rota(pacote2, moto);
        rota2.iniciar();
        rota2.finalizar();

        // ── Entrega 3: testar validação de erro ──
        System.out.println("--- Testando validação ---");
        try {
            Caminhao invalido = new Caminhao("", 3000.0, 4);
        } catch (IllegalArgumentException e) {
            System.out.println("✘ Erro capturado: " + e.getMessage());
        }

        try {
            Pacote pesoBruto = new Pacote("RJ007", -5.0);
        } catch (IllegalArgumentException e) {
            System.out.println("✘ Erro capturado: " + e.getMessage());
        }

        try {
            Caminhao poucoEixo = new Caminhao("DEF2G345", 2000.0, 1);
        } catch (IllegalArgumentException e) {
            System.out.println("✘ Erro capturado: " + e.getMessage());
        }

        System.out.println("\n===========================================");
        System.out.println("   FIM DA DEMONSTRAÇÃO                    ");
        System.out.println("===========================================");
    }
}