import java.util.ArrayList;

public class GestionCicloFP {
	
    private ArrayList<Estudiante> listaEstudiantes;
    private ArrayList<Ciclo> listaCiclos; 
    
    public GestionCicloFP() {
    	this.listaEstudiantes = new ArrayList<>();
    	this.listaCiclos = new ArrayList<>();
    }

    public void agregarEstudiante(String nombre, int id, int edad) {  
        listaEstudiantes.add(new Estudiante(nombre, id, edad));
    }

    public void agregarCiclo(String nombreCiclo) { 
    	listaCiclos.add(new Ciclo(nombreCiclo));
    }

    public void matricularEstudiante(int idEstudiante, String nombreCiclo) { 
        Estudiante est = null; 
        Ciclo cur = null;      

        for (Estudiante e : listaEstudiantes) { 
            if (e.getIdEstudiante() == idEstudiante) {
                est = e;
                break;
            }
        }

        for (Ciclo c : listaCiclos) { 
            if (c.getNombreCiclo().equals(nombreCiclo)) {
                cur = c;
                break;
            }
        }

        if (est != null && cur != null) {
            cur.agregarEstudiante(est);
        }
    }

    public void mostrarCiclos() { 
        for (Ciclo ciclo : listaCiclos) {
            System.out.println(ciclo.datosCiclo());
        }
    }

    public static void main(String[] args) {
        GestionCicloFP gestion = new GestionCicloFP();

        gestion.agregarEstudiante("Alicia", 1, 20);
        gestion.agregarEstudiante("Roberto", 2, 22);

        gestion.agregarCiclo("DAW");
        gestion.agregarCiclo("ASIR");

        gestion.matricularEstudiante(1, "DAW");
        gestion.matricularEstudiante(2, "ASIR");

        gestion.mostrarCiclos();
    }
}

