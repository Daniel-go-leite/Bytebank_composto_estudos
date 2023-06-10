package bytebank_encapsulado;

public class TestaValores {

	public static void main(String[] args) {
	

	 Conta conta =new Conta(1337,24226);
	 
	 conta.deposita(200.0);
	 System.out.println(conta.getSaldo());
	 conta.setAgencia(570);
	 
	 System.out.println (conta.getAgencia());
	 
	 conta.setAgencia(123123);
	
	 Conta conta2 =new Conta(1337,258582);
	
	
}
}
