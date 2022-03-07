
public class ContaCorrente extends Conta {
	
	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}
	
	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}
	
	@Override
	public void depositar(double valor) {
		if(saldo < 0) {
			saldo = (saldo * 0.5) + valor ; // 0.5% taxa de juros devido saldo negativo.
		}
		else {
			saldo += valor;
		}
	}

	public void imprimirExtrato() {
		System.out.println(" ### Extrato Conta Corrente ###");
		super.imprimirExtrato();
	}
}