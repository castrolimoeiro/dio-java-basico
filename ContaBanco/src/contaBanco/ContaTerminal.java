package contaBanco;

import java.util.Scanner;

public class ContaTerminal {
	private int numeroConta;
	private String agencia;
	private String nomeCliente;
	private double saldo;
	Scanner sc = new Scanner (System.in);
	
	
	public void numeroConta() {
		System.out.print("Digite o número da conta: ");
		int conta = sc.nextInt();
		this.numeroConta = conta;
	}
	
	public void agencia() {
		System.out.print("Digite a agência: ");
		String agencia = sc.nextLine();
		this.agencia = agencia;
	}
	
	public void nomeCliente() {
		System.out.print("Digite o nome do cliente: ");
		String nomeCliente = sc.nextLine();
		this.nomeCliente = nomeCliente;
	}
	
	public void saldo() {
		System.out.print("Digite o valor que deseja depositar: ");
		double saldo = sc.nextDouble();
		while(saldo<0) {
			System.out.println("Deposite um valor válido!");
			System.out.print("Digite o valor que deseja depositar: ");
			saldo = sc.nextDouble();
		}
		this.saldo = saldo;
	}

	public int getNumeroConta() {
		return numeroConta;
	}


	public String getAgencia() {
		return agencia;
	}


	public String getNomeCliente() {
		return nomeCliente;
	}


	public double getSaldo() {
		return saldo;
	}
}


