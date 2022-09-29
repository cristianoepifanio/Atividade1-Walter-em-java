import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        //Declaração da função scanner
        Scanner scanner = new Scanner(System.in);

        //Enunciado da questão

        System.out.println("QUESTÃo 3");
        System.out.println(" Faça um algoritmo com as seguintes opções: Vote na mais simpática:");
        System.out.println("1- Docinho");
        System.out.println("2- Lindinha");
        System.out.println("3- Florzinha");
        System.out.println("0- Sair");
        System.out.println("Ao final, apresente a quantidade de votos de cada uma delas e mais simpática.");

        //declaração de variáveis
        int totalvotos = 0;
        int votosinvalidos = 0;
        int voto = 1;
        int docinho = 0;
        int lindinha = 0;
        int florzinha = 0;

        //Estrutura de repetição dos votos
        while (voto != 0){
            System.out.println("Digite seu voto: ");
            voto = scanner.nextInt();

            //Estruturação dos casos
            switch (voto){
                case 1:
                    docinho += 1;
                    break;
                case 2:
                    lindinha +=1;
                    break;
                case 3:
                    florzinha +=1;
                    break;
                default:
                    System.out.println("número inválido.");
                    votosinvalidos +=1;
                    break;
            }
            totalvotos +=1;
        }

        //Saída: Resultado da votação
        System.out.println("O total de votos foi de "+totalvotos+" votos, onde "+votosinvalidos+" foram inválidos e:");
        System.out.println("Docinho recebeu "+docinho+" votos");
        System.out.println("Lindinha recebeu "+lindinha+" votos");
        System.out.println("Florzinha recebeu "+florzinha+" votos");

        //Condicional para declarar a venccedora
        if (docinho > lindinha && docinho > florzinha) {
            System.out.println("Docinho ganhou com "+docinho+" votos.");
        } else if (lindinha > docinho && lindinha > florzinha) {
            System.out.println("Lindinha ganhou com "+lindinha+" votos.");
        } else if (florzinha > lindinha && florzinha > docinho) {
            System.out.println("Florzinha ganhou com "+florzinha+" votos.");

        }
    }
}
