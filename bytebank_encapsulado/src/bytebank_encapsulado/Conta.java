package bytebank_encapsulado;

public class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Clinte titular;
	private static int total;

	
	public Conta (int agencia, int numero){
		
		Conta.total++;
		System.out.println("o total de contas e "  + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("estou criando uma conta" + this.numero);
	}
	
	public void deposita(double valor) {
		saldo = saldo + valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;

		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}

	public double getSaldo() {
		return this.saldo;

	}

	public double getNumero() {
		return this.numero;

	}

	public void setNumero(int novoNumero) {
		this.numero = novoNumero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public void setTitular(Clinte titular) {
		this.titular = titular;
	}

	public Clinte getTitular() {
		return titular;
	}
    public static int getTotal() {
    	return Conta.total;
    }
}
