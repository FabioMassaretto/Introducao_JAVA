import java.util.Scanner;

public class Boolean_PURO{

	public static void main( String [] args ){

			Scanner sc = new Scanner( System.in );

			// le um valor booleano
			System.out.println( "Digite um valor booelean true/false" );
			boolean bool = sc.nextBoolean();

			System.out.println("Valor lido para o boolean = "+bool );
	}
}
/*
OBS: para ser um valor valido o usuario deve escrever true ou false,
nao importa se e' maiusculo ou minusculo.
*/
