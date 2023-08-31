import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Digite a nota para o filme ou -1 para encerrar: ");
            nota = leitura.nextDouble();
            if (nota != -1) {
                mediaAvaliacao += nota;
                totalDeNotas++;
            }
        }

        if (totalDeNotas == 0) {
            System.out.println("Não foi digitada nenhuma nota!");
        } else {
            System.out.println("Média de avaliações: " + mediaAvaliacao / totalDeNotas);
        }

    }
}