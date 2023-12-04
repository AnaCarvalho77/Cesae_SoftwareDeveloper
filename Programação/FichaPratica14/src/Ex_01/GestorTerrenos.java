package Ex_01;

import java.util.ArrayList;

public class GestorTerrenos {
    private String proprietario;
    private ArrayList<FiguraGeometrica> terrenos = new ArrayList<>();

    public GestorTerrenos(String proprietario) {
        this.proprietario = proprietario;
    }

    public void addTerreno(FiguraGeometrica terrenoNovo){
        this.terrenos.add(terrenoNovo);
    }

    public double calcularAreaTerrenos(){
        double areaTotal = 0;
        for(FiguraGeometrica i : this.terrenos){
            areaTotal += i.area();
        }
        return areaTotal;
    }
}
