import java.io.Reader;
import java.util.Scanner;

public class Estud {
	
	public final static int total_est = 12;
	private double [] vector_est;
	double prom;
	int cant;
	double promedio;
	
	public Estud() {
		
		vector_est = new double [total_est];
		
		for(int i=0; i<total_est; i++) {
			vector_est[i] = 0.0;
		}
		
	}
		
	// Agrega notas de estudiantes: 
	
	public void not(){
		
		double nota = 0.0;
		double nota2 = 0.0;
		int estudiante = 0;
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Ingrese a que estudiante le quiere cambiar la nota: ");
		estudiante = reader.nextInt();
		estudiante = estudiante - 1;
		System.out.print("Ingrese la nota: ");
		nota = reader.nextDouble();
			
		if(nota > 5.0) {
			System.out.println("Error, Ingrese una nota valida");
			nota2 = reader.nextDouble();
			if(nota2 < 5.0) {
				nota = nota2;
				vector_est[estudiante] = nota;
			}else {
				System.out.println("Error, la nota maxima es 5.0");
			}
		}else {
				vector_est[estudiante] = nota;
	}
		
		prom = prom + nota;
		cant = cant + 1;
}
		
	
	// Muestra notas de estudiantes: 
	
	public void most_not() {
		
		for(int cont=0;cont<12;cont++) {
			System.out.println("Nota estudiante #"+cont+": "+vector_est[cont]);
		}
	}
	
	// Muestra el promedio del curso:
	
	public void promedio_curs() {
		promedio = prom/cant;
		System.out.println("El promedio del curso es: "+prom/cant);
	}
	
	// Muestra la cantidad de estudiantes que estan en el promedio:
	
	public void cant_promedio() {
		
		int cant_est=0;
		
		for(int i=0; i<total_est; i++) {	
			if(vector_est[i] > promedio) {
				cant_est = cant_est + 1;
			}
		}
		System.out.println("La cantidad de estudiantes que superan el promedio son: "+cant_est);
	}
}
