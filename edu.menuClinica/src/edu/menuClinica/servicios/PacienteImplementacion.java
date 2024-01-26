package edu.menuClinica.servicios;

import java.util.List;

import dtos.EsclavoDto;
import dtos.PacienteDto;
import java.util.Scanner;

public class PacienteImplementacion implements PacienteInterfaz {
	
	Scanner comunicacionTecladoM = new Scanner(System.in);
	EsclavoInterfaz ei = new EsclavoImplementacion();

	public  void registroPaciente(List<PacienteDto> listaPacientes, List<EsclavoDto>listaEsclavos){
		
		PacienteDto pacienteNuevo = new PacienteDto();
		
		System.out.println("Introduzca el id del paciente: ");
		long idPaciente = comunicacionTecladoM.nextLong();
		System.out.println("Introduzca el nombre del paciente: ");
		String nombrePaciente = comunicacionTecladoM.next();
		System.out.println("Introduzca la edad del paciente: ");
		int edadPaciente = comunicacionTecladoM.nextInt();
		System.out.println("Introduzca la fecha de nacimiento del paciente: ");
		String fchNacimientoPaciente= comunicacionTecladoM.next();
		System.out.println("Introduzca el sexo del paciente (M/F): ");
		char sexoBiologicoPaciente = comunicacionTecladoM.next().charAt(0);
		System.out.println("Introduzca la especie del paciente: ");
		String especiePaciente = comunicacionTecladoM.next();
		System.out.println("Introduzca el id Esclavo  " );
		long idEsclavo = comunicacionTecladoM.nextLong();
		 
		PacienteDto paciente = new PacienteDto(idPaciente, nombrePaciente, edadPaciente, fchNacimientoPaciente,sexoBiologicoPaciente, especiePaciente,idEsclavo);
		
	}

	
	public void validacionPaciente (List<EsclavoDto> listaEsclavos,List<PacienteDto> listaPacientes ) {
		
		boolean existeEsclavo;
		for(Object EsclavoDto:listaEsclavos) {
			
			
			if(!existeEsclavo == esclavoNuevo.getidEsclavo){
				
				ei.registroEsclavo(listaEsclavos);
			}
			else {
				System.out.println("El esclavo ya existe en la lista.");
				registroPaciente(List<PacienteDto>listaPacientes);

			}
		}
		
			
	}


	
