package Ex_10;

public class Funcionario {
private String nome;
private Double salario;
private String departamento;


    public Funcionario(String nome, Double salario, String departamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    public void aumentarSalario(Double percentagem){
    this.salario *= (1 + (percentagem/100));
    System.out.println("com o aumento salarial de " + percentagem+ "%, o salário ficou em " + this.salario + " euros.");
}

public void exibirDados(){
    System.out.println("o funionário "+ this.nome + " do departamento " + this.departamento + " tem um salário de " + this.salario + " euros");
}

}
