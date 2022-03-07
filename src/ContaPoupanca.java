
public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}
	
	@Override
	public void depositar(double valor) {
		saldo = valor * 0.07 + valor + saldo; //0.07% taxa de juros da poupan�a
	}

	public void imprimirExtrato() {
		System.out.println(" ### Extrato Conta Poupan�a ###");
		super.imprimirExtrato();	
	}
}
