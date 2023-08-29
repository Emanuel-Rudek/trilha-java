package Exercicios.Test;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ControleCandidatos2 {
    public static void main(String[] args) {
        analiseCandidato(2300.0);
        analiseCandidato(2000.0);
        analiseCandidato(1900.0);
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



