package edu.menuClinica.servicios;

import java.util.List;

import dtos.EsclavoDto;
import dtos.PacienteDto;

public interface PacienteInterfaz {
	
	public void registroPaciente (List<PacienteDto> listaPacientes, List<EsclavoDto>listaEsclavos);
	public void validacionPaciente (List<EsclavoDto> listaEsclavos,List<PacienteDto> listaPacientes);

}
