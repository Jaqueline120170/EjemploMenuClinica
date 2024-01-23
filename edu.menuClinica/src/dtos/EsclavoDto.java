package dtos;

public class EsclavoDto {
	
	String nombreEsclavo;
	String apellidosEsclavo;
	String tlfEsclavo;
	
	long idEsclavo;
	public long getIdEsclavo() {
		return idEsclavo;
	}
	public void setIdEsclavo(long idEsclavo) {
		this.idEsclavo = idEsclavo;
	}
	public String getNombreEsclavo() {
		return nombreEsclavo;
	}
	public void setNombreEsclavo(String nombreEsclavo) {
		this.nombreEsclavo = nombreEsclavo;
	}
	public String getApellidosEsclavo() {
		return apellidosEsclavo;
	}
	public void setApellidosEsclavo(String apellidosEsclavo) {
		this.apellidosEsclavo = apellidosEsclavo;
	}
	public String getTlfEsclavo() {
		return tlfEsclavo;
	}
	public void setTlfEsclavo(String tlfEsclavo) {
		this.tlfEsclavo = tlfEsclavo;
	}
	public EsclavoDto(String nombreEsclavo, String apellidosEsclavo, String tlfEsclavo, long idEsclavo) {
		super();
		this.nombreEsclavo = nombreEsclavo;
		this.apellidosEsclavo = apellidosEsclavo;
		this.tlfEsclavo = tlfEsclavo;
		this.idEsclavo = idEsclavo;
	}
	public EsclavoDto() {
		super();
	}
	@Override
	public String toString() {
		return "EsclavoDto [nombreEsclavo=" + nombreEsclavo + ", apellidosEsclavo=" + apellidosEsclavo + ", tlfEsclavo="
				+ tlfEsclavo + ", idEsclavo=" + idEsclavo + "]";
	}
	
	
	
	}



