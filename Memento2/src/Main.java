public class Main {
    public static void main(String[] args) {
        // Criando um editor
        Editor editor = new Editor();
        Historico historico = new Historico();

        // Digitar e salvar estados
        editor.setConteudo("Primeiro conteúdo");
        historico.adicionarMemento(editor.criarMemento());

        editor.setConteudo("Segundo conteúdo");
        historico.adicionarMemento(editor.criarMemento());

        // Restaurar para o estado anterior (desfazer)
        editor.restaurarDeMemento(historico.obterMemento(0));
        System.out.println("Conteúdo após desfazer: " + editor.getConteudo());

        // Restaurar para o estado mais recente
        editor.restaurarDeMemento(historico.obterMemento(1));
        System.out.println("Conteúdo mais recente: " + editor.getConteudo());
    }
}