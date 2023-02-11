// Programacion #4
// Ingenieria de sistemas y computacion
// Rafael Felipe Galindo Becerra
// 1.003.711.448 

import java.io.Reader;
import java.util.Scanner;

public class MenEst {
	
	public static void main (String[] args) {
		
		Scanner reader = new Scanner(System.in); 
		Estud nota = new Estud();
		int op = 0;
		
		while(op != 5) {
			
			System.out.println("Menu: ");
			System.out.println("1. Agrega nota a estudiante");
			System.out.println("2. Mostrar notas de estudiantes por orden ");
			System.out.println("3. Promedio del curso ");
			System.out.println("4. Numero de estudiantes por encima del promedio ");
			System.out.println("5. Salir ");
			System.out.print("Opcion: ");
			
			op = reader.nextInt();
			
			switch(op){
			
			case 1: System.out.print("\n");
					nota.not();
					System.out.print("\n");
					break;
					
			case 2: System.out.print("\n");
					nota.most_not();
					System.out.print("\n");
					break;
					
			case 3: System.out.print("\n");
					nota.promedio_curs();
					System.out.print("\n");
					break;
					
			case 4: System.out.print("\n");
					nota.cant_promedio();
					System.out.print("\n");
					break;
			}
		}
	}	
}
