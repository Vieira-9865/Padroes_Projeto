// Originator
public class TextEditor {
    private String text;

    public void write(String text) {
        this.text = text;
    }

    public TextMemento save() {
        return new TextMemento(text);
    }

    public void restore(TextMemento memento) {
        text = memento.getText();
    }

    public String getText() {
        return text;
    }
}