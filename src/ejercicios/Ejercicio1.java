package ejercicios;
import java.util.Scanner;
public class Ejercicio1 {
	
	/* Jesús Eduardo Santoyo Sosa 
	Instrucción: Realizar un programa que invierta el orden de un texto.*/
	
	public static void main(String[] args) {
	/* Se crea un scanner para la entrada de texto, y se declaran dos variables para
		guardar el texto original y el texto invertido respectivamente */
		Scanner en = new Scanner(System.in);
		String texto = "";
		String inverso = "";
	//Se pide el texto al usuario y se guarda en la variable "texto"
		System.out.print("Escribe el texto que deseas invertir: ");
		texto = en.nextLine();
		en.close();
	/* Se crea una iteración que toma los caracteres del texto original, del ultimo al primero
		para guardarlos en ese orden en la variable "inverso" */
		int lnt = texto.length();
		for (int i = lnt - 1; i >= 0; i--)
			inverso = inverso + texto.charAt(i);
	//Se imprimen el texto original y el texto invertido	
		System.out.println("Texto original: " + texto);
		System.out.println("Texto invertido: " + inverso);
		
	}

}
