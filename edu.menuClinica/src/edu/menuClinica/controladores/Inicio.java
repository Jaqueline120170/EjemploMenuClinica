
package edu.menuClinica.controladores;

import java.util.Scanner;

import edu.menuClinica.servicios.MenuImplementacion;
import edu.menuClinica.servicios.MenuInterfaz;



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
		
		int seleccionUsuario;
      boolean cerrarMenu = false; 
      Scanner comunicacionTecladoM = new Scanner(System.in);
      MenuInterfaz mi = new MenuImplementacion ();

      
      while(!cerrarMenu) {
    	  
    	  seleccionUsuario = mi.mostrarMenuYSeleccion(comunicacionTecladoM); 
    	  
    	  switch(seleccionUsuario) {
    	  case 0:
    		  System.out.print("[INFO] - Se ejecuta caso 0");
    		  cerrarMenu = true;
    		  break;
    	  case 1:
    		  System.out.print("[INFO] - Se ejecuta caso 1");
    		  break;
    	  case 2:
    		  System.out.print("[INFO] - Se ejecuta caso 2");
    		  break;
    	  case 3:
    		  System.out.print("[INFO] - Se ejecuta caso 3");
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
