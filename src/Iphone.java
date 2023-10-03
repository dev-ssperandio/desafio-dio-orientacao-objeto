public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    
    // Métodos da interface ReprodutorMusical
    public void tocar() {
        System.out.println("TOCANDO MUSICA");
    }
    
    public void pausar() {
        System.out.println("PAUSANDO MUSICA");
    }
    
    public void selecionarMusica() {
        System.out.println("SELECIONANDO MUSICA");
    }
    
    // Métodos da interface AparelhoTelefonico
    public void ligar() {
        System.out.println("LIGANDO ...");
    }

    public void atender() {
        System.out.println("ALÔ, QUEM FALA?");
    }
    
    public void iniciarCorreioVoz(){
        System.out.println("INICIANDO CORREIO DE VOZ");
    }
    
    // Métodos da interface NavegadorInternet
    public void exibirPagina() {
        System.out.println("EXIBINDO PÁGINA WEB");
    }
    
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA");
    }
    
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PÁGINA WEB");        
    }
}
