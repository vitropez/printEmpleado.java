package empleado;

import java.util.Date;

public class EmpleadoConstructor {


	private String name;
	private String apellidos;
	private Date fecha;
	private int sueldo;
	/*private int agno;
	private int mes;
	private int dia;*/

	

	public EmpleadoConstructor(String name, String apellidos,int sue, Date fecha) {
		super();
		this.name = name;
		this.apellidos = apellidos;
		this.fecha=fecha;
		this.sueldo=sue;
		
		
	}
	 public void aumentarSueldo(int aumento){
		 
		sueldo=sueldo*aumento;
			
		};
	
	
	



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getApellidos() {
		return apellidos;
	}



	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}



	public Date getFecha() {
		return fecha;
	}



	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}



	





	@Override
	public String toString() {
		return "EmpleadoConstructor [name=" + name + ", apellidos=" + apellidos + ", fecha=" + fecha + ", sueldo="
				+ sueldo + "]";
	}
	public int getSueldo() {
		return sueldo;
	}






	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	


	
	
}
