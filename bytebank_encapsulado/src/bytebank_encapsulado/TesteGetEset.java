
package bytebank_encapsulado;

public class TesteGetEset {

public static void main(String[] args) {
	
   		Conta conta = new Conta(1337,24226);
   		conta.setNumero(1234);
	    System.out.println(conta.getNumero());
	
	    Clinte Daniel = new Clinte();
	    Daniel.setNome("Daniel Leite");
       
        conta.setTitular(Daniel);

        
        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("dev");



}


}
