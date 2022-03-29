package Dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

	private String nome;
	private String descricao;
	private LocalDate dataInicio = LocalDate.now();
	private LocalDate dataFinal = dataInicio.plusDays(45); //A data final é a data inicial + 45 dias
	private Set<Dev> devsinscritos = new HashSet<>();
	private Set<Conteudo> conteudos = new LinkedHashSet<>();

	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public LocalDate getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}
	public LocalDate getDataFinal() {
		return dataFinal;
	}
	public void setDataFinal(LocalDate dataFinal) {
		this.dataFinal = dataFinal;
	}
	public Set<Dev> getDevsinscritos() {
		return devsinscritos;
	}
	public void setDevsinscritos(Set<Dev> devsinscritos) {
		this.devsinscritos = devsinscritos;
	}
	public Set<Conteudo> getConteudos() {
		return conteudos;
	}
	public void setConteudos(Set<Conteudo> conteudos) {
		this.conteudos = conteudos;
	}
	
	
	
	//É necessária a inserção por estar utilizando o "LinkedHashSet"
	//Botão direito no mouse > Source > Generate hasCode() and equals() > seleciona tudo e OK
	@Override
	public int hashCode() {
		return Objects.hash(conteudos, dataFinal, dataInicio, descricao, devsinscritos, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bootcamp other = (Bootcamp) obj;
		return Objects.equals(conteudos, other.conteudos) && Objects.equals(dataFinal, other.dataFinal)
				&& Objects.equals(dataInicio, other.dataInicio) && Objects.equals(descricao, other.descricao)
				&& Objects.equals(devsinscritos, other.devsinscritos) && Objects.equals(nome, other.nome);
	}
	
	
	
}
