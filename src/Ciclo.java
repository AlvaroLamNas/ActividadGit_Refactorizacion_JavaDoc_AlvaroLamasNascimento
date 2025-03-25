import java.util.ArrayList;

public class Ciclo {
    private String nombreCiclo;
    private ArrayList<Estudiante> listaEstudiantes;

    public Ciclo(String nombreCiclo) {
        this.nombreCiclo = new String(nombreCiclo); 
        this.listaEstudiantes = new ArrayList<>();
    }
    
    

    public String getNombreCiclo() {
		return nombreCiclo;
	}

	public void setNombreCiclo(String nombreCiclo) {
		this.nombreCiclo = nombreCiclo;
	}

	public ArrayList<Estudiante> getListaEstudiantes() {
		return listaEstudiantes;
	}

	public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
		this.listaEstudiantes = listaEstudiantes;
	}



	public void agregarEstudiante(Estudiante e) { 
    	listaEstudiantes.add(e); 
    }

    public String datosCiclo() {  
        String datos = "Ciclo: " + nombreCiclo + "\nEstudiantes:\n";
        for (Estudiante e : listaEstudiantes) {
            datos += e.datosEstudiante() + "\n";
        }
        return datos;
    }
}
