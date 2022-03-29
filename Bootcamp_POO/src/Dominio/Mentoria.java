package Dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
	

	private LocalDate data; //Traz o dia atual
	

	@Override
	public double calcularXP() {
		return XP_PADRAO+20;
		
		
	}
	
	public Mentoria() {
		super();
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	
	@Override
	public String toString() {
		return "\n\n Mentoria = " + getTitulo() + ", \n Descrição = " + getDescricao() + ", \n Data = " + data;
	}
	
	
}
