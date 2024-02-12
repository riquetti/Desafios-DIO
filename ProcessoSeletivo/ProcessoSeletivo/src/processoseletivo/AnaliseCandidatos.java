/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package processoseletivo;

/**
 *
 * @author lfriq
 */
public class AnaliseCandidatos {
        public static void main(String[] args) {
        analisaCandidato(1900);
        analisaCandidato(2200);
        analisaCandidato(2000);
        
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
