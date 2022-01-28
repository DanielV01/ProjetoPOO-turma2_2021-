package classe.executavel;

import classe.modelo.Conta;
import classe.modelo.Pessoa;

public class ClasseExecutavel {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		Pessoa pessoa1 = new Pessoa("Zileide", 32, 99955333, "Zileide@gmail.com");
		Pessoa pessoa2 = new Pessoa("Zezinho", 25, 999553344, "Zezinho@gmail.com");
		
		pessoa.setNome("Ciclano");
		pessoa.setCelular(99887766);
		pessoa.setIdade(30);
		pessoa.setEmail("ciclano@mail.com");
		
		Conta conta1 = new Conta(555555, pessoa, 990.23f);
		Conta conta2 = new Conta(123456, pessoa1 , 877.77f);
		Conta conta3 = new Conta(124124, pessoa2 ,2222.22f);
		
		conta1.setCodigo(112233);
		//conta1.setCorrentista("Ciclano Asteróides");
		conta1.setSaldo(500.00f);
		//conta3.setCorrentista("Zezinho")
		
		System.out.println("Conta número..................:"+conta1.getCodigo());
		System.out.println("Correntista...................:"+conta1.getCorrentista().getNome());
		System.out.println("A idade é...................:"+conta1.getCorrentista().getIdade());
		System.out.println("Saldo.........................:"+conta1.getSaldo());
		System.out.println("----------------------------------------------------------");
		System.out.println("Conta número..................:"+conta2.getCodigo());
		System.out.println("Correntista...................:"+conta2.getCorrentista().getNome());
		System.out.println("A idade é...................:"+conta2.getCorrentista().getIdade());
		System.out.println("Saldo.........................:"+conta2.getSaldo());
		System.out.println("----------------------------------------------------------");
		System.out.println("Conta número..................:"+conta3.getCodigo());
		System.out.println("Correntista...................:"+conta3.getCorrentista().getNome());
		System.out.println("Correntista...................:"+conta3.getCorrentista().getIdade());
		System.out.println("Saldo.........................:"+conta3.getSaldo());
		
		/*conta1.depositar(1000.00f);
		System.out.println("Saldo após o depósito.........R$: "+conta1.getSaldo());
		
		if(conta1.sacar(150.00f)) {
			System.out.println("Saque realizado com sucesso!");
		}else {
			System.out.println("Saldo insuficiente para saque!");
		}
		System.out.println("Saldo após saque.........R$: "+conta1.getSaldo());*/
	}
	
}
