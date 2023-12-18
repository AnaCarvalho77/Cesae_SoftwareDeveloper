package Controllers;

import Domain.Momento;
import Domain.Pista;

public class PistaController {
    Momento curvaU = new Momento("curva U", 0.1,0.2);
    Momento curvaS = new Momento("curva S", 0.3, 0.4);
    Momento gravilhaPista = new Momento("gravilha pista", 0.2, 0.3);
    Momento borrachaPista = new Momento("borracha pista", 0.4,0.5);
    Momento lamaPista = new Momento("lama pista", 0.2,0.4);
    Momento animalPista = new Momento("animal pista", 0.5,0.6);

    Pista pista1F1 = new Pista("pista1F1",600,366,4.3,5);
    

}
