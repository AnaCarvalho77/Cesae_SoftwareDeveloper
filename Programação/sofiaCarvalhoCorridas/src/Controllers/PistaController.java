package Controllers;

import Domain.*;

import java.util.ArrayList;

/**
 * classe Pistacontroller para criar pista de corrida
 */
public class PistaController {


    /**
     * Instanciar objecto da Classe Momento para criar momento
     */
    Momento curvaU = new Momento("curva U", 0.1, 0.2);
    /**
     * Instanciar objecto da Classe Momento para criar momento
     */
    Momento curvaS = new Momento("curva S", 0.3, 0.4);
    /**
     * Instanciar objecto da Classe Momento para criar momento
     */
    Momento gravilhaPista = new Momento("gravilha pista", 0.2, 0.3);
    /**
     * Instanciar objecto da Classe Momento para criar momento
     */
    Momento borrachaPista = new Momento("borracha pista", 0.4, 0.5);
    /**
     * Instanciar objecto da Classe Momento para criar momento
     */
    Momento lamaPista = new Momento("lama pista", 0.2, 0.4);
    /**
     * Instanciar objecto da Classe Momento para criar momento
     */
    Momento animalPista = new Momento("animal pista", 0.5, 0.6);

    /**
     * Método para criar pistas que retorna um arraylist de pista de acordo com a especificidade do veiculo do piloto
     * @param pilotoAtual rece um piloto como parametro para saber qual o tipo de pistas a retirnar
     * @return Arraylist de pistas para o campeonato de acordo com a cetegoria do veiculo do piloto
     */
    public ArrayList<Pista> pistasCampeonato(Piloto pilotoAtual) {
        ArrayList<Pista> pistasCampeonato = new ArrayList<>();

        Veiculo veiculoPiloto = pilotoAtual.getVeiculoAtual();

        //se o veiculo for um carro
        if (veiculoPiloto instanceof Carro) {
            if (((Carro) veiculoPiloto).getTipoCarro().equals(TipoCarro.F1)) {// e se for da F1
                Pista pista1F1 = new Pista("pista1F1", 600, 400, 4300, 5);
                pista1F1.adicionarMomento(curvaU);
                pista1F1.adicionarMomento(gravilhaPista);
                pistasCampeonato.add(pista1F1);

                Pista pista2F1 = new Pista("pista2F1", 500, 409, 6000, 6);
                pista2F1.adicionarMomento(curvaS);
                pista2F1.adicionarMomento(borrachaPista);
                pistasCampeonato.add(pista2F1);

                Pista pista3F1 = new Pista("pista3F1", 550, 375, 4200, 5);
                pista3F1.adicionarMomento(curvaU);
                pista3F1.adicionarMomento(borrachaPista);
                pistasCampeonato.add(pista3F1);

                Pista pista4F1 = new Pista("pista4F1", 550, 389, 4100, 6);
                pista4F1.adicionarMomento(curvaS);
                pista4F1.adicionarMomento(gravilhaPista);
                pistasCampeonato.add(pista4F1);


            } else if (((Carro) veiculoPiloto).getTipoCarro().equals(TipoCarro.Rally)) {//se for de Rally
                Pista pista1Rally = new Pista("pista1Rally", 600, 490, 4300, 5);
                pista1Rally.adicionarMomento(curvaU);
                pista1Rally.adicionarMomento(lamaPista);
                pistasCampeonato.add(pista1Rally);

                Pista pista2Rally = new Pista("pista2Rally", 500, 356, 6000, 6);
                pista2Rally.adicionarMomento(curvaS);
                pista2Rally.adicionarMomento(animalPista);
                pistasCampeonato.add(pista2Rally);

                Pista pista3Rally = new Pista("pista3Rally", 550, 300, 4200, 5);
                pista3Rally.adicionarMomento(curvaU);
                pista3Rally.adicionarMomento(animalPista);
                pistasCampeonato.add(pista3Rally);

                Pista pista4Rally = new Pista("pista4Rally", 550, 301, 4200, 6);
                pista4Rally.adicionarMomento(curvaS);
                pista4Rally.adicionarMomento(lamaPista);
                pistasCampeonato.add(pista4Rally);

            } else if (((Carro) veiculoPiloto).getTipoCarro().equals(TipoCarro.GT)) {// se for de GT
                Pista pista1GT = new Pista("pista1GT", 600, 401, 4300, 5);
                pista1GT.adicionarMomento(curvaU);
                pista1GT.adicionarMomento(lamaPista);
                pistasCampeonato.add(pista1GT);

                Pista pista2GT = new Pista("pista2GT", 500, 299, 6000, 6);
                pista2GT.adicionarMomento(curvaS);
                pista2GT.adicionarMomento(animalPista);
                pistasCampeonato.add(pista2GT);

                Pista pista3GT = new Pista("pista3GT", 550, 305, 4200, 5);
                pista3GT.adicionarMomento(curvaU);
                pista3GT.adicionarMomento(animalPista);
                pistasCampeonato.add(pista3GT);

                Pista pista4GT = new Pista("pista4GT", 550, 278, 4100, 6);
                pista4GT.adicionarMomento(curvaS);
                pista4GT.adicionarMomento(lamaPista);
                pistasCampeonato.add(pista4GT);

            }
        } else if (veiculoPiloto instanceof Mota) {// se for uma mota
            Pista pista1Mota = new Pista("pista1Mota", 600, 98, 4300, 5);
            pista1Mota.adicionarMomento(curvaU);
            pista1Mota.adicionarMomento(gravilhaPista);
            pistasCampeonato.add(pista1Mota);

            Pista pista2Mota = new Pista("pista2Mota", 500, 158, 6000, 6);
            pista2Mota.adicionarMomento(curvaS);
            pista2Mota.adicionarMomento(borrachaPista);
            pistasCampeonato.add(pista2Mota);

            Pista pista3Mota = new Pista("pista3Mota", 550, 115, 4200, 5);
            pista3Mota.adicionarMomento(curvaU);
            pista3Mota.adicionarMomento(borrachaPista);
            pistasCampeonato.add(pista3Mota);

            Pista pista4Mota = new Pista("pista4F1", 550, 189, 4100, 6);
            pista4Mota.adicionarMomento(curvaS);
            pista4Mota.adicionarMomento(gravilhaPista);
            pistasCampeonato.add(pista4Mota);
        }
        return pistasCampeonato;
    }

    /**
     * Método para criar a pista final do campeonato
     * @return retorna uma pista final para o campeonato
     */
    public Pista pistaFinalCampeonato() {
        Pista pistaFinal = new Pista("pista final", 400, 370, 4300, 6);
        pistaFinal.adicionarMomento(curvaS);
        pistaFinal.adicionarMomento(curvaU);
        pistaFinal.adicionarMomento(borrachaPista);
        pistaFinal.adicionarMomento(animalPista);
        return pistaFinal;
    }

    /**
     * Método construtor vaxia da classe PistaController para instanciar objetos
     */
    public PistaController() {
    }

}
