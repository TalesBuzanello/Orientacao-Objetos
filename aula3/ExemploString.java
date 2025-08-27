public class ExemploString {
	public static void main (String args[]){
		String str1, str2, str3;
		str1 = "Um texto qualquer  ...    ...  ";
		
		System.out.println("[" + str1 + "]");	
		str1 = str1.trim();
		System.out.println("Após o Trim: [" + str1 + "]");
		System.out.println("Tamanho do str1:" 
			+ str1.length());
			
		//Substituir um substring dentro de um String
		
		str2 = str1.replace("texto", "teste");
		System.out.println("[" + str2 + "]");
		str2 = str2.replace("t", "AAA"); 
		System.out.println("[" + str2 + "]");
		
		//Extrair um substring
		
		str2 = str1.substring(6, 10);  //6 Inclusive(primeiro que quero), 10 Exclusive(primeiro que não quero)
		System.out.println("[" + str2 + "]");
		
		//Procurar substring
		str1 = "talesbuzanello@gmail.com";
		int posicao = str1.indexOf("@");
		System.out.println("@ est´a na posição " + posicao);
		System.out.println("Usuário: "
			+ str1.substring(0, str1.indexOf("@")));
		System.out.println("Dominio: "
			+ str1.substring(str1.indexOf("@") + 1, str1.length()));
			
		//Forma como professor fez para dominio
		
		String dominio = str1.substring(str1.indexOf("@") + 1, str1.length());
		System.out.println("Domínio: "
			+ dominio.toUpperCase());
			/*
			 *	toUpperCase() = transformar para maíusculas
			 * 	toLowerCase() = transformar para minúsculas
			 */
			 
		//Converter de outros tipos para String
		
		int valor = 5;
		str3 = String.valueOf(valor);
		System.out.println("str3: " + str3);	
		
		//Quebrar um String em vetor
		
		String valores = "4/7/22/7/0/5";
		String[] arrayValores = valores.split("/");
		System.out.println("arrayValores[1] = " 
			+ arrayValores[1]);

	  }
}
