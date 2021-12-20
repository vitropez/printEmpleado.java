package empleado;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

public class SolicitarEmpleado {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		String continuar1 = "s";
		
		 ArrayList<EmpleadoConstructor> NuevoEmpleado = new ArrayList<EmpleadoConstructor>();
		while (continuar1.equalsIgnoreCase("s")) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("introduce el nombre del empleado");

			String nombre = sc.next();

			System.out.println("introduce el apellido del empleado");
			String apellido = sc.next();

			System.out.println("introduce el sueldo actual");
			int sue = sc.nextInt();

			System.out.println("introduce el aumento");
			int aumento = sc.nextInt();
		
			GregorianCalendar calendario = new GregorianCalendar();
			Date fecha = calendario.getTime();

			EmpleadoConstructor empleado = new EmpleadoConstructor(nombre, apellido, sue, fecha);

			empleado.aumentarSueldo(aumento);

			System.out.println(empleado.toString());
			
			NuevoEmpleado.add(empleado);
			try {
				FileWriter listaEmpleados=new FileWriter("C:\\carpetaPruebas\\miArchivo.txt");
				listaEmpleados.write(NuevoEmpleado.toString());
				listaEmpleados.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	


			System.out.println("Quieres introducir un nuevo empleado:s/n");
			continuar1 = entrada.next();
			
		}			
		
		
		System.out.println("cerrando el programa");
		entrada.close();
		
	}
}
