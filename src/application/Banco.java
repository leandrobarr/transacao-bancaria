package application;
import java.util.*;
import java.util.Locale;
import entities.Transacao;
/* utilizando getters and setters neste exerc�cio de saldo de conta bac�ria.
 * 
 */
public class Banco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Transacao transacao;
		System.out.print("Digita a conta: ");
		int conta = sc.nextInt();
		System.out.print("Titular da conta: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Gostaria de realizar um dep�sito inicial? (s/n) ");
		char response = sc.next().charAt(0);
		
		if(response == 's') {
			System.out.print("Digite o valor: ");
			double initialDeposit = sc.nextDouble();
			transacao = new Transacao(conta, nome, initialDeposit);
			
		}
		else {
			transacao = new Transacao(conta, nome);
							
		}
		
		System.out.println("Informa��es da conta: ");
		System.out.println(transacao);
		System.out.print("\n Digite um valor de dep�sito: ");
		transacao.amountToAdd(sc.nextDouble());
		System.out.println("Informa��es atualizadas: ");
		System.out.println(transacao);
		// � cobrado um valor de R$ 5,00 para cada saque
		System.out.print("\n Digite um valor para saque: "); 
		transacao.amountToRemove(sc.nextDouble());
		System.out.println("Informa��es atualizadas: ");
		System.out.println(transacao);
		
		
	}

}
