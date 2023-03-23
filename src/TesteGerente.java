
public class TesteGerente {

	public static void main(String[] args) {
		Gerente dados = new Gerente();
		dados.setNome("Lunna Roque");
		dados.setCpf("001.334.212-1");
		dados.setSalario(7000);
		
		System.out.println(dados.getNome() + "\n" + dados.getCpf() + 
				"\n" + dados.getSalario() + "\n" + dados.getBonificação() 
				+ "\n" + dados.getCalcularSalarioTotal());

	}

}
