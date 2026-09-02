package unidade1;
/*
 * 1)a) Faça uma classe que define um objeto Aluno com os seguintes atributos:
 *      nome, matricula (int), duas notas e média. 
 *      Faça o construtor, os métodos gets e sets e toString
 */
public class Aluno {
	private String nome;
	private int matricula;
	private double nota1, nota2, media;
	
	public Aluno(String nome, int matricula, double nota1, double nota2) {
		this.nome = nome;
		this.matricula = matricula;
		this.nota1 = nota1;
		this.nota2 = nota2;
		calculaMedia();
	}
	
	public Aluno(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
		this.nota1 = 0;
		this.nota2 = 0;
		calculaMedia();
	}
	private void calculaMedia () {
		this.media = (this.nota1+this.nota2)/2;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
		calculaMedia();
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
		calculaMedia();
	}

	public double getMedia() {
		return media;
	}

	public String toString() {
		return "Nome=" + nome + "    Matricula=" + matricula + 
				"   Nota1=" + nota1 + "   Nota2=" + nota2 + 
				"   Media="
				+ media;
	}	
}















