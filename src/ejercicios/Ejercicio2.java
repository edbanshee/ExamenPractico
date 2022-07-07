package ejercicios;
import java.util.Scanner;
public class Ejercicio2 {
	
	/* Jesús Eduardo Santoyo Sosa 
	Instrucción: Realizar un programa que determine si un número es par o impar */
	
	public static void main(String[] args) {
	/* Se crea un scanner para la entrada de usuario y se declara una variable para
		guardar el numero entero */
		Scanner en = new Scanner(System.in);
		int num;
	//Se pide el número entero y se guarda en la variable "num"	
		System.out.print("Escribe un número entero: ");
		num = en.nextInt();
		en.close();
	/* Se crea una condicional, si al dividir el numero guardado entre 2 el residuo es 0, 
	   es par, de lo contrario es impar */
		if(num%2==0)
			System.out.print("El número " + num + " es par");
		else
			System.out.print("El número " + num + " es impar");
	}

}
