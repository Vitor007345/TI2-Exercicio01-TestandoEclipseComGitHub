import java.util.*;
class SomaDoisNumeros {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//Declaração de variaveis
		int num1, num2;
		
		//leituras
		System.out.println("Digite um número: ");
		num1 = sc.nextInt();
		System.out.println("Digite outro número: ");
		num2 = sc.nextInt();
		
		//Printar a soma
		System.out.println("Soma: " + (num1 + num2));
		
	}
}
