package Dominio;

//criação de uma classe Abstrata
public abstract class Conteudo {

	//criação de uma constante onde o valor será sempre 10 para este caso
	protected static final double XP_PADRAO = 10;
	
	private String titulo;
	private String descricao;
	
	public abstract double calcularXP();

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
		
}
