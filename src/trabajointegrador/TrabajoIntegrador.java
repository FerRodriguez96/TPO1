package trabajointegrador;

import controlador.*;
import vista.*;

public class TrabajoIntegrador {

    public static void main(String[] args) {
        Controlador c = new Controlador ();
        Agenda a = new Agenda (c);
        a.setVisible(true);
    }
    
}
