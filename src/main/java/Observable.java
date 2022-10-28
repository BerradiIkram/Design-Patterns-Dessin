

public interface Observable {
    void addObserver(Dessin observer);
    void removeObserver(Dessin observer);
    void notifyObservers();

}
