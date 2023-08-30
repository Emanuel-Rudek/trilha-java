package Exercicios.DesafioControlFluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha dois números. Obs- o 2º número deve ser maior que o 1º");
        int parametro1 = scanner.nextInt();
        int parametro2 = scanner.nextInt();
        try {
            int Subtracao = contar(parametro1, parametro2);
            System.out.println("o resultado da subtração de: " + parametro2 + " - " + parametro1 + "| é: " + Subtracao);
            for (int i = 0; i < Subtracao; i++) {
                System.out.println("Interação nº" + (i +1));

            }
        } catch (ParametroInvalidoException e) {
            System.out.println("Erro: ParameterInvalidException " + e.getMessage());
         }


    }

    static int contar(int parametro1, int parametro2) throws ParametroInvalidoException{
        if(parametro2 <= parametro1){
            throw new ParametroInvalidoException("O 2º número deve ser maior que o 1º");
        }
        int contador = (parametro2 - parametro1);
        return contador;
    }
}
