import javax.swing.JOptionPane.*;

import static java.lang.Integer.decode;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;
import static java.lang.Long.parseLong;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Util {
    private Controle controle = new Controle();

    public void menu(){
        int opcao;

        String aux = "1-Cadastrar\n2-Pesquisar\n3-Listar\n4. Finalizar";

        while(true){
            opcao = parseInt(showInputDialog(aux));
            if(opcao==4)
                return;

            switch (opcao){
                case 1:
                    inserir();
                    break;
                case 2:
                    pesquisar();
                    break;
                case 3:
                    listar();
                    break;
                default:
                    showInputDialog(null,"opcao invalida");
            }
        }

    }

    private void inserir(){
        String nome , menu="1.Empregado Comissionado\n2.Empregado Horista\n3.Sair";
        long matricula;
        double totalDeVendas, comissao,valorDaHora;
        int totalDeHoras, opcao;

        while(true){
            opcao = parseInt(showInputDialog(menu));
            if(opcao==3)
                return;

            if (opcao == 1 || opcao == 2){
                nome=showInputDialog("Nome do empregado");
                matricula = parseLong(showInputDialog("Matricula do empregado:"));
                if(opcao == 1){
                    totalDeVendas = parseDouble(showInputDialog("Total de vendas: "));
                    comissao = parseDouble(showInputDialog("Comissao da venda: "));
                    controle.inserir(new EmpregadoComissionado(matricula,nome,totalDeVendas,comissao));
                }else{
                    totalDeHoras=parseInt(showInputDialog("Total de horas trabalhadas"));
                    valorDaHora=parseDouble(showInputDialog("Valor da hora trabalhada"));
                    controle.inserir(new EmpregadoHorista(matricula,nome,totalDeHoras,valorDaHora));
                }
            }
        }
    }

    private void pesquisar(){
        long matricula=parseLong(showInputDialog("Matricula para pesquisa:"));
        Empregado empregado = controle.pesquisar(matricula);
        if(empregado == null){
            showMessageDialog(null,"Empregado com matrícula não encontrada"+matricula);
        }else
            showMessageDialog(null,empregado.getDados());
    }

    private void listar(){
        String lista = controle.listar();
    }
}
