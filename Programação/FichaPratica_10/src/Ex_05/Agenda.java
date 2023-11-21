package Ex_05;

public class Agenda {
    Pessoa [] agenda = new Pessoa[100];


    public Agenda() {
    }

    public void addPessoa(Pessoa nova){
        for(int i = 0; i < agenda.length; i++ ){
            if(agenda[i] == null){
                agenda[i] = nova;
                return;
            }
        }
    }


    public void listarPessoas(){
        for(int i = 0; i < agenda.length; i++){
            if(agenda[i] != null){
                System.out.print("pessoa numero " + (i+1) + " ----> ");
                agenda[i].dadosPessoa();
            }
        }
    }
}
