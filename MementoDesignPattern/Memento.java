public class Memento {

    // We will take state as a string
    public String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getSavedState() {
        return this.state;
    }
}
