package Exercicios.Test;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ControleCandidatos {
    public static void main(String[] args) {
        String[] candidatos = {"Aline", "Alceu", "Bruno", "Barbara", "Bruna"};
        for(String candidato : candidatos){
            tentativaContato(candidato);
        }
    }

    static void imprimirCandidatos() {
        String[] candidatos = {"Aline", "Alceu", "Bruno", "Barbara", "Bruna"};

        System.out.println("lista de candidatos aprovados no processo abaixo.");

        for (int i =0; i < candidatos.length; i ++) {
            System.out.println("O candidato nº" + i + "é " + candidatos[i]);

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

    static boolean ligar() {
        return new Random().nextInt(3) == 1;
    }

    static void tentativaContato(String candidato){
        int tentativa = 1;
        boolean continuarTentando = true;
        boolean ligacao = false;
        do {
            ligacao = ligar();
            continuarTentando = !ligacao;
            if(continuarTentando)
                tentativa++;
            else
            System.out.println("contato realizado com sucesso");

        } while (continuarTentando && tentativa <=3);
        if(ligacao) {
            System.out.println("conseguimos contato com " + candidato + " após " + tentativa + " tentativas");
        } else {
            System.out.println("não conseguimos contato com " + candidato);
        }

    }

}