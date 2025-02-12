import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		String Agencia;
		String nomeCliente;
		double saldo;
		
		System.out.println("Digite o número da agência:");
		numero = sc.nextInt();
		System.out.println("Digite o número da conta:");
		Agencia = sc.next();
		sc.nextLine();
		System.out.println("Digite o seu nome:");
		nomeCliente = sc.nextLine();
		System.out.println("Digite um valor para depósito:");
		saldo = sc.nextDouble();
		
		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque.", nomeCliente, Agencia, numero, saldo);
		
		sc.close();
	}

}
