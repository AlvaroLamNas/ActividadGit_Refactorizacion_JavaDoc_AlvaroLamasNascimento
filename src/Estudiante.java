/**
 * Clase Estudiante
 * 
 * @author Alumno-DAW
 * @version 1.2
 */
public class Estudiante {
    private String nombreEstudiante;  
    private int idEstudiante;         
    private int edadEstudiante;   
    
    /**
     * Constructor de la clase estudiantes
     * @param nombreEstudiante
     * @param idEstudiante
     * @param edadEstudiante
     */
   
    public Estudiante(String nombreEstudiante, int idEstudiante, int edadEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
        this.idEstudiante = idEstudiante;
        this.edadEstudiante = edadEstudiante;
       
    }
    
    /**
     * Get nombre del estudiante
     * @return nombreEstudiante
     */

    public String getNombreEstudiante() {
		return nombreEstudiante;
	}
    
    /**
     * Set nombre del estudiante
     * @param nombreEstudiante
     */

	public void setNombreEstudiante(String nombreEstudiante) {
		this.nombreEstudiante = nombreEstudiante;
	}
	
	/**
	 * Get id del estudiante
	 * @return idEstudiante
	 */

	public int getIdEstudiante() {
		return idEstudiante;
	}
	
	/**
	 * Set del id del estudiante
	 * @param idEstudiante
	 */

	public void setIdEstudiante(int idEstudiante) {
		this.idEstudiante = idEstudiante;
	}
	
	/**
	 * Get edad estudiante
	 * @return edadEstudiante
	 */

	public int getEdadEstudiante() {
		return edadEstudiante;
	}
	
	/**
	 * Set edad estudiante
	 * @param edadEstudiante
	 */

	public void setEdadEstudiante(int edadEstudiante) {
		this.edadEstudiante = edadEstudiante;
	}

	/**
	 * Devuelve un string
	 * @return Datos del estudiante
	 */

	public String datosEstudiante() {
        return "Estudiante: " + nombreEstudiante + " (ID: " + idEstudiante + ") Edad: " + edadEstudiante;
    }
}
