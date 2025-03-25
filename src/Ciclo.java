/**
 * Clase ciclo
 * 
 * @author Alumno-DAW
 * @version 1.2
 */

import java.util.ArrayList;

public class Ciclo {
    private String nombreCiclo;
    private ArrayList<Estudiante> listaEstudiantes;
    
    /**
     * Contructor de la clase ciclo
     * @param nombreCiclo
     */

    public Ciclo(String nombreCiclo) {
        this.nombreCiclo = new String(nombreCiclo); 
        this.listaEstudiantes = new ArrayList<>();
    }
    
    /**
     * Get del nombre del ciclo
     * @return nombreCiclo
     */

    public String getNombreCiclo() {
		return nombreCiclo;
	}

    /**
     * Set del nombre del ciclo
     * @param nombreCiclo
     */
    
	public void setNombreCiclo(String nombreCiclo) {
		this.nombreCiclo = nombreCiclo;
	}
	
	/**
	 * Get de la lista de estudiantes
	 * @return listaEstudiantes
	 */

	public ArrayList<Estudiante> getListaEstudiantes() {
		return listaEstudiantes;
	}
	
	/**
	 * Set de la lista de estudiantes
	 * @param listaEstudiantes
	 */

	public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
		this.listaEstudiantes = listaEstudiantes;
	}

	/**
	 * Metodo de agregar un estudiante al ciclo
	 * @param e
	 */

	public void agregarEstudiante(Estudiante e) { 
    	listaEstudiantes.add(e); 
    }
	
	/**
	 * Devuelve una string con la informacion del ciclo y sus estudiantes
	 * @return Informacion del ciclo
	 */

    public String datosCiclo() {  
        String datos = "Ciclo: " + nombreCiclo + "\nEstudiantes:\n";
        for (Estudiante e : listaEstudiantes) {
            datos += e.datosEstudiante() + "\n";
        }
        return datos;
    }
}
