package unidade3;

/*
 * 1) Suponha que uma loja possua três categorias de
vendedores, classificadas de acordo com o tempo de
serviço. Crie a classe Vendedor com as seguintes
especificações:
	Atributos:
		nome
		salarioBase (inicialmente R$ 2.000,00)
		tempoServico (em meses)
		categoria (A, B ou C, conforme as regras: A se tempo
		de serviço > 60 meses, B entre 30 e 60 meses
		inclusive, C se menor que 30 meses)
		totalVendas (valor total das vendas realizadas pelo
		vendedor)
	*/

public class Vendedor {
	//ATRIBUTO DE CLASSE (ESTÁTICO)
	private static double salarioBase = 2000;
	//ATRIBUTO DE INSTANCIA
	private String nome;
	private double totalVendas;
	private int tempoServico;
	private char categoria;

	public Vendedor(String nome, double salarioBase, double totalVendas, int tempoServico) {
		super();
		this.nome = nome;
		this.salarioBase = 2000;
		this.totalVendas = totalVendas;
		this.tempoServico = tempoServico;
		setCategoria();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public  static double getSalarioBase() {
		return Vendedor.salarioBase;
	}

	public static  void setSalarioBase(double salarioBase) {
		Vendedor.salarioBase = salarioBase;
	}

	public double getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}

	public int getTempoServico() {
		return tempoServico;
	}

	public void setTempoServico(int tempoServico) {
		this.tempoServico = tempoServico;
		setCategoria();
	}

	public char getCategoria() {
		return categoria;
	}

	private void setCategoria() {
		if (this.tempoServico > 60) {
			this.categoria = 'A';
		} else if (this.tempoServico < 30) {
			this.categoria = 'C';
		} else {
			this.categoria = 'B';
		}

	}

	@Override
	public String toString() {
		return "Vendendor [nome=" + nome + ", salarioBase=" + Vendedor.salarioBase + ", totalVendas=" + totalVendas
				+ ", tempoServico=" + tempoServico + ", categoria=" + categoria + "]";
	}

	/*
	 * Métodos: Construtor Getters e setters toString() comissao() → calcula e
	 * retorna a comissão: 20% do total de vendas se ultrapassar R$ 20.000,00 15% se
	 * entre R$ 10.000,00 e R$ 20.000,00 inclusive 5% se abaixo de R$ 10.000,00
	 * gratificacao() → calcula e retorna a gratificação: 15% do salário base para
	 * categoria A 7,5% para categoria B salario() → calcula e retorna o salário
	 * total: salário base + comissão + gratificação
	 */

	/*
	 * public double calcularComissao() { double comissao; if (this.totalVendas >
	 * 20000) { comissao = 0.20 * this.totalVendas;
	 * 
	 * }else if(this.totalVendas >= 10000|| this.totalVendas <= 20000) { comissao =
	 * 0.15 * this.totalVendas; }else { comissao = 0.05 * this.totalVendas; }
	 * 
	 * return comissao }
	 */

	
	//jeito que a professor fez economiza linhas ( dica) -- deixar a condição dupla por ultimo( vai economizar linha)
	public double calcularComissao() {
		double comissao;
		if (this.totalVendas > 20000) {
			return comissao = 0.2 * this.totalVendas;
		}
		if (this.totalVendas < 10000) {
			return comissao = 0.05 * this.totalVendas;
		}
		return comissao = 0.15 * this.totalVendas;
	}
	
	public double calcularGratificacao() {
		if(this.categoria == 'A') {
			return 0.15 * this.salarioBase;
		}
		
		if(this.categoria == 'B') {
			return 0.075 * this.salarioBase;
		}
		
		return 0;
	}
	
	public double salario() {
		return Vendedor.salarioBase + calcularComissao() + calcularGratificacao();
		
	}
	
	
	

}
