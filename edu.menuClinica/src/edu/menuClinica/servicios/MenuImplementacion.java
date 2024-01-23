package edu.menuClinica.servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz {

	@Override
	public int mostrarMenuYSeleccion(Scanner comunicacionTecladoM) {
		
		
		int opcionSeleccionada;
		
		System.out.println("##########################");
	System.out.println("0. Cerrar la aplicacion");
	System.out.println("1. Añadir nuevo paciente");
	System.out.println("2. Crear cuenta titular");
	System.out.println("3. Alta de paciente");
	System.out.println("4. Resumen de ingresos y altas");
	System.out.println("5. Historial del paciente");
	System.out.println("##################################");
	System.out.println("Elija una opción: ");
	
	opcionSeleccionada = comunicacionTecladoM.nextInt();
	
	
		return opcionSeleccionada;

	}

}
