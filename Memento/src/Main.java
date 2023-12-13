// Client
public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        History history = new History();

        editor.write("Primeira linha do texto.");

        // Salvando o estado atual
        history.saveMemento(editor.save());

        editor.write("Segunda linha do texto.");

        // Salvando o estado atual
        history.saveMemento(editor.save());

        editor.write("Terceira linha do texto.");

        // Salvando o estado atual
        history.saveMemento(editor.save());

        System.out.println("Texto atual: " + editor.getText());

        // Restaurando para o estado anterior
        editor.restore(history.getMemento(1));
        System.out.println("Texto após desfazer: " + editor.getText());
    }
}