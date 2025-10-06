public class MainDocumentos {
    public static void main(String[] args) throws CloneNotSupportedException {
        ModeloCurriculo modeloPadrao = new ModeloCurriculo("Branco", "Arial", "LogoEmpresa");

        Documento personalizado = modeloPadrao.clonar();
        personalizado.setCor("Azul");
        personalizado.setLogotipo("LogoCliente");

        System.out.println("Modelo Original:");
        modeloPadrao.exibirInfo();

        System.out.println("\nModelo Personalizado:");
        personalizado.exibirInfo();
    }
}