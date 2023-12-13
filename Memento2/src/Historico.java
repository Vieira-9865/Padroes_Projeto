// Caretaker (Zelador)
import java.util.ArrayList;
import java.util.List;

public class Historico {
    private List<Memento> mementos = new ArrayList<>();

    public void adicionarMemento(Memento memento) {
        mementos.add(memento);
    }

    public Memento obterMemento(int indice) {
        return mementos.get(indice);
    }
}