/*
*Descrição: Algoritmo que leia 4 números, faça a soma e mostre
*Autor: Anna Clara
*Data: 03/05/23
*/

import java.util.Scanner;

public class AnnaMaffei_Exercicio1 {
    public static void main(String args[]){
        //inicializacao das variaveis e do seu valor
        int soma;
        soma = 0;
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

    //variavel recebendo soma dos numeros do usuario
    soma = (n1+n2+n3+n4);
    System.out.println("A soma é: \n" + soma);
    s.close();
    }
}
