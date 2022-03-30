import java.time.LocalDate;

import Dominio.Bootcamp;
import Dominio.Conteudo;
import Dominio.Curso;
import Dominio.Dev;
import Dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
 
		Curso curso01 = new Curso();
		Curso curso02 = new Curso();
		Mentoria mentoria = new Mentoria();
		
		
		curso01.setTitulo("Curso Java");
		curso01.setDescricao("Descrição curso Java");
		curso01.setCargaHoraria(8);

		
		curso02.setTitulo("Curso JS");
		curso02.setDescricao("Descrição curso JS");
		curso02.setCargaHoraria(8);

		
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Descrição Mentoria de Java");
		mentoria.setData(LocalDate.now());
		
		
		/*System.out.println(curso01);			
		System.out.println(curso02);
		System.out.println(mentoria);*/

		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso01);
		bootcamp.getConteudos().add(curso02);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devHuri = new Dev();
		devHuri.setNome("Huri");
		devHuri.inscreverBootcamp(bootcamp);
		
		System.out.println("\n Conteúdos inscritos Huri: " + devHuri.getConteudoInscritos());
		System.out.println("\n -------------------------------------------------------------");
		
		
		devHuri.progredir();
		devHuri.progredir();
		System.out.println("\n Conteúdos em andamento Huri: " + devHuri.getConteudoInscritos());
		System.out.println("\n -------------------------------------------------------------");
		

		System.out.println("\n Conteúdos concluidos Huri: " + devHuri.getConteudoConcluidos());
		System.out.println("\n -------------------------------------------------------------");
		
		
		System.out.println("\n XP: "+ devHuri.calcularTotalXP());
		
		
		
		
		
		System.out.println("\n *************************************************************");
		
		
		
		
		
		Dev devAnny = new Dev();
		devAnny.setNome("Anny");
		devAnny.inscreverBootcamp(bootcamp);
		
		System.out.println("\n Conteúdos inscritos Anny: " + devAnny.getConteudoInscritos());
		System.out.println("\n -------------------------------------------------------------");
		
		
		devAnny.progredir();
		System.out.println("\n Conteúdos andamento Anny: " + devAnny.getConteudoInscritos());
		System.out.println("\n -------------------------------------------------------------");
		
			
		System.out.println("\n Conteúdos concluidos Anny: " + devAnny.getConteudoConcluidos());
		System.out.println("\n -------------------------------------------------------------");
		
		
		System.out.println("\n XP: "+ devAnny.calcularTotalXP());
		
	}
	
}