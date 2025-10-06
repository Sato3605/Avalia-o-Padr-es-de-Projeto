public class MainNoticias {
    public static void main(String[] args) {
        Topico esportes = new Topico("Esportes");
        Topico politica = new Topico("Política");

        Leitor joao = new Leitor("João");
        Leitor maria = new Leitor("Maria");

        esportes.inscrever(joao);
        politica.inscrever(joao);
        politica.inscrever(maria);

        esportes.publicarNoticia("Brasil vence Copa!");
        politica.publicarNoticia("Novo projeto de lei aprovado!");
    }
}