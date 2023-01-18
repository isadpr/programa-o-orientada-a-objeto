package p2_2022_2;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SistemaPrincipal {
	public static void main (String[] args) {
		Academia a = new Academia("smartFit");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o número de ninjas que deseja cadastrar: ");
		int qtdNinjas = sc.nextInt();
		
		for (int i=0; i<qtdNinjas; i++) {
			System.out.println("Insira a classificação do ninja a ser inserido: Genin(1), Chunin(2), Jonin(3)");
			int classificacao = sc.nextInt();
			
			System.out.println("Insira o nome: ");
			String nome = sc.nextLine();
			
			System.out.println("Insira o cpf: ");
			String cpf = sc.nextLine();
			
			System.out.println("Insira a idade: ");
			int idade = sc.nextInt();
			
			Ninja n;
			
			if(classificacao == 1) {
				n = new Genin(cpf, nome, idade);
				a.matriculaNinja(n);
			}
			else if (classificacao == 2) {
				n = new Chunin(cpf, nome, idade);
				a.matriculaNinja(n);
			}
			else if(classificacao == 3) {
				n = new Jonin(cpf, nome, idade);
				a.matriculaNinja(n);
			}
		
		}
		
		System.out.println("Cadastro dos ninjas realizado com sucesso!");
		
		System.out.println("Insira um cpf para buscar ninja: (0 para sair)");
		String buscaCpf = sc.nextLine();
		
		while(!"0".equals(buscaCpf)) {
			Ninja n = new Ninja(buscaCpf);
			a.imprimeDadosNinjaSeExistir(n);
		}
		System.out.println(a);
		
		List lista = a.getListaNinjas();
		Collections.sort(lista);
		System.out.println(lista);
		
		
	}
}
