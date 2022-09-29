import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("QUESTÃO 1");
        System.out.println("Faça um algoritmo que vai pedir dois números e depois apresentar os resultados");
        System.out.println("para as operações de soma, subtração, multiplicação e divisão destes números.");
        System.out.println("Digite x: ");
        float x = scanner.nextFloat();
        System.out.println("Digite y: ");
        float y = scanner.nextFloat();
        System.out.println("A soma entre "+x+" e "+y+" é de: "+(x+y));
        System.out.println("A subtração entre "+x+" e "+y+" é de: "+(x-y));
        System.out.println("A multiplicação entre "+x+" e "+y+" é de: "+(x*y));
        if (y==0) {
            System.out.println(x+" não pode ser divido por 0.");
        } else {
            System.out.println("A divisão entre "+x+" e "+y+" é de: "+(x/y));
        }

    }
}