package com.candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSelecao {

    public static void main(String[] args) {
        //Array de candidatos
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO"};
            for (String candidato : candidatos) {
                entrandoEmContato(candidato);
            }
    }
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuaTentando = true;
        boolean atendeu = false;
        do { 
            atendeu = atender();
            continuaTentando = !atendeu;
            if (continuaTentando) {
                tentativasRealizadas++;
            }
        } while (continuaTentando && tentativasRealizadas < 3 );
            if(atendeu){
                System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa");
            }else{
                System.out.println("Não conseguimos contato com " + candidato + " após " + tentativasRealizadas + " tentativas realizadas");
            }
    }
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void selecionaCandidatos(){
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

    static void imprimeSelecionados(){
            //Array de candidatos
            String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO"};
            System.out.println("Imprimindo a lista de selecionados e informando o indice dos elementos");

            for (int indice = 0; indice < candidatos.length; indice++) {
                System.out.println("O candidato de número " + (indice+1) + " é o " + candidatos[indice]);                
            }

    }

}
