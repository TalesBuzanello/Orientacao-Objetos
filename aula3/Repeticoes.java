public class Repeticoes {
	public static void main (String[] args) {
		int qtde = 5;
	
		System.out.println("Repetição do tipo for: ");
	
		for (int i = 0; i < qtde; i++) {
			System.out.println(i);
		}
		//Poderia ser (int i = 10; i < qtde; i++)
		
		
		//Enquanto
		System.out.println("REpetição do tipo while");
		int cont = 0;
		while (cont <= qtde){
			System.out.println(cont);
			cont++;
			}
			
		//Faça enquanto
		System.out.println("Repedições do tipo do ... while");
		cont = 0;
		do {
			System.out.println(cont);
			cont++;
			}while(cont <= qtde);
	}
	
}
