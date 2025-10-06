// Padrão de Projeto: PROTOTYPE
// Justificativa: Usamos Prototype para clonar modelos de documentos existentes,
// permitindo gerar cópias personalizadas sem recriar toda a estrutura do zero.

public abstract class Documento implements Cloneable {
    private String tipo;
    private String cor;
    private String fonte;
    private String logotipo;

    public Documento(String tipo, String cor, String fonte, String logotipo) {
        this.tipo = tipo;
        this.cor = cor;
        this.fonte = fonte;
        this.logotipo = logotipo;
    }

    public void setCor(String cor) { this.cor = cor; }
    public void setFonte(String fonte) { this.fonte = fonte; }
    public void setLogotipo(String logotipo) { this.logotipo = logotipo; }

    public void exibirInfo() {
        System.out.println(tipo + " [Cor: " + cor + ", Fonte: " + fonte + ", Logotipo: " + logotipo + "]");
    }

    public Documento clonar() throws CloneNotSupportedException {
        return (Documento) super.clone();
    }
}