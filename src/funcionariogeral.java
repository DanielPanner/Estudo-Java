
public class funcionariogeral {
	public static void main(String[] args) {

		Funcionario Daniel = new Funcionario();

		Daniel.setNome("Daniel da Silva Souza");
		Daniel.setCpf("066.235.756.34");
		Daniel.setSalario(2500.50);
		Daniel.setBonificação(Daniel.getSalario()* 0.10);

		
		
		System.out.println("Nome: " + Daniel.getNome() + "\n" + "CPF: " + Daniel.getCpf() + "\n" + "Saldo: " + "R$"
				+ Daniel.getSalario() + "\n" + "Bonificação 10%: " + "R$" + Daniel.getBonificação() + "\n"
				+ "Salário Total: " + Daniel.getCalcularSalarioTotal());

	}

}