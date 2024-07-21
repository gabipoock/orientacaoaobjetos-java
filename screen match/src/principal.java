public class principal {
    public static void main(String[] args) { //só digitar psvm que dá auto complete
        movie meuFilme = new movie();
        meuFilme.nome = "Ghost";
        meuFilme.anoDeLancamento = 1990;
        meuFilme.duracaoEmMinutos = 120;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.pegaMedia());
    }
}
