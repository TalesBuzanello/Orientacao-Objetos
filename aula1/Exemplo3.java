public class Exemplo3{
	public static void main(String args[]){
		String cliente = "Humberto";
		
		Pet pet1 = new Pet();//Instancia um objeto da classe Pet
		pet1.especie = "Gato";
		pet1.nome = "Calvin";
		pet1.idade = 14;
		
		System.out.println("O cliente é " + cliente + " possui um pet chamado " + pet1.nome + " que é " + pet1.especie + " e tem " + pet1.idade + " anos.");
		
		Pet pet2 = new Pet();
		pet1.especie = "Lontra";
		pet1.nome = "Chico";
		pet1.idade = 5;
		
		
		
	}
}
