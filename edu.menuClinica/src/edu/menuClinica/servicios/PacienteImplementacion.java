package edu.menuClinica.servicios;

import java.util.List;

import dtos.EsclavoDto;
import dtos.PacienteDto;
import java.util.Scanner;

public class PacienteImplementacion implements PacienteInterfaz {
	
	Scanner comunicacionTecladoM = new Scanner(System.in);

	public void registroPaciente (List<PacienteDto> listaAntigua){
		
		
		long idPaciente;
		String nombrePaciente="aaaaa";
		int edadPaciente=0;
		String fchNacimientoPaciente="9999 12 31";
		char sexoBiologicoPaciente='a';
		String especiePaciente="aaaaa";
		long idEsclavo;
		
		System.out.println("Introduzca el id del paciente: ");
		idPaciente = comunicacionTecladoM.nextLong();
		System.out.println("Introduzca el nombre del paciente: ");
		nombrePaciente = comunicacionTecladoM.next();
		System.out.println("Introduzca la edad del paciente: ");
		edadPaciente = comunicacionTecladoM.nextInt();
		System.out.println("Introduzca la fecha de nacimiento del paciente: ");
		fchNacimientoPaciente= comunicacionTecladoM.next();
		System.out.println("Introduzca el sexo del paciente: ");
		sexoBiologicoPaciente = comunicacionTecladoM.next().charAt(0);
		System.out.println("Introduzca la especie del paciente: ");
		especiePaciente = comunicacionTecladoM.next();
		System.out.println("Introduzca su id: " );
		idEsclavo = comunicacionTecladoM.nextLong();
		
		return new Object PacienteDto(long idPaciente, String nombrePaciente, int edadPaciente, String fchNacimientoPaciente, char sexoBiologicoPaciente,String especiePaciente,long idEsclavo);
		
	}
	
	public void validacionPaciente (List<PacienteDto> listaAntigua) {
		EsclavoInterfaz ei = new EsclavoImplementacion();
		
		for(Object PacienteDto:listaAntigua) {
			
			if(!existePaciente(idPaciente){
				
				registroPaciente(listaAntigua);
			}
			else {
				System.out.println("El paciente ya existe en la lista.");
				registroPaciente();

			}
		}
		
			
	}

}
