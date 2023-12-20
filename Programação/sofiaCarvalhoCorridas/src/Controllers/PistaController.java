package Controllers;

import Domain.*;

import java.util.ArrayList;

public class PistaController {
    Momento curvaU = new Momento("curva U", 0.1,0.2);
    Momento curvaS = new Momento("curva S", 0.3, 0.4);
    Momento gravilhaPista = new Momento("gravilha pista", 0.2, 0.3);
    Momento borrachaPista = new Momento("borracha pista", 0.4,0.5);
    Momento lamaPista = new Momento("lama pista", 0.2,0.4);
    Momento animalPista = new Momento("animal pista", 0.5,0.6);
        public ArrayList<Pista> pistasCampeonato(Piloto pilotoAtual){
            ArrayList<Pista> pistasCampeonato = new ArrayList<>();



            Veiculo veiculoPiloto = pilotoAtual.getVeiculoAtual();
            if(veiculoPiloto instanceof Carro){
                if(((Carro) veiculoPiloto).getTipoCarro().equals(TipoCarro.F1)){
                    Pista pista1F1 = new Pista("pista1F1",600,366,4300,5);
                    pista1F1.adicionarMomento(curvaU);
                    pista1F1.adicionarMomento(gravilhaPista);
                    pistasCampeonato.add(pista1F1);

                    Pista pista2F1 = new Pista("pista2F1", 500,370,6000,6);
                    pista2F1.adicionarMomento(curvaS);
                    pista2F1.adicionarMomento(borrachaPista);
                    pistasCampeonato.add(pista2F1);

                    Pista pista3F1 = new Pista("pista3F1", 550,368,4200,5);
                    pista3F1.adicionarMomento(curvaU);
                    pista3F1.adicionarMomento(borrachaPista);
                    pistasCampeonato.add(pista3F1);

                    Pista pista4F1 = new Pista("pista4F1", 550, 392, 4100,6);
                    pista4F1.adicionarMomento(curvaS);
                    pista4F1.adicionarMomento(gravilhaPista);
                    pistasCampeonato.add(pista4F1);


                }else if(((Carro) veiculoPiloto).getTipoCarro().equals(TipoCarro.Rally)){
                    Pista pista1Rally = new Pista("pista1Rally",600,900,4300,5);
                    pista1Rally.adicionarMomento(curvaU);
                    pista1Rally.adicionarMomento(lamaPista);
                    pistasCampeonato.add(pista1Rally);

                    Pista pista2Rally = new Pista("pista2Rally", 500,1080,6000,6);
                    pista2Rally.adicionarMomento(curvaS);
                    pista2Rally.adicionarMomento(animalPista);
                    pistasCampeonato.add(pista2Rally);

                    Pista pista3Rally = new Pista("pista3Rally", 550,850,4200,5);
                    pista3Rally.adicionarMomento(curvaU);
                    pista3Rally.adicionarMomento(animalPista);
                    pistasCampeonato.add(pista3Rally);

                    Pista pista4Rally = new Pista("pista4Rally", 550, 3920, 4200,6);
                    pista4Rally.adicionarMomento(curvaS);
                    pista4Rally.adicionarMomento(lamaPista);
                    pistasCampeonato.add(pista4Rally);

                }else if(((Carro) veiculoPiloto).getTipoCarro().equals(TipoCarro.GT)){
                    Pista pista1GT = new Pista("pista1GT",600,3660,4300,5);
                    pista1GT.adicionarMomento(curvaU);
                    pista1GT.adicionarMomento(lamaPista);
                    pistasCampeonato.add(pista1GT);

                    Pista pista2GT = new Pista("pista2GT", 500,3700,6000,6);
                    pista2GT.adicionarMomento(curvaS);
                    pista2GT.adicionarMomento(animalPista);
                    pistasCampeonato.add(pista2GT);

                    Pista pista3GT = new Pista("pista3GT", 550,3680,4200,5);
                    pista3GT.adicionarMomento(curvaU);
                    pista3GT.adicionarMomento(animalPista);
                    pistasCampeonato.add(pista3GT);

                    Pista pista4GT = new Pista("pista4GT", 550, 3920, 4100,6);
                    pista4GT.adicionarMomento(curvaS);
                    pista4GT.adicionarMomento(lamaPista);
                    pistasCampeonato.add(pista4GT);

                }
            }else if (veiculoPiloto instanceof Mota){
                Pista pista1Mota = new Pista("pista1Mota",600,3660,4300,5);
                pista1Mota.adicionarMomento(curvaU);
                pista1Mota.adicionarMomento(gravilhaPista);
                pistasCampeonato.add(pista1Mota);

                Pista pista2Mota = new Pista("pista2Mota", 500,3700,6000,6);
                pista2Mota.adicionarMomento(curvaS);
                pista2Mota.adicionarMomento(borrachaPista);
                pistasCampeonato.add(pista2Mota);

                Pista pista3Mota = new Pista("pista3Mota", 550,3680,4200,5);
                pista3Mota.adicionarMomento(curvaU);
                pista3Mota.adicionarMomento(borrachaPista);
                pistasCampeonato.add(pista3Mota);

                Pista pista4Mota = new Pista("pista4F1", 550, 3920, 4100,6);
                pista4Mota.adicionarMomento(curvaS);
                pista4Mota.adicionarMomento(gravilhaPista);
                pistasCampeonato.add(pista4Mota);
            }
            return pistasCampeonato;
        }


        public Pista pistaFinalCampeonato(Piloto pilotoAtual){
            Pista pistaFinal = new Pista("pista final",6000, 5000,4300,6);
            pistaFinal.adicionarMomento(curvaS);
            pistaFinal.adicionarMomento(curvaU);
            pistaFinal.adicionarMomento(borrachaPista);
            pistaFinal.adicionarMomento(animalPista);
           return pistaFinal;
        }
    public PistaController() {
    }

}
