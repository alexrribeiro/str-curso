// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Este é o Screen Match!");

        System.out.println("Filme: Top Gun: Maverick");
        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80.
                Será que é bommmm?
                Ano de lançamento: 
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media / 2);
    }
}