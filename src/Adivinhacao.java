import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroSecreto = new Random().nextInt(100);
        int tentativasRestantes = 5;
        int palpite;
        boolean acertou = false;

        while (tentativasRestantes > 0) {
            System.out.println("Digite um palpite entre 0 e 100: ");
            palpite = sc.nextInt();

            tentativasRestantes--;

            if (palpite < numeroSecreto) {
                System.out.println("Seu palpite é menor do que o número secreto.");
                System.out.println("Tentativas restantes: " + tentativasRestantes);
            } else if (palpite > numeroSecreto) {
                System.out.println("Seu palpite é maior do que o número secreto.");
                System.out.println("Tentativas restantes: " + tentativasRestantes);
            } else if (palpite == numeroSecreto) {
                System.out.println("Parabéns! Você acertou!");
                acertou = true;
                break;
            }
        }

        if (!acertou) {
            System.out.println("O número secreto era: " + numeroSecreto);
        }
    }
}
