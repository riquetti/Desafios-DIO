/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package processoseletivo;

/**
 *
 * @author lfriq
 */
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author lfriq
 */
public class ProcessoSeletivo {

    public static void main(String[] args) {
        System.out.println("Processo Seletivo");
        String[] candidatos = {"Felipe", "João", "Luis", "Pedro", "Ricardo"};
        
        for(String candidato:candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("Contato Realizado com sucesso");
            
        }while(continuarTentando && tentativasRealizadas < 3);
        
        if(atendeu)
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa.\n");
        else
            System.out.println("Não conseguimos contato com " + candidato + " número maximo tentativas " + tentativasRealizadas + " realizadas.\n");
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados() {
        String[] candidatos = {"Felipe", "João", "Luis", "Pedro", "Ricardo"};

        System.out.println("Imprimindo a lista de candidatos inforamndo o indice de elemento");

        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de nº " + (indice + 1) + " é " + candidatos[indice]);
        }

        System.out.println("Forma abreviada de interação for each");

        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }

    }

    static void selecaoCandidatos() {
        String[] candidatos = {"Felipe", "João", "Luis", "Pedro", "Ricardo", "Larissa", "Renata", "Alessandra", "Jonas", "Adriana"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + "Solicitou este valor de salário " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2100);
    }

    static void analisaCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
}


