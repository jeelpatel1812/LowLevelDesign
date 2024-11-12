import java.util.List;
import java.util.ArrayList;

public class CareTaker {
    public List<Memento> history;

    public CareTaker() {
        this.history = new ArrayList<>();
    }

    public void addMemento(Memento memento) {
        this.history.add(memento);
    }

    public Memento getMemento() {
        final int lastIndex = history.size() - 1;
        if (lastIndex > 0) {
            Memento lastOne = this.history.get(lastIndex - 1);
            history.remove(lastIndex);
            return lastOne;
        }

        return null;
    }
}
