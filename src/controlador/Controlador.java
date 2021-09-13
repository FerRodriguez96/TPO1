package controlador;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Controlador {

    private final int[] dni = new int[10];
    private final String[] nombre = new String[10];
    private final String[] apellido = new String[10];
    private final LocalDate[] fechanac = new LocalDate[10];
    private final String[] direccion = new String[10];
    private final String[] telefono = new String[10];

    public Controlador() {

    }

    public void GrabarPersona(String textdni, String textnombre, String textapellido, String textfechanac, String textdireccion, String texttelefono, int id) {

        int lista = Integer.parseInt(textdni);
        dni[id] = lista;

        String lista2 = textnombre;
        nombre[id] = lista2;

        String lista3 = textapellido;
        apellido[id] = lista3;

        String entrada = textfechanac;
        LocalDate lista4 = LocalDate.parse(entrada, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        fechanac[id] = lista4;

        String lista5 = textdireccion;
        direccion[id] = lista5;

        String lista6 = texttelefono;
        telefono[id] = lista6;

    }
    
     public int mostrarDni(int id){
        return dni[id];
    }
     
     public String mostrarNombre(int id){
        return nombre[id];
    }
     
     public String mostrarApellido(int id){
        return apellido[id];
    }
     
    public LocalDate mostrarFechanac(int id){
        return fechanac[id];
    }

    public String mostrarDireccion(int id){
        return direccion[id];
    }
    
    public String mostrarTelefono(int id){
        return telefono[id];
    }
}
