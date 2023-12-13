// Originator (Originador)
public class Editor {
    private String conteudo;

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public Memento criarMemento() {
        return new Memento(conteudo);
    }

    public void restaurarDeMemento(Memento memento) {
        this.conteudo = memento.getEstado();
    }
}