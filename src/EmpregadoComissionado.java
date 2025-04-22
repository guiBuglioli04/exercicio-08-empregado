import java.text.DecimalFormat;

public class EmpregadoComissionado extends Empregado {
    double totalDeVendas,comissao;

    public EmpregadoComissionado(long matricula,String nome, double comissao, double totalDeVendas) {
        super(nome, matricula);
        this.comissao = comissao;
        this.totalDeVendas = totalDeVendas;
    }

    public double calcularSalario(){
        return totalDeVendas*comissao /100;
    }

    public String getDados(){
        DecimalFormat df = new DecimalFormat("#,##0.00");
        String aux = super.getDados();
        aux+= "Total de vendas R$"+df.format(totalDeVendas)+"\n";
        aux+= "Comissão: " +df.format(comissao) ;

        return aux;
    }

}
