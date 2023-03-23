
public class Funcionario {

	private String nome;
	private String cpf;
	private double salario;
	private double bonificação;
	
	public double getBonificação() {
		return this.salario * 0.1;
	}
	
	public void setBonificação(double bonificação) {
		this.bonificação = bonificação;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getCalcularSalarioTotal() {
		return salario + bonificação;
	}
	
	public void setCalcularSalarioTotal(double bonificação) {
		this.salario += bonificação;
	}

	
	}

