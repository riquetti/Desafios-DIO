/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package processoseletivo;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author lfriq
 */
public class SelecaoCandidatos {

    public static void main(String[] args) {
        selecaoCandidatos();
    }

    static void selecaoCandidatos() {
        String[] candidatos = {"Felipe", "João", "Luis", "Pedro", "Ricardo", "Larissa", "Renata", "Alessandra", "Jonas", "Adriana"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga ");
                candidatosSelecionados++;
            } else {
                System.out.println("O candidato não foi selecionado");
                candidatoAtual++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return Math.round(ThreadLocalRandom.current().nextDouble(1800, 2100));
    }
}
