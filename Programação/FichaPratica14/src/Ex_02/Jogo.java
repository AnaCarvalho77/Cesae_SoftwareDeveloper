package Ex_02;

public class Jogo {
    public static void main(String[] args) {
        Personagem sofia = new Personagem("sofia", 5,3,2,Categoria.cavaleiro,"espada");
        Npc hulk = new Npc("hulk",1,1);
        Npc valdemort = new Npc("valdemort", 2,1);
        Npc stranger = new Npc("stranger", 4, 6);


        sofia.atacar(hulk);
        sofia.atacar(valdemort);
        sofia.atacar(stranger);

    }
}
