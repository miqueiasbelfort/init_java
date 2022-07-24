package Variaveis;

public class Primitivo {
	public static void main(String[] args) {
		int idade;
		idade = 17;
		
		double altura = 1.8;
		
		System.out.println("A idade e: " + idade + " anos.");
		
		int idade2 = idade;
		
		idade++;
		
		System.out.println(idade);
		System.out.println(idade2);
		
		final double DISSIDIO = 10.8;
		var valor = 5.6;
		double valor2 = valor;
		
		int idade3 = idade + idade2;
		System.out.println(idade3);
		
		/*TIPOS PRIMARIOS*/
		
		// boolean (true or false)
		boolean tipoBoo = true;
		
		// byte - 1 byte (of -128 à 127)
		byte tipoByte = -127;
		
		// short - 2bytes (of -32768 á 32767)
		short tipoShort = 32555;
		
		// char - 2bytes (1)
		char tipoChar = 'C';
		
		// int - 4 bytes
		int tipoInt = -34538;
		
		// long - 8 bytes
		long tipoLong = -25475484748485L;
		
		// float - 4 bytes
		float tipoFloat = 2.1f;
		
		// double - 8 bytes
		double tipoDouble = 5.58;
		
		int i = 5;
		double d2 = i;
		
		double d = 3.14;
		int i2 = (int) d;
		
		System.out.println(i2);
	}
}
