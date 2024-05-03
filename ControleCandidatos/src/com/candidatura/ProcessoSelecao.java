package com.candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSelecao {

    public static void main(String[] args) {
        //Array de candidatos
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO"};
        //Lógica de sleeção
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) { 
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.printf("O candidato %s tem um salário pretendido de R$ %.2f%n", candidato, salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para vaga!");
                candidatosSelecionados++;
            }else if (salarioBase < salarioPretendido) {
                System.out.println("O candidato " + candidato + " não foi selecionado para vaga");
            }
            candidatoAtual++;
        }

    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarcandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        }
        else if(salarioBase==salarioPretendido){
            System.out.println("Ligar para candidato com contra proposta");
        }
        else{
            System.out.println("Aguardando resultado dos demais candidatos");   
        }
    }

}
