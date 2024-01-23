package edu.menuClinica.servicios;

import java.util.List;

import dtos.EsclavoDto;
import java.util.Scanner;

public interface EsclavoInterfaz {
	
	public void registroEsclavo(List<EsclavoDto>listaAntigua);
	public EsclavoDto crearNuevoEsclavo();
}
