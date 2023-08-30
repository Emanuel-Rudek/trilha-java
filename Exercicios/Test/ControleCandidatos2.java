package Exercicios.Test;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ControleCandidatos2 {
    public static void main(String[] args) {
        imprimirCandidatos();
    }



    static void imprimirCandidatos() {
        String[] candidatos = {"Aline", "Alceu", "Bruno", "Barbara", "Bruna"};

        System.out.println("lista de candidatos aprovados no processo abaixo.");

        for (int i =0; i < candidatos.length; i ++) {
            System.out.println("O candidato nº" + (i +1) + "é " + candidatos[i]);
        }
    }

    static void processoSeletivo() {
        String[] candidatos = {"Aline", "Alceu", "Bruno", "Barbara", "Bruna", "Claudio", "Cesar", "Ciro", "Clara", "Diana", "Dario", "Dirceu", "Eliana"};

        int candidatosSelecionado = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionado < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double valorVaga = salarioPretendido();
            System.out.println("Candidato" + candidato + ", Requiriu um salário de: " + valorVaga);
            if (valorVaga <= salarioBase) {
                System.out.println(candidato + " candidato(a) contratado(a)");
                candidatosSelecionado++;
            }
            candidatosAtual++;
        }
        if (candidatosSelecionado < 5) {
            System.out.println("candidatos exigindo mais que o proposto, realizar novas entrevistas");
        }
    }

    static double salarioPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analiseCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        String respostaCandidato = salarioBase > salarioPretendido ? "Ligar para o candidato" : (salarioBase == salarioPretendido ? "Ligar para o candidato com contra proposta" : "aguardando demais resultados");
        System.out.println(respostaCandidato);
    }
}



