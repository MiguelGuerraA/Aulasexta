

import java.util.Calendar;

public class Pessoa {
	
	private String nome;
	private String sobrenome;
	private int idade;
	private double altura;
	private double peso;
	private double IMC;
	private double idadeAtual;
	private Calendar dataNascimento;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getIdade() {
		return idade;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getAltura() {
		return altura;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public double getPeso() {
		return peso;
	}

	public void setIMC(double IMC) {
		this.IMC = IMC;
	}

	public double getIMC() {
		return IMC;
	}
	public void setidadeAtual(double idadeAtual) {
		this.idadeAtual = idadeAtual;
	}
	public double getidadeAtual() {
		return idadeAtual;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public double calculaIMC() {
		return peso / Math.pow(altura, 2);
	}

	public int calculaIdade() {
		Calendar dataAtual = Calendar.getInstance();
		int anoAtual = dataAtual.get(Calendar.YEAR);
		int mesAtual = dataAtual.get(Calendar.MONTH) + 1;
		int diaAtual = dataAtual.get(Calendar.DAY_OF_MONTH);
		
		int idade = anoAtual - dataNascimento.get(Calendar.YEAR);
		if (mesAtual < dataNascimento.get(Calendar.MONTH) || (mesAtual == dataNascimento.get(Calendar.MONTH) && diaAtual < dataNascimento.get(Calendar.DAY_OF_MONTH))) {
			idade--;
		}
		return idade;	
	}
	

	public void InformaObesidade() {
		IMC = calculaIMC();

		if (IMC < 18.5) {
			System.out.println("A pessoa se encontra abaixo do peso");
		} else if (IMC >= 18.5 && IMC < 25) {
			System.out.println("A pessoa está dentro do peso ideal.");
		} else if (IMC >= 25 && IMC < 30) {
			System.out.println("A pessoa está com sobrepeso.");
		} else if (IMC >= 30 && IMC < 35) {
			System.out.println("A pessoa está com obesidade grau 1.");
		} else if (IMC >= 35 && IMC < 40) {
			System.out.println("A pessoa está com obesidade grau 2.");
		} else {
			System.out.println("A pessoa está com obesidade grau 3.");
		}

	}
}