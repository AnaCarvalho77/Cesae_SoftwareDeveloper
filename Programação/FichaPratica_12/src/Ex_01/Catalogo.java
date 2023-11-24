package Ex_01;

import java.util.ArrayList;

public class Catalogo {
    private ArrayList<Avioes> catalogoAvioes = new ArrayList<>();

    public Catalogo() {
    }

    public void adquirirAviao(Avioes aviaoNovo){
            catalogoAvioes.add(aviaoNovo);
    }
    public void removerAviao(Avioes aviaoNovo){
        catalogoAvioes.remove(aviaoNovo);
    }

    public double calcularTotalAvioes(){
        double total = 0;
        for(Avioes i: catalogoAvioes){
           total +=  i.getPreco();
        }
        return total;
    }

    public void listarCatalogo() {
        int j = 1;
        int w = 1;
        for (Avioes i : catalogoAvioes) {
            if (i instanceof JatoParticular) {
                System.out.println("-----------------Aviao " + j + " ----------------");
                i.dadosAviao();
                j++;
            }
            if (i instanceof AviaoCombate) {
                System.out.println("-----------------Aviao " + w + " ----------------");
                i.dadosAviao();
                w++;

            }
        }
    }

}
