import java.util.Scanner;

public class Atividade {

	public static void main(String[] args) {
		

		String nome, endereco;
		int idade;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		nome = leitor.next();
		
		System.out.println("Boas vindas senhor,  "+nome);
		
		System.out.println("Digite sua idade: ");
		idade = leitor.nextInt();
		
		System.out.println("Digite seu endere�o: ");
		endereco = leitor.next();
		
		System.out.println("Seu nome � "+nome+" , voc� tem "+idade+" anos e mora em "+endereco);
		
		
		
		
		
		
		
	}

}
