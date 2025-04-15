import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        Empregado [] e = new Empregado[3];

        e[0]= new EmpregadoComissionado("Alberto", 1,10,1000);
        e[1]= new EmpregadoHorista("Patricia",2,200,180);
        e[2]= new EmpregadoComissionado("Selmini",3,10,100);




        for(Empregado i:e){
            System.out.println(i.getDados());
            System.out.println(i.calcularSalario()+"\n");
            x.close();
        }
    }
}
