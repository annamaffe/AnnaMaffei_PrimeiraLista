/*
 * Calcular o perimetro de um circulo
 * Anna Clara
 * 09/05/23
 */
import java.util.Scanner;

 public class AnnaMaffei_Exercicio6 {
    public static void main(String args[]){
        
        //inicializacao das variaveis e do seu valor
        double peri;
        peri = 0.0;
        Scanner s = new Scanner(System.in);
        
        //recebendo um valor digitado pelo usario e guardando na memoria
        System.out.println("Digite o raio: ");
        int raio = s.nextInt();

        //variavel recebendo o valor do raio digitado pelo usuario e fazendo vezes uma formula
        peri = ((2*3.14)*raio);

        System.out.println("O perimetro é: \n" + peri);
        s.close();
    }
}
