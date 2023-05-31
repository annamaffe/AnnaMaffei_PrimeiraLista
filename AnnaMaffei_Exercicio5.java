/*
 * Ler idade e mostrar faixa etaria
 * Anna Clara
 * 09/05/23
 */
import java.util.Scanner;

public class AnnaMaffei_Exercicio5 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

    //recebendo um valor digitado pelo usario e guardando na memoria
    System.out.println("Digite uma idade: ");
    int idade = s.nextInt();

    //inicio da condição if para ver em qual faixa etaria a idade é adequada
    if (idade>=0) {
        if (idade<=12){
            System.out.println("Criança");
        } else if (idade<=19){
            System.out.println("Adolescente");
        } else if (idade<=65){
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }
    }else{
        //senao for nenhuma, sai e mostra essa mensagem
        System.out.println("Desculpe, número negativo");
    }
    s.close();
    }
}
