/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package processoseletivo;

/**
 *
 * @author lfriq
 */
public class ImprimirSelecionados {
    
    public static void main(String[] args) {
        imprimirSelecionados();
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
    
}
