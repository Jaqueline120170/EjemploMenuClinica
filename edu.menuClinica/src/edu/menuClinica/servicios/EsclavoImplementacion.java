package edu.menuClinica.servicios;

import java.util.List;
import dtos.EsclavoDto;
import java.util.Scanner;

public class EsclavoImplementacion implements EsclavoInterfaz {

	Scanner comunicacionTecladoM = new Scanner(System.in);
	
	public void registroEsclavo(List<EsclavoDto> listaEsclavos) {

		listaEsclavos.add(crearNuevoEsclavo());
	}

	public EsclavoDto crearNuevoEsclavo() {
		
		EsclavoDto esclavoNuevo= new EsclavoDto();
		long idEsclavo;
		String nombreEsclavo;
		String apellidosEsclavo;
		String tlfEsclavo;
		
		System.out.println("Indique el id: ");
		long id = comunicacionTecladoM.nextLong();
		System.out.println("Introduzca su nombre: ");
		nombreEsclavo = comunicacionTecladoM.next();
		System.out.println("Introduzca sus apellidos: ");
		apellidosEsclavo = comunicacionTecladoM.next();
		System.out.println("Introduzca su telefono: ");
		tlfEsclavo = comunicacionTecladoM.next();
		
		EsclavoDto esclavo= new EsclavoDto(idEsclavo,nombreEsclavo, apellidosEsclavo, tlfEsclavo);
		
		return esclavo;
	}
}
