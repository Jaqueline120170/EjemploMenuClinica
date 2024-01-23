package edu.menuClinica.servicios;

import java.util.Scanner;

/**
 * Interfaz que enumera los métodos y funciolaidad del menú
 * @author jrt - 3102023
 */

public interface MenuInterfaz {
	
	/**
	 * Mostrar el menu al usuario y que recoja la opcion
	 * @author jrt - 3102023
	 * @return (int) el número de acción que selecciona el usuario
	 */
	public int mostrarMenuYSeleccion(Scanner comunicacionTecladoM);
	
}
