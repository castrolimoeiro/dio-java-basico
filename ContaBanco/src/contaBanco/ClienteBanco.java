package contaBanco;

public class ClienteBanco {

	public static void main(String[] args) {
		ContaTerminal conta = new ContaTerminal();
		
		//Métodos para coletar os dados do cliente
		conta.nomeCliente();
		conta.agencia();
		conta.numeroConta();
		conta.saldo();
		
		// Exibir mensagens com a criação da conta
		System.out.println();
		
		System.out.println("Olá ," + conta.getNomeCliente()
				+ " obrigado por criar uma conta em nosso banco, "
				+ "sua agência é " + conta.getAgencia()
				+ " conta " + conta.getNumeroConta()
				+ " e seu saldo R$" + conta.getSaldo() + " já está disponível para saque.");
		
		
		// Forma alternativa para exibição de dados após conta criada
		/*System.out.println("Conta Criada");
		System.out.println("Cliente: " + conta.getNomeCliente());
		System.out.println("Agência: " + conta.getAgencia());
		System.out.println("Conta: " + conta.getNumeroConta());
		System.out.println("Saldo: " + conta.getSaldo());*/

		}

}
