import java.text.DecimalFormat;

public class Controle {
    private Empregado [] empregado = new Empregado[5];
    private int index=0;

    public void inserir(Empregado empregado){
        this.empregado[index++] = empregado;
    }

    public Empregado pesquisar(long matricula){
        for (int i = 0; i < index; i++) {
            if(empregado[i].matricula == matricula){
                return empregado[i];
            }
        }
        return null;
    }

    public String listar(){
        String aux = "";
        DecimalFormat df = new DecimalFormat("#,##0.00");
        for (int i = 0; i < index; i++) {
            aux+= empregado[i].getDados()+"\n";
            aux+="Salário R$ "+df.format(empregado[i].calcularSalario())+"\n";
            aux+="----------------------------------------";
        }

        return aux;
    }
}
