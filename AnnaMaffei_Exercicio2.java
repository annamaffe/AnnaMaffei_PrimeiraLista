/*
*Descrição: Algoritmo que leia 4 números, calcule o quadrado e some, depois mostre
*Autor: Anna Clara
*Data: 03/05/23
*/
import java.util.Scanner;

public class AnnaMaffei_Exercicio2 {
    public static void main(String args[]){

        //inicializacao das variaveis e do seu valor
        int resu;
        resu = 0;
        Scanner s = new Scanner(System.in);

    //recebendo um valor digitado pelo usario e guardando na memoria
    System.out.println("Digite o primeiro número: ");
    int n1 = s.nextInt();
    System.out.println("Digite o segundo número: ");
    int n2 = s.nextInt();
    System.out.println("Digite o terceiro número: ");
    int n3 = s.nextInt();
    System.out.println("Digite o quarto número: ");
    int n4 = s.nextInt();

    //variavel recebendo soma dos dos quadrados dos numeros do usuario
    resu = (n1*n1) + (n2*n2) + (n3*n3) + (n4*n4);
    System.out.println("O resultado é: \n" + resu);
    s.close();
    }
}
