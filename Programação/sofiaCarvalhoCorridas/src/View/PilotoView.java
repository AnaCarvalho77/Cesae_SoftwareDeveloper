package View;

import Controllers.OficinaController;

import java.io.FileNotFoundException;

public class PilotoView {
    public PilotoView() {
    }

    public static void menuPiloto() throws FileNotFoundException {
        OficinaController oficinaControler = new OficinaController();
        oficinaControler.imprimirStock();
    }
}
