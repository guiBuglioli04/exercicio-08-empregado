import java.text.DecimalFormat;

public class EmpregadoHorista extends Empregado{
    int totalDeHorasTrabalhadas;
    double valorDaHoraTrabalhada;

    public EmpregadoHorista(String nome, long matricula, int totalDeHorasTrabalhadas, double valorDaHoraTrabalhada) {
        super(nome, matricula);
        this.totalDeHorasTrabalhadas = totalDeHorasTrabalhadas;
        this.valorDaHoraTrabalhada = valorDaHoraTrabalhada;
    }

    public double calcularSalario(){
        return totalDeHorasTrabalhadas*valorDaHoraTrabalhada;
    }

    public String getDados(){
        DecimalFormat df = new DecimalFormat("0,00");
        String aux = super.getDados();
        aux+= "Total de horas trabalhas: "+df.format(totalDeHorasTrabalhadas)+"\n";
        aux+= "valor da hora trabalhada R$" +df.format(valorDaHoraTrabalhada) ;

        return aux;
    }

}
