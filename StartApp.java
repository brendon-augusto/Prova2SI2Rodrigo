package br.edu.univas.main;

import java.util.Scanner;
import br.edu.univas.main.CadastroConta;
public class StartApp {
	public static Scanner reading = new Scanner(System.in);
	
	public static void main(String[] args) {
		CadastroConta[] contas = new CadastroConta[100];
		
		int count= 0;	
		int choice = 0;
		
		do { 
			imprimeMenu();	
			choice = reading.nextInt();
			reading.nextLine();
			
			if (choice == 1) {
				
				Contas(contas, count);
				count++;	
				
			}
			
			else if (choice == 2) {
				
				Saldo(contas);			
				
			}
									
		} while (choice != 3);
			
		reading.close();
	}
	public static void imprimeMenu() {
		
		System.out.println("Cadastro de contas");
		System.out.println("Seja Bem vindo: ===================");
		System.out.println();
		
		System.out.println("Escolha a sua opção desejada"
				+ "");
		System.out.println("1- Cadastrar conta");
		System.out.println("2- Ver Saldo");
		System.out.println("3- Sair");
		
		
		
	}
	
	public static void Contas(CadastroConta[] contas, int index ) {
		
		CadastroConta conta = new CadastroConta();
		
		System.out.println("Digite o nome da conta");
		conta.descricao = reading.nextLine();
		
		System.out.println("Digite o valor da conta");
		conta.valor = reading.nextFloat();
		reading.nextLine();
		
		System.out.println("Digite a data de vencimento");
		conta.vencimento = reading.nextLine();
		
		System.out.println("Informe se sua conta vai ser despesa ou receita");
		conta.tipo = reading.nextLine();
		
		contas[index] = conta;
	
	}
	
	public static void Saldo(CadastroConta[] contas) {
	
		
	 float despesa = 0;	
     float receita = 0;
     
		for (int i = 0; i < 100; i ++) {
			
			if (contas[i] != null && contas[i].tipo.equals("despesa")) {
				
				despesa += contas[i].valor;
					
			}
			
			if (contas[i] != null && contas[i].tipo.equals("receita")) {
							
				receita+=contas[i].valor;	
				
			}								
		}
		
	System.out.println("Seu saldo disponível é de: " + (receita - despesa));
		
	}

}


