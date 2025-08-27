public class ExemploInteger {
	public static void main (String args[]){
		String s1 = "10";
		System.out.println("s1: " + s1);
		
		//Converter de String para int
		
		int i1 = Integer.parseInt(s1);
		System.out.println("i1: " + i1);
		
		//Converter de Interger para String
		
		Integer i2 = 5;
		s1 = i2.toString();
		s1 = Integer.toString(i2);
		/* s1 = i1.toString();				Não é possível pois i1 é um tipo primitivo;*/
		
		//Converter para float
		
		float f1 = i2.floatValue() / 3;
		System.out.println("f1: " + f1);
		System.out.println("f1: "
			+ String.format("%.02f", f1));
			
		//Comparações
		Integer i3 = 10;
		int i4 = 10;
		System.out.println(i3 == i4);		//Para String essa forma não irá funcionar
		System.out.println(i3.equals(i4));
		
		
	  }
}
