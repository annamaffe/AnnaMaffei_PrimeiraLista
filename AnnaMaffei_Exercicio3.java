/*
*Descrição: Converter um valor para dólar
*Autor: Anna Clara
*Data: 03/05/23
*/
import java.util.Scanner;

public class AnnaMaffei_Exercicio3 {
    public static void main(String args[]){

        //inicializacao das variaveis e do seu valor
        double dolar, resu;
        resu = 0.0;
        dolar = 4.98;
        Scanner s = new Scanner(System.in);
    
    //recebendo um valor digitado pelo usario e guardando na memoria
    System.out.println("Digite um valor para converter para dolar: ");
    double valor = s.nextDouble();
    
    //variavel recebendo o valor digitado pelo usuario dividido pelo valor da variavel dolar
    resu = (valor/dolar);
    System.out.println("O resultado é: \n" + resu);
    s.close();
    }
}
