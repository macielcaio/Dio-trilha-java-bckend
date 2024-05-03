package com.candidatura;
public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Processo seletivo");
       
        System.out.println("Candidato 01");
        analisarcandidato(1900.0);
        
        System.out.println("Candidato 02");
        analisarcandidato(2200.0);
        
        System.out.println("Candidato 03");
        analisarcandidato(2000.0);
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
