package empleado;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class SolicitarEmpleado {
	 

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		
		Scanner entrada=new Scanner(System.in);
	String continuar1="s";
		
		while (continuar1.equalsIgnoreCase("s")) {
			
			Scanner sc=new Scanner(System.in);
		System.out.println("introduce el nombre del empleado");
		
		String nombre=sc.next();
		
		System.out.println("introduce el apellido del empleado");
		String apellido=sc.next();
		
		System.out.println("introduce el sueldo actual");
		int sue=sc.nextInt();
		
		System.out.println("introduce el aumento");
		int aumento=sc.nextInt();
		/*System.out.println("introduce el año de admision del empleado");
		int agno=sc.nextInt();
		
		System.out.println("introduce el mes de admision del empleado");
		int mes=sc.nextInt();
		
		System.out.println("introduce el dia de admision del empleado");
		int dia=sc.nextInt();*/
		
	
		GregorianCalendar calendario = new GregorianCalendar();
		Date fecha = calendario.getTime();
		
		
		EmpleadoConstructor empleado=new EmpleadoConstructor(nombre,apellido,sue,fecha);
		
		empleado.aumentarSueldo(aumento);
		
		
		System.out.println(empleado);
		
		System.out.println("Quieres introducir un nuevo empleado:s/n");
		 continuar1=entrada.next();
		
			}
		
		
			System.out.println("cerrando el programa");
			entrada.close();
			
		

		}
		
	}
	
	

