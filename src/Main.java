

public class Main {

	public static void main(String[] args) {
		
		Cliente pessoa = new Cliente();
		pessoa.setNome("Eriton");
		
		Conta cc = new ContaCorrente(pessoa);	
		Conta poupanca = new ContaPoupanca(pessoa);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
