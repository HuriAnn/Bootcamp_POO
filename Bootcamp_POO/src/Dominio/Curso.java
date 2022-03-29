package Dominio;

public class Curso extends Conteudo {

	//Encapsulamento
	private int cargaHoraria;
	
		
	@Override
	public double calcularXP() {
		return XP_PADRAO * cargaHoraria;
	}
	
	
	//Construtor vazio
	public Curso() {
		super();
		

	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	
	//Abstração
	@Override
	public String toString() {
		return "\n\n Curso = " + getTitulo() + ", \n Descrição = " + getDescricao() + ", \n Carga Horaria = " + cargaHoraria;
	}


	
}

