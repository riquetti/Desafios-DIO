/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package processoseletivo;

import java.util.Random;

/**
 *
 * @author lfriq
 */
public class ContatoComSelecionados {

    public static void main(String[] args) {
        System.out.println("Processo Seletivo");
        String[] candidatos = {"Felipe", "João", "Luis", "Pedro", "Ricardo"};

        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("Contato Realizado com sucesso");
            }

        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa.\n");
        } else {
            System.out.println("Não conseguimos contato com " + candidato + " número maximo tentativas " + tentativasRealizadas + " realizadas.\n");
        }
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }
}
