public class iPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    public static void main(String[] args) throws Exception {
    
    
    
    }

    @Override
    public void atender() {
        System.out.println("Você está em uma chamada agora.");
        
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Você possui 9 novas mensagens.");
        
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Chamando "+ numero + " ...");
        
    }

    @Override
    public void adicionarAba() {
        System.out.println("Você está em uma nova aba");
        
    }

    @Override
    public void atualizarPagina() {
        System.out.println("atualizando a página.. \n página atualizada.");
        
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("acessando URL: "+ url);
        
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada"); 
        
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Você está ouvindo "+ musica);
        
    }

    @Override
    public void tocar() {
        System.out.println("Música tocando");
        
        
    }
}
