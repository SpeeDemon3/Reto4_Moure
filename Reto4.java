package retos2022;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 
 * @author speedemon_Antonio Ruiz Benito
 *
 */
public class Reto4 {

	public static void main (String[] args) {
		
		/*
		 * Reto #4: ÁREA DE UN POLÍGONO
		 * Crea una única función (importante que sólo sea una) que sea capaz
		 * de calcular y retornar el área de un polígono.
		 * - La función recibirá por parámetro sólo UN polígono a la vez.
		 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
		 * - Imprime el cálculo del área de un polígono de cada tipo.
		 */
				
		calcularAreaPoligono("rectangulo");
		calcularAreaPoligono("triangulo");
		calcularAreaPoligono("circulo");
		
	}
	
	/**
	 * Funcion para calcular el area de un poligono pidiendo le los datos al usuario
	 * @param poligono contendra una figura(triangulo, circulo o rectangulo)
	 * @return el area de un poligono
	 */
	public static double calcularAreaPoligono (String poligono) {
		// Utilizo la clase Scanner para guardar los valores del usuario e interactuar con el
		Scanner sc = new Scanner(System.in);
		
		// Inicializo la variable area donde guardare los valores del resultado
		double area = 0;
		
		// Con una estructura switch comprobare cada caso pasando le el valor de la variable poligono que recibe la funcion
		switch(poligono) {
			case "triangulo":
				// Pido datos al usuario por consola
				System.out.println("Introduce la base:");
				// Leo y guardo el valor introducido con nextDouble()
				double base = sc.nextDouble();
				
				// Pido datos al usuario por consola
				System.out.println("Introduce la altura");
				// Leo y guardo el valor introducido con nextDouble()
				double altura = sc.nextDouble();	
				
				// Realizo el calculo dentro de la variable 
				area = (base * altura) / 2;
				
				// Muestro el resultado al usuario por consola
				System.out.println("El área del triángulo es:" + area);
				
			break;
			
			case "circulo":
				// Pido datos al usuario por consola
				System.out.println("Introduce su radio: ");
				// Leo y guardo el valor introducido con nextDouble()
				double radioUsuario = sc.nextDouble();
				
				// Elevo el valor introducido por el usuario a 2 con la funcion.pow() de la clase Math
				double radioAlCuadrado = Math.pow(radioUsuario, 2);
				// Almaceno el valor del numero PI
				double PI = Math.PI;
				// Realizo el calculo dentro de la variable 
				area = radioAlCuadrado * PI;
				
				// Muestro el resultado al usuario por consola
				System.out.println("El área del círculo es:" + area);
			
			break;
			
			case "rectangulo":
				// Pido datos al usuario por consola
				System.out.println("Introduce la base:");
				// Leo y guardo el valor introducido con nextDouble()
				double baseUsuario = sc.nextDouble();
				
				// Pido datos al usuario por consola
				System.out.println("introduce su altura:");
				// Leo y guardo el valor introducido con nextDouble()
				double alturaUsuario = sc.nextDouble();
				
				// Realizo el calculo dentro de la variable 
				area = baseUsuario * alturaUsuario;
				
				// Muestro el resultado al usuario por consola
				System.out.println("El área del rectángulo es: " + area);
				
			break;
		}
		// Retorno el valor de la variable area
		return area;
	}
	
	
}
