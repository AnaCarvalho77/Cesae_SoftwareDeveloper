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

    public void listarCatalogo(){
        for(Avioes i: catalogoAvioes){
            if(i instanceof Avioes){
                System.out.println("-----------------Aviao " + i + " ----------------");
                i.dadosAviao();
            }else{
                System.out.println("obleto não é uma instância de Avioes");
            }

        }

    }

}
