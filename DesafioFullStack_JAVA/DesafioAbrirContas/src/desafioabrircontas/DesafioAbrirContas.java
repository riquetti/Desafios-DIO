/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafioabrircontas;

import java.util.Scanner;

/**
 *
 * @author lfriq
 */
public class DesafioAbrirContas {


  public static void main(String[] args) {
    // Lendo os dados de Entrada:
    Scanner scanner = new Scanner(System.in);
    int numeroConta = scanner.nextInt();
    scanner.nextLine(); // Consome a quebra de linha após a entrada do número da conta
    String nomeTitular = scanner.nextLine();
    double saldo = Double.parseDouble(scanner.nextLine());

    //TODO: Criar uma instância de "ContaBancaria" com os valores de Entrada.

    System.out.println("Informacoes:");
    System.out.println("Conta: " + numeroConta);
    System.out.println("Titular: " + nomeTitular);
    System.out.println("Saldo: R$ " + saldo);
    //TODO: Imprimir as informações da conta usando o objeto criado no TODO acima.
  }
}

class ContaBancaria {
  int numero;
  String titular;
  double saldo;

  public ContaBancaria(int numero, String titular, double saldo) {
    this.numero = numero;
    this.titular = titular;
    this.saldo = saldo;
  }
}