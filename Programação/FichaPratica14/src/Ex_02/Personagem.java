package Ex_02;

public class Personagem extends Entidade{
    private int nivel;
    private Categoria categoria;
    private String arma;

    public Personagem(String nome, int vida, int forca, int nivel, Categoria categoria, String arma) {
        super(nome, vida, forca);
        this.nivel = nivel;
        this.categoria = categoria;
        this.arma = arma;
    }

    public void atacar(Npc entidadeNpc){
        do{
         entidadeNpc.setVida(entidadeNpc.getVida() - this.getForca());
         if(entidadeNpc.getVida() > 0 )
            this.setVida(this.getVida() - entidadeNpc.getForca());
        }while(this.getVida() >0 && entidadeNpc.getVida()>0);

        if(this.getVida() > 0){
            this.nivel++;
            this.setVida((int)(this.getVida()*1.1));
            System.out.println("Parabéns " + this.categoria + " " + this.getNome() + ", ganhou um combate contra um " + entidadeNpc.getNome() + " com o uso de " + this.arma +" e passa de nível e incrementa a vida e a força em 10%, restaurando a vida ao valor total mais incremento.");
        }else {
            System.out.println("Perdeu");
        }


    }

}
