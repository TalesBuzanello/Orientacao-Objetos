public class Decisao {
	public static void main (String args[]){
		if(args.length < 2){
			System.out.println("Precisa de 2 parâmetros.");
			System.exit(0);
			}
		int val1 = Integer.parseInt(args[0]); //Converte o valor para um inteiro
		int val2 = Integer.parseInt(args[1]);
		
		OperacoesMatematicas opMat = new OperacoesMatematicas();
		
		System.out.println(args[0] + "*" + args[1] + "= " + opMat.multiplicar(val1, val2));

	}

}
