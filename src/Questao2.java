import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("QUESTÃO 2");
        System.out.println("Faça um algoritmo que solicite o nome da pessoa, sexo, sua idade, peso e altura em seguida");
        System.out.println(" apresente um relatório onde exiba os dados da pessoa e o seu IMC considere IMC da seguinte forma:");
        System.out.println("IMC É. IGUAL A (Massa / (H*H))");
        System.out.println("IMC É. IGUAL A (Massa / (H*H))");
        System.out.println("IMC < 18,5 = ABAIXO DO PESO");
        System.out.println("IMC < 25 = PESO NORMAL");
        System.out.println("IMC<30 = SOBRE PESO");
        System.out.println("IMC<35 = OBESO LEVE");
        System.out.println("IMC<40 = OBESO MODERADO");
        System.out.println("IMC>40 = OBSESO MORBIDO SE CUIDE AMIGO ");
        System.out.println("Digite Seu peso: ");
        float peso = scanner.nextFloat();
        System.out.println("Digite sua altura: ");
        float altura = scanner.nextFloat();
        float IMC = peso / (altura * altura);
        System.out.println("IMC é de: " + IMC);
    }
}
