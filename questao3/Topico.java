import java.util.ArrayList;
import java.util.List;

public class Topico {
    private String nome;
    private List<Observador> leitores = new ArrayList<>();

    public Topico(String nome) {
        this.nome = nome;
    }

    public void inscrever(Observador leitor) {
        leitores.add(leitor);
    }

    public void publicarNoticia(String noticia) {
        System.out.println("Publicando em " + nome + ": " + noticia);
        for (Observador leitor : leitores) {
            leitor.atualizar(noticia);
        }
    }
}