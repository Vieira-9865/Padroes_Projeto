import java.util.ArrayList;
import java.util.List;

// Caretaker
public class History {
    private List<TextMemento> mementos = new ArrayList<>();

    public void saveMemento(TextMemento memento) {
        mementos.add(memento);
    }

    public TextMemento getMemento(int index) {
        return mementos.get(index);
    }
}

