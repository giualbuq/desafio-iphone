public class Main {
    public static void main(String[] args) {
        iPhone meuIPhone = new iPhone();

        // Testando Reprodutor Musical
        meuIPhone.selecionarMusica("Imagine - John Lennon");
        meuIPhone.tocar();
        meuIPhone.pausar();

        // Testando Aparelho Telefônico
        meuIPhone.ligar("11987654321");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        // Testando Navegador na Internet
        meuIPhone.exibirPagina("https://www.google.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}
