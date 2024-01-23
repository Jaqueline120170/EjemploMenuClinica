
package edu.menuClinica.controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dtos.PacienteDto;
import edu.menuClinica.servicios.MenuImplementacion;
import edu.menuClinica.servicios.MenuInterfaz;
import edu.menuClinica.servicios.OperativaImplementacion;
import edu.menuClinica.servicios.OperativaInterfaz;



/**
 * Clase por la que se accede a la aplicación
 * 29092023 - jrt
 * @author jrt
 */

public class Inicio {
/**
 * Método principal de nuestra aplicacion
 * define el procedimiento, es de donde toda acción sale 
 * y a donde toda acción llega cuando acaba.
 * 29092023
 * @author jrt
 * @param args
 */
	public static void main(String[] args) {
		
		PacienteDto paciente1= new PacienteDto();
		System.out.println(paciente1.toString());
		paciente1.setNombrePaciente("Jaqueline");
		System.out.println(paciente1.getNombrePaciente());
		
		List<PacienteDto> listaPaciente = new ArrayList <PacienteDto> ();
		ArrayList <PacienteDto> arraylistPaciente = new ArrayList<PacienteDto>();
		PacienteDto[]arrayPaciente= new PacienteDto [100];
		
		
		MenuInterfaz mi = new MenuImplementacion ();
		boolean cerrarMenu = false; 
		int seleccionUsuario;
		
      Scanner comunicacionTecladoM = new Scanner(System.in);
       
      while(!cerrarMenu) {
    	  
    	  seleccionUsuario = mi.mostrarMenuYSeleccion(comunicacionTecladoM); 
    	  
    	  switch(seleccionUsuario) {
    	  // estructura switch parte de una variable que depende de opcion seleccionada, el case que cumpla la condicion
    	  // será el case en el que entre
    	  case 0:
    		  System.out.print("[INFO] - Se ejecuta caso 0");
    		  cerrarMenu = true;
    		  break;
    		  //break se usa para salir de la estructura donde nos encontramos, que salga del switch y vuelva apreguntar que 
    		  // opcion se quiere hacer ahora
    	  case 1:
    		  System.out.print("Añadir nuevo paciente");
    		  break;
    	  case 2:
    		  System.out.print("Crear cuenta titular");
    		  break;
    	  case 3:
    		  
    		  
    		  break;
    	  case 4:System.out.print("[INFO] - Se ejecuta caso 4");
    		  break;
    	  case 5:
    		  System.out.print("[INFO] - Se ejecuta caso 5");
    		  break;
    		  default:
    	  }break;
      }
	}

}
