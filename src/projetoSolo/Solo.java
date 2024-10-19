package projetoSolo;

import java.util.Scanner;

public class Solo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = 1;
		int y = 7;
		
		System.out.println("Bem-vindo ao Biscotto Al Lemone");
		//Pratos
		String[] pratos = new String[y];
		double precos[] = new double[y];
		
		Pratos prato1 = new Pratos();
		prato1.nome = "Cuscuz";
		prato1.preco = 17;
		pratos[1] = prato1.nome;
		precos[1] = prato1.preco;
		
		Pratos prato2 = new Pratos();
		prato2.nome = "Pizza";
		prato2.preco = 20;
		pratos[2] = prato2.nome;
		precos[2] = prato2.preco;
		
		Pratos prato3 = new Pratos();
		prato3.nome = "Batata";
		prato3.preco = 25;
		pratos[3] = prato3.nome;
		precos[3] = prato3.preco;
		
		Pratos prato4 = new Pratos();
		prato4.nome = "Spaghetti";
		prato4.preco = 30;
		pratos[4] = prato4.nome;
		precos[4] = prato4.preco;
		
		Pratos prato5 = new Pratos();
		prato5.nome = "Káposztás tészta";
		prato5.preco = 100;
		pratos[5] = prato5.nome;
		precos[5] = prato5.preco;
		
		Pratos prato6 = new Pratos();
		prato6.nome = "Biscotto Al Lemone";
		prato6.preco = 250;
		pratos[6] = prato6.nome;
		precos[6] = prato6.preco;
		
		//login aplicativo 
		Clientes cliente1 = new Clientes();
		System.out.println("Digite seu nome" );
		String nome = scanner.nextLine();
		cliente1.nome = nome;
		
		System.out.println("Informe seu email: ");
		String email = scanner.nextLine();
		cliente1.email = email;
		
		System.out.println("Informe seu numero de telefone");
		int telefone = scanner.nextInt();
		scanner.nextLine();
		cliente1.telefone = telefone;
		
		System.out.println("Você quer takeout?");
		String escolha = scanner.nextLine();
		
		 if (escolha.equals("sim") || (escolha.equals("Sim"))){
			System.out.println("Digite seu endereço");
			String endereco = scanner.nextLine();
			cliente1.endereco = endereco;
		} 

		System.out.println("lista de pratos:");
		do {
			System.out.println(x + " : " + pratos[x] + " R$: " + precos[x]);
			x++;
		} while (x < y);
		
		int ordem;
		String escolha2 = "";
		do {
			System.out.println("digite o numero de sua ordem: ");
			ordem = scanner.nextInt();
			System.out.println(pratos[ordem] + " R$: " + precos[ordem]);
			System.out.println("Voce quer continuar pedindo?");
			escolha2 = scanner.next();
		} while (escolha2.equals("sim"));

		
	}

}
