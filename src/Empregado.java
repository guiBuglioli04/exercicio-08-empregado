public abstract class Empregado extends Object {
    long matricula;
    String nome;

    public Empregado(String nome, long matricula){
        this.nome = nome;
        this.matricula = matricula;
    }


    public String getDados(){
        String aux = "";
        aux += "Matrícula: "+matricula+ "\n";
        aux += "Nome: "+nome+"\n";

        return aux;
    }

    public abstract double calcularSalario();
}
