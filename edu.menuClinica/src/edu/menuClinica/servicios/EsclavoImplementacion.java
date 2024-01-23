package edu.menuClinica.servicios;

import java.util.List;
import dtos.EsclavoDto;
import java.util.Scanner;

public class EsclavoImplementacion implements EsclavoInterfaz {

	Scanner comunicacionTecladoM = new Scanner(System.in);
	
	public void registroEsclavo(List<EsclavoDto> listaAntigua) {

		listaAntigua.add(crearNuevoEsclavo());
	}

	public EsclavoDto crearNuevoEsclavo() {
		
		String nombreEsclavo;
		String apellidosEsclavo;
		String tlfEsclavo;
		
		System.out.println("Introduzca su nombre: ");
		nombreEsclavo = comunicacionTecladoM.next();
		System.out.println("Introduzca sus apellidos: ");
		apellidosEsclavo = comunicacionTecladoM.next();
		System.out.println("Introduzca su telefono: ");
		tlfEsclavo = comunicacionTecladoM.next();
		return new EsclavoDto(String nombreEsclavo, String apellidosEsclavo, String tlfEsclavo);
	}
}
