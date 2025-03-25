public class Estudiante {
    private String nombreEstudiante;  
    private int idEstudiante;         
    private int edadEstudiante;       
   
    public Estudiante(String nombreEstudiante, int idEstudiante, int edadEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
        this.idEstudiante = idEstudiante;
        this.edadEstudiante = edadEstudiante;
       
    }

    public String getNombreEstudiante() {
		return nombreEstudiante;
	}

	public void setNombreEstudiante(String nombreEstudiante) {
		this.nombreEstudiante = nombreEstudiante;
	}

	public int getIdEstudiante() {
		return idEstudiante;
	}

	public void setIdEstudiante(int idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	public int getEdadEstudiante() {
		return edadEstudiante;
	}

	public void setEdadEstudiante(int edadEstudiante) {
		this.edadEstudiante = edadEstudiante;
	}



	public String datosEstudiante() {
        return "Estudiante: " + nombreEstudiante + " (ID: " + idEstudiante + ") Edad: " + edadEstudiante;
    }
}
