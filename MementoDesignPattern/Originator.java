public class Originator {

    // will take content/state as a string
    private String state;

    public Originator(String state) {
        this.state = state;
    }

    public void append(String text) {
        this.state += text;
    }

    public String getState() {
        return this.state;
    }

    public Memento createMemento() {
        return new Memento(this.state);
    }

    public void restoreFromMemento(Memento memento) {
        this.state = memento.getSavedState();
    }
}
