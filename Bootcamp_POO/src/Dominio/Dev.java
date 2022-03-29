package Dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

	private String nome;
	//Utilizado da função "LinkedHashSet" para que não tenha inserção de valores duplicadose para deixar na ordem se inserção
	private Set<Conteudo> conteudoInscritos = new LinkedHashSet<>();
	private Set<Conteudo> conteudoConcluidos = new LinkedHashSet<>();
	
	public void inscreverBootcamp(Bootcamp bootcamp){
		this.conteudoInscritos.addAll(bootcamp.getConteudos()); //Adiciona todos os bootcamps no ConteudoInscritos
		bootcamp.getDevsinscritos().add(this);//adiciona todos os Devs inscritos no bootcamp
	}
	
	public void progredir(){
		//Optional > serve para resolver retornos null
		//findFirst > retorna o Opitional
		Optional<Conteudo> conteudo = this.conteudoInscritos.stream().findFirst(); 

		if(conteudo.isPresent()) {
			this.conteudoConcluidos.add(conteudo.get()); //inserir conteudos concluidos
			this.conteudoInscritos.remove(conteudo.get()); //remove os conteudos concluidos da lista conteudos inscritos
		}else {
			System.err.println("Você não está matriculado em nenhum conteudo!");
		}
	}
	
	public double calcularTotalXP(){
		return this.conteudoConcluidos.stream().mapToDouble(conteudo -> conteudo.calcularXP()).sum();
															//pega cada conteúdo concluido e o XP de cada conteudo e soma
	}
	
	
	// Getters and Setters
	//Botão direito no mouse > Source > Getters and Setters > seleciona tudo e OK
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getConteudoInscritos() {
		return conteudoInscritos;
	}

	public void setConteudoInscritos(Set<Conteudo> conteudoInscritos) {
		this.conteudoInscritos = conteudoInscritos;
	}

	public Set<Conteudo> getConteudoConcluidos() {
		return conteudoConcluidos;
	}

	public void setConteudoConcluidos(Set<Conteudo> conteudoConcluidos) {
		this.conteudoConcluidos = conteudoConcluidos;
	}

	//É necessária a inserção por estar utilizando o "LinkedHashSet"
	//Botão direito no mouse > Source > Generate hasCode() and equals() > seleciona tudo e OK
	@Override
	public int hashCode() {
		return Objects.hash(conteudoConcluidos, conteudoInscritos, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudoConcluidos, other.conteudoConcluidos)
				&& Objects.equals(conteudoInscritos, other.conteudoInscritos) && Objects.equals(nome, other.nome);
	}


	
}
