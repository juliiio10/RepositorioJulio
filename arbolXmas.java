import java.util.Scanner;
//3 bucles
//el primero es el número de filas
//el segundo imprime los espacios
//el tercero imprime los asteriscos
public class arbolXmas {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		System.out.println ("Introduce un número:");
		int filas = lector.nextInt();
	  
		for (int i = 0; i < filas; i++) {
			 
			for (int j = 0; j < filas - i; j++){
				System.out.print(" ");
			}
			
			for (int k = 0; k < (2 * i + 1); k++){
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
